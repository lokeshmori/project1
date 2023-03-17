import java.util.HashMap;
import java.util.Map;

public class AtmoprationImpl implements atmOperationInterf {

    ATM atm =new ATM();
    Map<Double,String> minstmt = new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Available Balance is : "+atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
       if(withdrawAmount%500==0) {
           if (withdrawAmount <= atm.getBalance()) {
               minstmt.put(withdrawAmount, "Amount withdraw");
               System.out.println("Collect the Cash " + withdrawAmount);
               atm.setBalance(atm.getBalance() - withdrawAmount);
               viewBalance();
           } else {
               System.out.println("Insufficient balance !");
           }
       }
       else {
           System.out.println("please enter the amount in multipal of  500 !");
       }
    }

    @Override
    public void depositAmount(double depositamount) {
 minstmt.put(depositamount,"Amount Deposited ");
        System.out.println(depositamount+"  deposited Successfully ");
       atm.setBalance(atm.getBalance() +depositamount);
    viewBalance();
    }

    @Override
    public void vieMiniStatement() {
for(Map.Entry<Double,String>m:minstmt.entrySet()){
    System.out.println(m.getKey()+""+m.getValue());
}
    }
}
