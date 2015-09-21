/*
 * De-centralized state pattern is applied in this class.
 */
package cs586Project;

public abstract class State {
	protected MDA_EFSM me;
	
	protected OutputProcessor op;
	
	public abstract void card();
	
	public abstract void incorrectPin(int max);
	
	public abstract void correctPinBelowMin();
	
	public abstract void correctPinAboveMin();
	
	public abstract void deposit();
	
	public abstract void belowMinBalance();
	
	public abstract void aboveMinBalance();
	
	public abstract void exit();
	
	public abstract void balance();
	
	public abstract void withdraw();
	
	public abstract void lock();
	
	public abstract void unlockAboveMin();
	
	public abstract void unlockBelowMin();
}
