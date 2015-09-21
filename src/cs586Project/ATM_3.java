package cs586Project;

public class ATM_3 {
	private MDA_EFSM me;
	private DataStore ds;
	
	public ATM_3(MDA_EFSM me, DataStore ds)
	{
		this.me = me;
		this.ds = ds;
	}
	
	public void create()
	{
		me.create();
	}
	
	public void card(int balance, int pin)
	{
		ds.setTempIntBalance(balance);
		ds.setTempIntPin(pin);
		me.card();
	}
	
	public void deposit(int d)
	{
		ds.setTempIntD(d);
		me.deposit();
		if(ds.getIntBalance() < 100)
			me.belowMinBalance();
		else
			me.aboveMinBalance();
	}
	
	public void withdraw(int w)
	{
		ds.setTempIntW(w);
		if(ds.getIntBalance() > w)
			me.withdraw();
		if(ds.getIntBalance() < 100)
			me.belowMinBalance();
		else
			me.aboveMinBalance();
	}
	
	public void pin(int x)
	{
		if(ds.getIntPin() == x)
		{
			if(ds.getIntBalance() < 100)
				me.correctPinBelowMin();
			else
				me.correctPinAboveMin();
		}
		else
			me.incorrectPin(0);
	}
	
	public void exit()
	{
		me.exit();
	}
	
	public void balance()
	{
		me.balance();
	}
	
	public void lock()
	{
		me.lock();
	}
	
	public void unlock()
	{
		if(ds.getIntBalance() < 100)
			me.unlockBelowMin();
		else
			me.unlockAboveMin();
	}
}
