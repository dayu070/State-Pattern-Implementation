/*
 * Strategy pattern is applied in this class.
 */
package cs586Project;

public class Action13_2 extends Action13Penalty {

	@Override
	public void penalty(DataStore ds) {
		// TODO Auto-generated method stub
		ds.setFloatBalance(ds.getFloatBalance() - 20);
	}

}
