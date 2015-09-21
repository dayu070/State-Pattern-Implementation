/*
 * De-centralized state pattern is applied in this class.
 */
package cs586Project;

public class MDA_EFSM {
	public final static int IDLE = 0;
	public final static int CHECKPIN = 1;
	public final static int READY = 2;
	public final static int OVERDRAWN = 3;
	public final static int LOCKED = 4;
	public final static int SONE = 5;

	private int attempts;
	private State currentState;
	private State[] states;
	private OutputProcessor op;
	
	public MDA_EFSM(OutputProcessor op)
	{
		this.op = op;
	}
	
	public void create()
	{
		attempts = 0;
		states = new State[6];		                  //  0-idle  1-CheckPin  2-Ready  3-Overdrawn  4-Locked  5-S1
		states[0] = new Idle(this, op);
		states[1] = new CheckPin(this, op);
		states[2] = new Ready(this, op);
		states[3] = new Overdrawn(this, op);
		states[4] = new Locked(this, op);
		states[5] = new S1(this, op);
		currentState = states[IDLE];
	}
	
	public void card()
	{
		currentState.card();
	}
	
	public void incorrectPin(int max)
	{
		currentState.incorrectPin(max);
	}
	
	public void correctPinBelowMin()
	{
		currentState.correctPinBelowMin();
	}
	
	public void correctPinAboveMin()
	{
		currentState.correctPinAboveMin();
	}
	
	public void deposit()
	{
		currentState.deposit();
	}
	
	public void belowMinBalance()
	{
		currentState.belowMinBalance();
	}
	
	public void aboveMinBalance()
	{
		currentState.aboveMinBalance();
	}
	
	public void exit()
	{
		currentState.exit();
	}
	
	public void balance()
	{
		currentState.balance();
	}
	
	public void withdraw()
	{
		currentState.withdraw();
	}
	
	public void lock()
	{
		currentState.lock();
	}
	
	public void unlockAboveMin()
	{
		currentState.unlockAboveMin();
	}
	
	public void unlockBelowMin()
	{
		currentState.unlockBelowMin();
	}
	
	public void changeState(int n)
	{
		currentState = states[n];
	}
	
	public int getAttempts()
	{
		return attempts;
	}
	
	public void setAttempts(int x)
	{
		attempts = x;
	}
}
