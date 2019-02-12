
public class ChequingAccount extends BankAccount{
 
	
	private double fee = 2.0;
 
    
public ChequingAccount(double Abalance) {
	super.balance=Abalance;
    	}
    @Override
    public void calculateandUpdateBalance(){
    	
    	balance =balance - fee;
    	//double interest = getBalance()* (interestRate / 100.0);
    
}
    
   
   }
    
