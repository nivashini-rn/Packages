import pkcustomer.Customer;
import java.util.*;

public class BankDemo {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        Customer c[] = new Customer[5];
        int ch1, ch2, ch3, cid, i = 0;
        do {
            System.out.println("1 - Create New Account");
            System.out.println("2 - Transaction");
            System.out.println("3 - Exit");
            System.out.println("Enter your choice : ");
            ch1 = sc.nextInt();
            switch (ch1) {
                case 1:
                    System.out.println("1 - Create SB Account");
                    System.out.println("2 - Create FD Account");
                    System.out.println("3 - Exit");
                    System.out.println("Enter your choice : ");
                    ch2 = sc.nextInt();
                    System.out.println("Enter Name & Address : ");
                    String name = sc.next();
                    String address = sc.next();
                    c[i] = new Customer(i, name, address);
                    c[i].createAccount(ch2);
                    i++;
                    break;
                case 2:
                    try {
                        System.out.println("1 - SB Deposit");
                        System.out.println("2 - SB Withdraw");
                        System.out.println("3 - SB Calculate Interest");
                        System.out.println("4 - FD Closing ");
                        System.out.println("Enter your choice : ");
                        ch3 = sc.nextInt();
                        System.out.println("Enter Customer id ");
                        cid = sc.nextInt();
                        c[cid - 1].transaction(ch3);
                        break;
                    } catch (Exception e) {
                        System.out.println("Sorry,No such Account is found ");
                    }
                case 3:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (ch1 != 3);

    }

}


