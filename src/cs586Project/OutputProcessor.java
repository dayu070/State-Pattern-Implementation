package cs586Project;

public class OutputProcessor {
	
	private DataStore ds;
	private Action1StorePin a1;
	private Action2StoreBalance a2;
	private Action3PromptForPin a3;
	private Action4IncorrectPinMessage a4;
	private Action5TooManyAttemptsMessage a5;
	private Action6EjectCard a6;
	private Action7DisplayMenu a7;
	private Action8MakeDeposit a8;
	private Action9DisplayBalance a9;
	private Action10WithdrawMoney a10;
	private Action11LockMessage a11;
	private Action12UnlockMessage a12;
	private Action13Penalty a13;
	
	public void initialize(AbstractFactory af)
	{
		ds = af.ds;
		a1 = af.getAction1();
		a2 = af.getAction2();
		a3 = af.getAction3();
		a4 = af.getAction4();
		a5 = af.getAction5();
		a6 = af.getAction6();
		a7 = af.getAction7();
		a8 = af.getAction8();
		a9 = af.getAction9();
		a10 = af.getAction10();
		a11 = af.getAction11();
		a12 = af.getAction12();
		a13 = af.getAction13();
	}
	
	public void storePin()
	{
		a1.storePin(ds);
	}
	
	public void storeBalance()
	{
		a2.storeBalance(ds);
	}
	
	public void promptForPin()
	{
		a3.promptForPin();
	}
	
	public void incorrectPinMessage()
	{
		a4.incorrectPinMsg();
	}
	
	public void tooManyAttemptsMessage()
	{
		a5.tooManyAttemptsMsg();
	}
	
	public void ejectCard()
	{
		a6.ejectCard();
	}
	
	public void displayMenu()
	{
		a7.displayMenu();
	}
	
	public void makeDeposit()
	{
		a8.makeDeposit(ds);
	}
	
	public void displayBalance()
	{
		a9.displayBalance(ds);
	}
	
	public void withdrawMoney()
	{
		a10.withdrawMoney(ds);
	}
	
	public void lockMessage()
	{
		a11.lockMsg();
	}
	
	public void unlockMessage()
	{
		a12.unlockMsg();
	}
	
	public void penalty()
	{
		a13.penalty(ds);
	}
	
}
