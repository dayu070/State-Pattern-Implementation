/*
 * De-centralized state pattern is applied in this class.
 */
package cs586Project;

public class S1 extends State {
	public S1(MDA_EFSM me, OutputProcessor op)
	{
		this.me = me;
		this.op = op;
	}
	
	public void card()
	{
		System.err.println("You can't do that yet! ");
	}
	
	public void incorrectPin(int max)
	{
		System.err.println("You can't do that yet! ");
	}
	
	public void correctPinBelowMin()
	{
		System.err.println("You can't do that yet! ");
	}
	
	public void correctPinAboveMin()
	{
		System.err.println("You can't do that yet! ");
	}
	
	public void deposit()
	{
		System.err.println("You can't do that yet! ");
	}
	
	public void belowMinBalance()
	{
		me.changeState(MDA_EFSM.OVERDRAWN);
		op.penalty();						//Penalty action
	}
	
	public void aboveMinBalance()
	{
		me.changeState(MDA_EFSM.READY);
	}
	
	public void exit()
	{
		System.err.println("You can't do that yet! ");
	}
	
	public void balance()
	{
		System.err.println("You can't do that yet! ");
	}
	
	public void withdraw()
	{
		System.err.println("You can't do that yet! ");
	}
	
	public void lock()
	{
		System.err.println("You can't do that yet! ");
	}
	
	public void unlockAboveMin()
	{
		System.err.println("You can't do that yet! ");
	}
	
	public void unlockBelowMin()
	{
		System.err.println("You can't do that yet! ");
	}
}
