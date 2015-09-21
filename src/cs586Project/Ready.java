/*
 * De-centralized state pattern is applied in this class.
 */
package cs586Project;

public class Ready extends State {
	public Ready(MDA_EFSM me, OutputProcessor op)
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
		 op.makeDeposit();                           //One action
	}
	
	public void belowMinBalance()
	{
		
	}
	
	public void aboveMinBalance()
	{
		
	}
	
	public void exit()
	{
		me.changeState(MDA_EFSM.IDLE);
		op.ejectCard();								//One action
	}
	
	public void balance()
	{
		op.displayBalance();							//One action
	}
	
	public void withdraw()
	{
		me.changeState(MDA_EFSM.SONE);			
		op.withdrawMoney();							//Withdraw action
	}
	
	public void lock()
	{
		me.changeState(MDA_EFSM.LOCKED);
		op.lockMessage();							//One action
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
