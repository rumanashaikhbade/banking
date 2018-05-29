
package banking;
import java.util.Scanner;

 class Bank {
     float balance;
     int arr1[][];
     int acc_no;
     

    Bank(float amount) {
        balance = amount;
    }

    void deposit(float amount) {
        balance += amount;
    }

    void withdraw(float amount) {
        if (amount < 500) {
            System.out.println("Insufficient bal");
        } else {
            balance -= amount;
        }
    }

    void display() {
        System.out.println("Balance is:" + balance);
    }
}

public class Banking {

        public static void main(String[] args) {
          float amount;
          int acc_no;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.println("Enter initial deposit greater than 500:");
            amount = inp.nextFloat();
        } while (amount < 500);

        Bank b1 = new Bank(amount);
        
        Exit:
        while (true) 
        {
            System.out.println("1.add acc 2.deposit 3: Withdraw 4:Display 5. Exit");
            System.out.println("Enter your choice:");
            int ch = inp.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter acc no:");
                    acc_no = inp.nextInt();
                    System.out.println("Enter the name:");
                    String name= inp.next();
                    break;
                
                case 2:
                    System.out.println("Enter amt to be deposited:");
                    amount = inp.nextFloat();
                    b1.deposit(amount);
                    break;

                case 3:
                    System.out.println("Enter amt to be withdrawn:");
                    amount = inp.nextFloat();
                    b1.withdraw(amount);
                    break;

                case 4:
                    b1.display();
                    break;

                case 5:
                    break Exit;

                default:
                    System.out.println("Invalid chouce");
            }
        }
        
    }
    
}
