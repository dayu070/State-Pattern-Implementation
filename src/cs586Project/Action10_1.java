/*
 * Strategy pattern is applied in this class.
 */
package cs586Project;

public class Action10_1 extends Action10WithdrawMoney {

	@Override
	public void withdrawMoney(DataStore ds) {
		// TODO Auto-generated method stub
		int temp = ds.getIntBalance() - ds.getTempIntW();
		ds.setIntBalance(temp);
	}

}
