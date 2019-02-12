
import java.util.Random;

//import javax.print.attribute.standard.MediaSize.NA;

public class BankAccountTest {
	Random rnd = new Random();
	BankAccount[] bank = new BankAccount[30];

	public BankAccountTest() {
		
        System.out.println("======== The Savings Accounts Information =======");
        for (int i = 0; i <15; i++) {
        	 bank[i]= new SavingAccount(rnd.nextInt(25000)+1000);
        	 
			}

        System.out.println("======== The Chequing Accounts Information =======");
        for (int j = 16; j <30; j++) {
       	 bank[j]= new ChequingAccount(rnd.nextInt(40000)+1000);
			}

	}
	
	public void monthlyProcess(BankAccount[] c){
		for (int i = 0; i < 15; i++) {

			c[i].getBalance();
		}
		for (int i = 16; i < 30; i++) {
			c[i].getBalance();

		}
			
			 
	}
	public void display(){
		for (int i = 0; i < 15; i++) {
    	System.out.println("balance of saving account " + (i + 1) + " = " + bank[i].balance+ " $");
		}
        	System.out.println();
        	for (int i = 16; i < 30; i++) {
    			
        	System.out.println("balance of chequing account " + (i + 1) + " = " + bank[i].balance+" $");
        	}
			System.out.println();


	}


public static void main(String []args) {
		
		BankAccountTest Bank= new BankAccountTest();
		
		String [] months={"Jan", "Feb", "Mar", "April","May", "Jun" ,"Jul" ,"Aug" ,"Sep" ,"Oct" ,"Nov" ,"Dec"};
		for(int i=0;i<12;i++){
			System.out.println();
			System.out.println(months[i]+" :-");

			System.out.println();
				Bank.monthlyProcess(Bank.bank);
				Bank.display();
				
			
		
		
		}
		
}
	
		// TODO Auto-generated method stub
		

}

