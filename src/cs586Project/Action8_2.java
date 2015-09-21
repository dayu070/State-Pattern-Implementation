/*
 * Strategy pattern is applied in this class.
 */
package cs586Project;

public class Action8_2 extends Action8MakeDeposit {

	@Override
	public void makeDeposit(DataStore ds) {
		// TODO Auto-generated method stub
		float temp = ds.getFloatBalance() + ds.getTempFloatD();
		ds.setFloatBalance(temp);
	}

}
