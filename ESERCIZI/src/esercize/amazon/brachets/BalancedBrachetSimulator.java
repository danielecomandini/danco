package esercize.amazon.brachets;

import java.util.Stack;

import core.Input;
import core.Output;
import core.TestSimulator;

public class BalancedBrachetSimulator extends TestSimulator {

	@Override
	public Output solve(Input input) {
		boolean result = true;
		String equation = ( ( BalancedBrachetInput ) input ).getEquation();
		
		Stack<String> expectedClosingBrachet = new Stack<String>();
		
		if( equation != null && equation.length() > 0 ) {
			int equationLength = equation.length();
			
			for( int i=0; i<equationLength; i++ ) {
				String element = "" + equation.charAt( i );
				switch ( element ) {
				case "{":
					expectedClosingBrachet.push( "}" );
					break;
				case "[":
					expectedClosingBrachet.push( "]" );
					break;
				case "(":
					expectedClosingBrachet.push( ")" );
					break;
				case "}":
				case "]":
				case ")":
					result = checkForClosing( expectedClosingBrachet , element );
					if( !result ) {
						return new BalancedBrachetOutput( result );
					}
					break;
				default:
					break;
				}
			}
		}
		
		if( expectedClosingBrachet.size() > 0 ) {
			return new BalancedBrachetOutput( false );
		} else {
			return new BalancedBrachetOutput( true );
		}
	}

	private boolean checkForClosing(Stack<String> expectedClosingBrachet, String element) {
		return expectedClosingBrachet.size() > 0 && element.equals( expectedClosingBrachet.pop() );
	}

}
