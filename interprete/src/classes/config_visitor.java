package classes;
import java.util.HashMap;


import classes.ipsumUNParser.*;



public class config_visitor <T> extends ipsumUNBaseVisitor<T>  {
	@Override
	public T visitRepetiv(RepetivContext ctx) {
		int times = (int)(double)(Double) visitExpr(ctx.expr());
		for (int i = 0; i < times; i++) {
			visitComandos(ctx.comandos());
		}
		return null;
	}
	
	
	@Override
	public T visitPrincipal(PrincipalContext ctx){
		Main.principal =ctx.ID().getText();
		System.out.println(ctx.ID().getText());
		ComandosContext aux=ctx.comandos();
		return visitComandos(aux);
	}
	
	
	
	@Override
	public T visitCondicional(CondicionalContext ctx) {
		String op = ctx.ROP().getText();
		//System.out.println("el valor de op es: ");
		//System.out.println(op);
		double num1 = (Double)visitExpr(ctx.expr(0));
		double num2 = (Double)visitExpr(ctx.expr(1));
		
		
		Boolean ans = null;
		
		switch(op){
		case "<":
			ans = num1<num2;
			break;
		case "<=":
			ans = num1<num2;
			break;
		case ">":
			ans = num1>num2;
			break;
		case ">=":
			ans = num1>=num2;
		case"==":
			ans= Math.abs(num1-num2) < 0.000000001;
			break;
		case "!=":
			ans= Math.abs(num1-num2) > 0.000000001;
			break;
		}
		if (ans){
			visitComandos(ctx.comandos());
		}
		return null;
	}
	
			HashMap<String, Object> tablasimbolos = new HashMap<>();
			
	@Override
	public T visitComando(ComandoContext ctx) {
		if (ctx.impriexpr() != null){
			Double ans = (Double)visitExpr(ctx.impriexpr().expr());
			int aux = (int)Math.floor(ans);
			
			if(ans - aux <1e-9){
				System.out.println(aux);
			}else{
				System.out.println(ans);
			}
		}else if(ctx.DEFINIR() != null){
			String name = ctx.ID().getText();
			if(tablasimbolos.get(name) != null){
				int line = ctx.ID().getSymbol().getLine();
				int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
				System.err.printf("<%d:%d> Error semantico, la variable con nombre \"" +name+"\" ya fue declarada.\n",line,col);
				System.exit(-1);
			} else {
				tablasimbolos.put(name, visitExpr(ctx.expr()));
			}
		}else {
			return visitChildren(ctx);
		}
		return super.visitComando(ctx);
	}
	@Override
	public T visitExpr(ExprContext ctx) {
		if (ctx.DOUBLE() != null) {
			Double num = new Double(ctx.DOUBLE().getText());
			//System.out.println(num);
			return(T) num;	
		} else if (ctx.PIZQ() != null){
			return visitExpr(ctx.expr(0));
		}else if (ctx.ID() != null) {
			String name =ctx.ID().getText();
			Object value;
			if ((value=tablasimbolos.get(name)) == 	null) {
				int line = ctx.ID().getSymbol().getLine();
				int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
				//podría ser en .out tambien
				System.err.printf("<%d:%d> Error semantico, la variable con nombre \"" +name+"\" ya fue declarada.\n",line,col);
				System.exit(-1);
				return null;
			}else {
				return (T) value;
			}
		}else {
			String op = (ctx.MULOP() != null ? ctx.MULOP().getText() : ctx.SUMOP().getText());
			Double num1 = (Double) visitExpr(ctx.expr(0));
			Double num2 = (Double) visitExpr(ctx.expr(1));
			Double ans = null;
			
			switch (op){
			case "+":
				ans = num1 + num2;
				break;
			case "-":
				ans = num1 - num2;
				break;
			case "*":
				ans = num1 * num2;
				break;
			case "/":
				ans = num1 / num2;
				break;
			}
			//System.out.println(ans);
			return (T) (Double) ans;
		}
		
		
		}
	
	
}


