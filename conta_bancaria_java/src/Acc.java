import java.util.Scanner;

class Account {

    public String cardholderName;
    public int accountId;
    public float balance = 500;

    public float deposit(float value) {
        this.balance = balance + value;
        return this.balance;
    }

    public float whitdraw(float value) {
        if (value <= balance) {
            this.balance = balance - value;
            System.out.println("Withdrawal made successfully!");
        } else {
            System.out.println("Insufficient amount to complete the operation!");
            return this.balance;
        }
        return this.balance;
    }

    public float transfer(float value) {
        if (value <= balance) {
            this.balance = balance - value;
            System.out.println("Transfer performed successfully!");
        } else {
            System.out.println("Insufficient amount to complete the operation!");
            return this.balance;
        }

        return this.balance;
    }

    public float balance() {

        return this.balance;
    }

}

public class Acc {
    private static int a;

    public enum OptionsMenu {

        DEPOSIT(1), WHITDRAW(2), TRANSFER(3), CHECKBALANCE(4), GETOUT(5);

        private final int values;

        OptionsMenu(int valueOption) {
            values = valueOption;
        }

        public int getValue() {
            return values;
        }
    }

    public static void main(String[] args) throws Exception {
        Account bankAcc = new Account();

        while (a != 5) {
            System.out.println("x--------x");
            System.out.println("|MAIN MEU|");
            System.out.println("x--------x\n");
            System.out.println("x--------------------------------------------x");
            System.out.println("|SELECT ONE OF THE OPTIONS BELOW TO CONTINUE:|");
            System.out.println("x--------------------------------------------x");
            System.out.println("1.DEPOSIT \n2.WITHDRAW \n3.TRANSFER \n4.CHECK BALANCE\n5.GET OUT");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();

            switch (a) {
                case 1: //DEPOSIT
                    System.out.println("Enter the amount you want to deposit: ");
                    Scanner deposit = new Scanner(System.in);
                    float depositValue = deposit.nextFloat();

                    float depositing = bankAcc.deposit(depositValue);
                    depositing = bankAcc.balance();
                    System.out.println("Amount deposited successfully!");
                    System.out.println("x------------------------------x");
                    System.out.println("|Your current balance is: " + depositing + "|");
                    System.out.println("x------------------------------x");
                    break;
                case 2: //WITHDRAW
                    System.out.println("Enter the amount you want to withdraw: ");
                    Scanner withdraw = new Scanner(System.in);
                    float withdrawValue = withdraw.nextFloat();

                    float cashingOut = bankAcc.withdraw(withdrawValue);
                    System.out.println("x------------------------------x");
                    System.out.println("|Your current balance is: " + cashingOut + "|");
                    System.out.println("x------------------------------x");

                    break;
                case 3: //TRANSFER
                    System.out.println("Enter the amount you want to transfer: ");
                    Scanner transf = new Scanner(System.in);
                    float transferValue = transf.nextFloat();

                    float transferring = bankAcc.transfer(transferValue);
                    System.out.println("x------------------------------x");
                    System.out.println("|Your current balance is: " + transferring + "|");
                    System.out.println("x------------------------------x");

                    break;
                case 4: //GET BALANCE
                    System.out.println("x------------------------------x");
                    System.out.println("|Your current balance is: " + bankAcc.balance + "|");
                    System.out.println("x------------------------------x");
                    break;

                case 5: //GET OUT
                    System.out.println("x------------------x");
                    System.out.println("|see you next time!|");
                    System.out.println("x------------------x");
                    System.exit(0);
                    break;
                default:
                    System.out.println("x----------------------x");
                    System.out.println("|Select a valid option!|");
                    System.out.println("x----------------------x");
            }
        }
    }
}