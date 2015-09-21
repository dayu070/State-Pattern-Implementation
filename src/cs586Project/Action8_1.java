/*
 * Strategy pattern is applied in this class.
 */
package cs586Project;

public class Action8_1 extends Action8MakeDeposit {

	@Override
	public void makeDeposit(DataStore ds) {
		// TODO Auto-generated method stub
		int temp = ds.getIntBalance() + ds.getTempIntD();
		ds.setIntBalance(temp);
	}

}
