import java.util.*;

class A {
    float bal = 0;
    float amu;
    int accountnumber = 41030018;
    int PIN = 12345;
    Scanner ra = new Scanner(System.in);
    public void checkAandP() {
        System.out.print("\nAccount Number : ");
        int enterAn = ra.nextInt();
        System.out.print("PIN : ");
        int enterP = ra.nextInt();
        if(enterAn == accountnumber && enterP == PIN){
            choice();
        }
        else{
            System.out.println();
            System.out.println("------------------------------------------");
            System.out.println("| Enter The Valid Account Number And PIN |");
            System.out.println("------------------------------------------");
            checkAandP();
        }
    }

    public void choice() {
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("|ATM Machine                   |");
        System.out.println("|Choose 1 for Withdraw         |");
        System.out.println("|Choose 2 for Deposit          |");
        System.out.println("|Choose 3 for Check Balance    |");
        System.out.println("|Choose 4 for Exit             |");
        System.out.println("--------------------------------");
        System.out.print("\nchoose the operation : ");
        int ch = ra.nextInt();

        if (ch == 1) {
            getWithdraw();      
        }

        else if (ch == 2) {
            getDeposit();
        }

        else if (ch == 3) {
            getBalance();
        }

        else if (ch == 4) {
            System.out.println("Thanks For Visit In ATM.");
        }

        else {
            System.out.println("Please Enter A Valid Choice.");
        }
    }

    public void getBalance() {
        System.out.println("Balance : "+bal);
        choice();
    }

    public void getWithdraw(){
        System.out.print("Enter Money To Be Withdraw : ");
        amu = ra.nextFloat();
        if(amu > bal){
            System.out.println("Insufficient Balance In Your Account.");
        }
        else{
            bal = bal - amu;
            System.out.println("Your Money Has Been Successfully Withdraw.");
        }
        choice();
    }

    public void getDeposit(){
        System.out.print("Enter Money To Be Deposited : ");
        amu = ra.nextFloat();
        bal = bal + amu;
        System.out.println("Your Money Has Been Successfully Deposited.");
        choice();
    }
}

public class ATMInterface {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        System.out.println("|                 ATM INSTRUCTION                  |");
        System.out.println("| Please Enter Your Currect Account Number And PIN |");
        System.out.println("|                                                  |");
        System.out.println("----------------------------------------------------");
        A obj = new A();
        obj.checkAandP();
    }
}
