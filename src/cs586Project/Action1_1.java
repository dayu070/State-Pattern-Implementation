/*
 * Strategy pattern is applied in this class.
 */
package cs586Project;

public class Action1_1 extends Action1StorePin {

	@Override
	public void storePin(DataStore ds) {
		// TODO Auto-generated method stub
		ds.setStringPin(ds.getTempStringPin());
	}

}
