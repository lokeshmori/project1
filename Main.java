
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to ATM Interface !! ");
        System.out.println("------------------------------------");
        System.out.println("Select option ");
        System.out.println("1.Register \n2.Exit");
        System.out.println("enter choice ");
        int choice = sc.nextInt();

        if (choice == 1) {
            Main.register();
        } else {
            if (choice == 2) {
                System.exit(0);
            } else {
                System.out.println("select a value only given from options : ");

            }
        }
    }

    public static void register() {
        atmOperationInterf op = new AtmoprationImpl();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the user name : ");

        String  name = sc.nextLine();
        System.out.println("Enter the ATM number : ");
        int acc = sc.nextInt();
        System.out.println("Generate the ATM pin : ");
        int pin = sc.nextInt();
        System.out.println(" Registration successfully ");
        System.out.println("------------------------------------");
      //  Scanner sc = new Scanner(System.in);
        System.out.println();


        System.out.println("WELCOME TO ATM MACHINE !");

        System.out.println("Enter the ATM number : ");
        int atmNumer = sc.nextInt();
        System.out.println("Enter the atm pin : ");
        int atmPin = sc.nextInt();

        if ((acc == atmNumer) && (atmPin == pin)) {
            while (true) {
                System.out.println(" 1.View Available Balance \n 2.Withdraw Amount \n 3.Deposit Amount  \n 4.Ministatement \n 5.Exit ");
                System.out.println("Enter choice : ");
                int ch = sc.nextInt();
                if (ch == 1) {
                    op.viewBalance();
                } else if (ch == 2) {
                    System.out.println("Enter amount to withdraw  :");
                    double withdrawAmount = sc.nextInt();
                    op.withdrawAmount(withdrawAmount);
                } else if (ch == 3) {
                    System.out.println("Enter amount to deposit : ");
                    double depositAmount = sc.nextInt();
                    op.depositAmount(depositAmount);
                } else if (ch == 4) {
                    op.vieMiniStatement();
                } else if (ch == 5) {
                    System.out.println("Collect your atm card \n thank you for using atm !!");
                    System.exit(0);
                } else {
                    System.out.println("Please enter correct choice ");
                }
            }
        } else {
            System.out.println("Incorrect atm number and pin ");
            System.exit(0);
        }


    }
}