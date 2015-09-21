/*
 * Strategy pattern is applied in this class.
 */
package cs586Project;

public class Action9_2 extends Action9DisplayBalance {

	@Override
	public void displayBalance(DataStore ds) {
		// TODO Auto-generated method stub
		System.out.println("The balance in your account is  " + ds.getFloatBalance() + "  dollars. ");
	}

}
