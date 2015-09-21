package cs586Project;

public class ATM_1 {
	private MDA_EFSM me;
	private DataStore ds;
	
	public ATM_1(MDA_EFSM me, DataStore ds)
	{
		this.me = me;
		this.ds = ds;
	}
	
	public void create()
	{
		me.create();
	}
	
	public void card(int balance, String pin)
	{
		ds.setTempIntBalance(balance);
		ds.setTempStringPin(pin);
		me.card();
	}
	
	public void deposit(int d)
	{
		ds.setTempIntD(d);
		me.deposit();
		if (ds.getIntBalance() < 1000)
			me.belowMinBalance();
		else
			me.aboveMinBalance();
	}
	
	public void withdraw(int w)
	{
		ds.setTempIntW(w);
		if (ds.getIntBalance() > w)
			me.withdraw();
		if (ds.getIntBalance() < 1000)
			me.belowMinBalance();
		else
			me.aboveMinBalance();
	}
	
	public void pin(String x)
	{
		if (x.equals(ds.getStringPin()) == true)
		{
			if (ds.getIntBalance() < 1000)
				me.correctPinBelowMin();
			else
				me.correctPinAboveMin();
		}	
		else
			me.incorrectPin(3);
	}
	
	public void exit()
	{
		me.exit();
	}
	
	public void balance()
	{
		me.balance();
	}
	
	public void lock(String x)
	{
		if (x.equals(ds.getStringPin()) == true)
			me.lock();
	}
	
	public void unlock(String x)
	{
		if (x.equals(ds.getStringPin()) == true)
		{
			if (ds.getIntBalance() < 1000)
				me.unlockBelowMin();
			else
				me.unlockAboveMin();
		}
	}
}
