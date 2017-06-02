/**
 * 
 */
package classes;
import java.io.File;
import java.io.FileInputStream;

//import org.antlr.runtime.CommonTokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
 * @author JBlad
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream(new File("ejemplo.txt")));
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		ipsumUNLexer lexer= new ipsumUNLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ipsumUNParser parser = new ipsumUNParser(tokens);
		ParseTree	tree =  parser.commands();
		
		config_visitor<Object> loader = new config_visitor<Object>();
		loader.visit(tree);
	}

}