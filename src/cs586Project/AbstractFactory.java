/*
 * Abstract Factory pattern is applied in this class.
 */
package cs586Project;

public abstract class AbstractFactory {
	public DataStore ds;
	
	protected Action1StorePin a1;
	protected Action2StoreBalance a2;
	protected Action3PromptForPin a3;
	protected Action4IncorrectPinMessage a4;
	protected Action5TooManyAttemptsMessage a5;
	protected Action6EjectCard a6;
	protected Action7DisplayMenu a7;
	protected Action8MakeDeposit a8;
	protected Action9DisplayBalance a9;
	protected Action10WithdrawMoney a10;
	protected Action11LockMessage a11;
	protected Action12UnlockMessage a12;
	protected Action13Penalty a13;
	
	public abstract Action1StorePin getAction1();
	
	public abstract Action2StoreBalance getAction2();
	
	public abstract Action3PromptForPin getAction3();
	
	public abstract Action4IncorrectPinMessage getAction4();
	
	public abstract Action5TooManyAttemptsMessage getAction5();
	
	public abstract Action6EjectCard getAction6();
	
	public abstract Action7DisplayMenu getAction7();
	
	public abstract Action8MakeDeposit getAction8();
	
	public abstract Action9DisplayBalance getAction9();
	
	public abstract Action10WithdrawMoney getAction10();
	
	public abstract Action11LockMessage getAction11();
	
	public abstract Action12UnlockMessage getAction12();
	
	public abstract Action13Penalty getAction13();
	
}
