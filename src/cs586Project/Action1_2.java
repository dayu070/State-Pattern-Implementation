/*
 * Strategy pattern is applied in this class.
 */
package cs586Project;

public class Action1_2 extends Action1StorePin{

	@Override
	public void storePin(DataStore ds) {
		// TODO Auto-generated method stub
		ds.setIntPin(ds.getTempIntPin());
	}

}
