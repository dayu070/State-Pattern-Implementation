/*
 * De-centralized state pattern is applied in this class.
 */
package cs586Project;

public class CheckPin extends State{
	public CheckPin(MDA_EFSM me, OutputProcessor op)
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
		if(me.getAttempts() < max)
		{
			me.setAttempts(me.getAttempts()+1);
			op.incorrectPinMessage();										//One Action
		}
		else
		{
			me.changeState(MDA_EFSM.IDLE);
			op.incorrectPinMessage();								//Three Actions
			op.tooManyAttemptsMessage();
			op.ejectCard();
		}
	}
	
	public void correctPinBelowMin()
	{
		me.changeState(MDA_EFSM.OVERDRAWN);
		op.displayMenu();									//One Action
	}
	
	public void correctPinAboveMin()
	{
		me.changeState(MDA_EFSM.READY);
		op.displayMenu();									//One Action
	}
	
	public void deposit()
	{
		System.err.println("You can't do that yet! ");
	}
	
	public void belowMinBalance()
	{
		System.err.println("You can't do that yet! ");
	}
	
	public void aboveMinBalance()
	{
		System.err.println("You can't do that yet! ");
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
