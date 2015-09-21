package driver;

import java.util.Scanner;

import cs586Project.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Driver().run();
	}

	public void run()
	{
		Scanner sc = new Scanner(System.in);
		int numOfATM = 0;
		
		/*
		 * *Specify a ATM number.
		 */
		while(numOfATM < 1 || numOfATM > 3)
		{
			System.out.println("Welcome to ATM system, please enter a number(1-3) for an ATM you want: ");
			numOfATM = sc.nextInt();
		}
		
		if (numOfATM == 1)         //ATM1 
		{
			driveATM1();
		}
		else if (numOfATM == 2)    //ATM2
		{
			driveATM2();
		}
		else						//ATM3
		{
			driveATM3();
		}
	}    //End run method
	
	public static void driveATM1()
	{
		ConcreteFactoryForATM_1 cf = new ConcreteFactoryForATM_1();
		OutputProcessor op = new OutputProcessor();
		op.initialize(cf);
		MDA_EFSM me = new MDA_EFSM(op);
		ATM_1 atm = new ATM_1(me, cf.ds);
		boolean quit = true;
		Scanner sc = new Scanner(System.in);
		
		atm.create();
		
		while (quit)
		{
			int function = -1;
			while(function < 0 || function > 8)
			{
				System.out.println("Please choose an operation: ");
				System.out.println("1 - card (int x, String y) ");
				System.out.println("2 - pin (String x) ");
				System.out.println("3 - deposit (int x) ");
				System.out.println("4 - withdraw (int x) ");
				System.out.println("5 - balance () ");
				System.out.println("6 - exit () ");
				System.out.println("7 - lock (int x) ");
				System.out.println("8 - unlock (int x) ");
				System.out.println("0 to quit the demo. ");
				function = sc.nextInt();
			}
			
			switch(function)
			{
			    case 1:
			    {
			    	System.out.println("Please enter an integer balance: ");
			    	int balance = sc.nextInt();
			    	System.out.println("Please enter a string pin: ");
			    	String pin = sc.next();
			    	atm.card(balance, pin);
			    	break;
			    }
			    	
			    case 2:
			    {
			    	System.out.println("Please enter a string pin: ");
			    	String pin = sc.next();
			    	atm.pin(pin);
			    	break;
			    }
			    	
			    case 3:
			    {
			    	System.out.println("How much do you want to deposit? Please enter an integer: ");
			    	int deposit = sc.nextInt();
			    	atm.deposit(deposit);
			    	break;
			    }
			    
			    case 4:
			    {
			    	System.out.println("How much do you want to withdraw? Please enter an integer: ");
			    	int withdraw = sc.nextInt();
			    	atm.withdraw(withdraw);
			    	break;
			    }
			    	
			    case 5:
			    {	
			    	atm.balance();
			    	break;
			    }
			    	
			    case 6:
			    {	
			    	atm.exit();
			    	break;
			    }
			    	
			    case 7:
			    {	
			    	System.out.println("Please enter a string pin: ");
			    	String pin = sc.next();
			    	atm.lock(pin);
			    	break;
			    }
			    	
			    case 8:
			    {
			    	System.out.println("Please enter a string pin: ");
			    	String pin = sc.next();
			    	atm.unlock(pin);
			    	break;
			    }
			    	
			    case 0:
			    {
			     	quit = false;
			    	break;
			    }
			    	
			    default:
			    	break;
			}
		}
	}                          //End driveATM1
	
	public static void driveATM2()
	{
		ConcreteFactoryForATM_2 cf = new ConcreteFactoryForATM_2();
		OutputProcessor op = new OutputProcessor();
		op.initialize(cf);
		MDA_EFSM me = new MDA_EFSM(op);
		ATM_2 atm = new ATM_2(me, cf.ds);
		boolean quit = true;
		Scanner sc = new Scanner(System.in);
		
		atm.create();
		
		while (quit)
		{
			int function = -1;
			while(function < 0 || function > 8)
			{
				System.out.println("Please choose an operation: ");
				System.out.println("1 - CARD (float x, int y) ");
				System.out.println("2 - PIN (int x) ");
				System.out.println("3 - DEPOSIT (float x) ");
				System.out.println("4 - WITHDRAW (float x) ");
				System.out.println("5 - BALANCE () ");
				System.out.println("6 - EXIT () ");
				System.out.println("0 to quit the demo. ");
				function = sc.nextInt();
			}
			
			switch(function)
			{
			    case 1:
			    {
			    	System.out.println("Please enter an float balance: ");
			    	float balance = sc.nextFloat();
			    	System.out.println("Please enter an integer pin: ");
			    	int pin = sc.nextInt();
			    	atm.CARD(balance, pin);
			    	break;
			    }
			    	
			    case 2:
			    {
			    	System.out.println("Please enter a integer pin: ");
			    	int pin = sc.nextInt();
			    	atm.PIN(pin);
			    	break;
			    }
			    	
			    case 3:
			    {
			    	System.out.println("How much do you want to deposit? Please enter a float: ");
			    	float deposit = sc.nextFloat();
			    	atm.DEPOSIT(deposit);
			    	break;
			    }
			    
			    case 4:
			    {
			    	System.out.println("How much do you want to withdraw? Please enter an integer: ");
			    	float withdraw = sc.nextFloat();
			    	atm.WITHDRAW(withdraw);
			    	break;
			    }
			    	
			    case 5:
			    {	
			    	atm.BALANCE();
			    	break;
			    }
			    	
			    case 6:
			    {	
			    	atm.EXIT();
			    	break;
			    }
			    
			    case 0:
			    {
			     	quit = false;
			    	break;
			    }
			    	
			    default:
			    	break;
			}
		}
	}                     //End driveATM2
	
	public static void driveATM3()
	{
		ConcreteFactoryForATM_3 cf = new ConcreteFactoryForATM_3();
		OutputProcessor op = new OutputProcessor();
		op.initialize(cf);
		MDA_EFSM me = new MDA_EFSM(op);
		ATM_3 atm = new ATM_3(me, cf.ds);
		boolean quit = true;
		Scanner sc = new Scanner(System.in);
		
		atm.create();
		
		while (quit)
		{
			int function = -1;
			while(function < 0 || function > 8)
			{
				System.out.println("Please choose an operation: ");
				System.out.println("1 - card (int x, int y) ");
				System.out.println("2 - pin (int x) ");
				System.out.println("3 - deposit (int x) ");
				System.out.println("4 - withdraw (int x) ");
				System.out.println("5 - balance () ");
				System.out.println("6 - exit () ");
				System.out.println("7 - lock () ");
				System.out.println("8 - unlock () ");
				System.out.println("0 to quit the demo. ");
				function = sc.nextInt();
			}
			
			switch(function)
			{
			    case 1:
			    {
			    	System.out.println("Please enter an integer balance: ");
			    	int balance = sc.nextInt();
			    	System.out.println("Please enter an integer pin: ");
			    	int pin = sc.nextInt();
			    	atm.card(balance, pin);
			    	break;
			    }
			    	
			    case 2:
			    {
			    	System.out.println("Please enter an integer pin: ");
			    	int pin = sc.nextInt();
			    	atm.pin(pin);
			    	break;
			    }
			    	
			    case 3:
			    {
			    	System.out.println("How much do you want to deposit? Please enter an integer: ");
			    	int deposit = sc.nextInt();
			    	atm.deposit(deposit);
			    	break;
			    }
			    
			    case 4:
			    {
			    	System.out.println("How much do you want to withdraw? Please enter an integer: ");
			    	int withdraw = sc.nextInt();
			    	atm.withdraw(withdraw);
			    	break;
			    }
			    	
			    case 5:
			    {	
			    	atm.balance();
			    	break;
			    }
			    	
			    case 6:
			    {	
			    	atm.exit();
			    	break;
			    }
			    	
			    case 7:
			    {	
			    	atm.lock();
			    	break;
			    }
			    	
			    case 8:
			    {
			    	atm.unlock();
			    	break;
			    }
			    	
			    case 0:
			    {
			     	quit = false;
			    	break;
			    }
			    	
			    default:
			    	break;
			}
		}
	}
}
