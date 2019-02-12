
public class SavingAccount extends BankAccount{
    private double interestRate=0.03;
   

	public  SavingAccount(int balance ){

		super.balance=balance;
	}
	@Override
    
    public void calculateandUpdateBalance(){
    	
    	balance =balance+ (balance+(interestRate/12));
    	//double interest = getBalance()* (interestRate / 100.0);
    
}
}
