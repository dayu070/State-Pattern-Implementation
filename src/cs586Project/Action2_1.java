/*
 * Strategy pattern is applied in this class.
 */
package cs586Project;

public class Action2_1 extends Action2StoreBalance {

	@Override
	public void storeBalance(DataStore ds) {
		// TODO Auto-generated method stub
		ds.setIntBalance(ds.getTempIntBalance());
	}

}
