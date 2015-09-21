/*
 * Abstract Factory pattern is applied in this class.
 */
package cs586Project;

public class ConcreteFactoryForATM_3 extends AbstractFactory {
	public ConcreteFactoryForATM_3()
	{
		ds = new DataStoreATM3();
		a1 = new Action1_2();
		a2 = new Action2_1();
		a3 = new Action3_2();
		a4 = new Action4IncorrectPinMessage();
		a5 = new Action5TooManyAttemptsMessage();
		a6 = new Action6EjectCard();
		a7 = new Action7_1();
		a8 = new Action8_1();
		a9 = new Action9_1();
		a10 = new Action10_1();
		a11 = new Action11LockMessage();
		a12 = new Action12UnlockMessage();
		a13 = new Action13_3();
	}

	@Override
	public Action1StorePin getAction1() {
		// TODO Auto-generated method stub
		return a1;
	}

	@Override
	public Action2StoreBalance getAction2() {
		// TODO Auto-generated method stub
		return a2;
	}

	@Override
	public Action3PromptForPin getAction3() {
		// TODO Auto-generated method stub
		return a3;
	}

	@Override
	public Action4IncorrectPinMessage getAction4() {
		// TODO Auto-generated method stub
		return a4;
	}

	@Override
	public Action5TooManyAttemptsMessage getAction5() {
		// TODO Auto-generated method stub
		return a5;
	}

	@Override
	public Action6EjectCard getAction6() {
		// TODO Auto-generated method stub
		return a6;
	}

	@Override
	public Action7DisplayMenu getAction7() {
		// TODO Auto-generated method stub
		return a7;
	}

	@Override
	public Action8MakeDeposit getAction8() {
		// TODO Auto-generated method stub
		return a8;
	}

	@Override
	public Action9DisplayBalance getAction9() {
		// TODO Auto-generated method stub
		return a9;
	}

	@Override
	public Action10WithdrawMoney getAction10() {
		// TODO Auto-generated method stub
		return a10;
	}

	@Override
	public Action11LockMessage getAction11() {
		// TODO Auto-generated method stub
		return a11;
	}

	@Override
	public Action12UnlockMessage getAction12() {
		// TODO Auto-generated method stub
		return a12;
	}

	@Override
	public Action13Penalty getAction13() {
		// TODO Auto-generated method stub
		return a13;
	}
	
}
