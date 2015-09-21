package cs586Project;

public class ATM_2 {
	private MDA_EFSM me;
	private DataStore ds;
	
	public ATM_2(MDA_EFSM me, DataStore ds)
	{
		this.me = me;
		this.ds = ds;
	}
	
	public void create()
	{
		me.create();
	}
	
	public void CARD(float balance, int pin)
	{
		ds.setTempFloatBalance(balance);
		ds.setTempIntPin(pin);
		me.card();
	}
	
	public void DEPOSIT(float d)
	{
		ds.setTempFloatD(d);
		me.deposit();
		if(ds.getFloatBalance() < 500)
			me.belowMinBalance();
		else
			me.aboveMinBalance();
	}
	
	public void WITHDRAW(float w)
	{
		ds.setTempFloatW(w);
		if(ds.getFloatBalance() > w)
			me.withdraw();
		if(ds.getFloatBalance() < 500)
			me.belowMinBalance();
		else
			me.aboveMinBalance();
	}
	
	public void PIN(int x)
	{
		if (x == ds.getIntPin())
		{
			if (ds.getFloatBalance() < 500)
				me.correctPinBelowMin();
			else
				me.correctPinAboveMin();
		}
		else
			me.incorrectPin(2);
	}
	
	public void EXIT()
	{
		me.exit();
	}
	
	public void BALANCE()
	{
		me.balance();
	}
}
