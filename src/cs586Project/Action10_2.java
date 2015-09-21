/*
 * Strategy pattern is applied in this class.
 */
package cs586Project;

public class Action10_2 extends Action10WithdrawMoney {

	@Override
	public void withdrawMoney(DataStore ds) {
		// TODO Auto-generated method stub
		float temp = ds.getFloatBalance() - ds.getTempFloatW();
		ds.setFloatBalance(temp);
	}

}
