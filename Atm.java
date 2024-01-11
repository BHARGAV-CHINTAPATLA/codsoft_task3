import java.util.*;
class Atm extends UserBankAccount {
    void withdraw(int amount1){
        if(amount1 > amount){
            System.out.println("There is no sufficient balance for withdrawals and withdrawal is failure.");
            System.out.println("Your current account balance:"+amount);
        }
        else{
            amount = amount - amount1;
            System.out.println("Your withdrawal of amount "+amount1+" from your account is success.");
            System.out.println("Your current account balance:"+amount);
        }
    }
    void deposit(int amount2){
        amount = amount + amount2;
        System.out.println("Depositing of amount "+amount2+" to your account is success.");
        System.out.println("Your current account balance:"+amount);
    }
    void checkBalance(){
        System.out.println("Your account balance:"+amount);
        System.out.println("Success,That you have checked your account balance.");
    }
}
class UserBankAccount{
    static int amount = 7500;//Assuming that the User account Balance amount
    static Scanner sc = new Scanner(System.in);
    public static void AtmInterface(){
        Atm z = new Atm();
        int a = sc.nextInt(10);
        if(a == 1){
            System.out.println("Card has been inserted properly.");
            System.out.println("Welcome!");
            System.out.println("There are some choices which are represented with numbers.");
            System.out.println("If you want any choices, enter the respective number.");
            System.out.println("Then only, your choices will be executed.");
            System.out.println("Withdrawal: 0");
            System.out.println("Deposit: 1");
            System.out.println("Check Balance: 2");
            System.out.println("Enter your choice:");
            int b = sc.nextInt(10);
            if(b == 0){
                System.out.println("Enter the amount:");
                int c = sc.nextInt();
                z.withdraw(c);
            }
            else if(b == 1){
                System.out.println("Enter the amount:");
                int d = sc.nextInt();
                z.deposit(d);
            }
            else if(b == 2){
                z.checkBalance();
            }
            else{
                System.out.println("Invalid choice");
            }
        }
        else{
            System.out.println("Invalid entry");
            System.out.println("Please press '1' and retry:");
            AtmInterface();
        }
        System.out.println("Is there anything to do?");
        System.out.println("If yes,Press '1'...");
        System.out.println("If not,Enter any Number:");
        int e = sc.nextInt();
        if(e == 1){
            System.out.println("Enter or Press '1' get to your choices:");
            AtmInterface();
        }
        else{
            System.out.println("Thank you!");
            System.out.println("Now,You can remove your card.");
        }
    }
    public static void main(String []args){
        System.out.println("Please insert the card carefully & Enter or Press '1':");
        AtmInterface();
    }
}