/*
 * Strategy pattern is applied in this class.
 */
package cs586Project;

public class Action13_1 extends Action13Penalty {

	@Override
	public void penalty(DataStore ds) {
		// TODO Auto-generated method stub
		ds.setIntBalance(ds.getIntBalance() - 10);
	}

}
