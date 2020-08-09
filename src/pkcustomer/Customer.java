package pkcustomer;
import java.util.*;

import pkaccount.Account;
import pkaccount.fd.FDAccount;
import pkaccount.sb.SBAccount;

public class Customer extends Account  {
    int cust_id;
    String name;
    String address;
    SBAccount sb;
    FDAccount fd;
    static int
            sbac=1512110280,fdac=1815121100;
    public Customer(int cust_id,String name,String address)
    {
        this.cust_id = cust_id+1;
        this.name = name;
        this.address = address;
    }
    public void createAccount(int type)
    {
        Scanner sc = new Scanner(System.in);
        if(type == 1)
        {
            System.out.println("Enter initial amount to open SB account : ");
            double sbamount = sc.nextDouble();
            sb = new SBAccount(++sbac,sbamount);
            System.out.println("Details:");
            System.out.println("Accountant name : "+name);
            System.out.println("Account type : SB Account");
            System.out.println("Account Number : "+sb.accnumber);
            System.out.println("Customer Id : "+cust_id);
            System.out.println("Balance : "+sb.balance);
        }
        else if(type == 2)
        {
            System.out.println("Enter amount to deposit in FD account & period : ");
            double fdamount = sc.nextDouble();
            int period = sc.nextInt();
            fd = new FDAccount(++fdac,period,fdamount);
            System.out.println("Details:");
            System.out.println("Accountant name : "+name);
            System.out.println("Account type : FD Account");
            System.out.println("Account Number : "+fd.accnumber);
            System.out.println("Customer Id : "+cust_id);
            System.out.println("Balance : "+fd.balance);
        }
        else
            System.out.println("Invalid type");
    }
    public void transaction(int type)
    {
        Scanner sc = new Scanner(System.in);
        if(type == 1)
        {
            System.out.println("Enter Amount to deposit : ");
            double amount = sc.nextDouble();
            sb.deposit(amount);
        }
        else if(type == 2)
        {
            System.out.println("Enter Amount to withdraw : ");
            double amount = sc.nextDouble();
            sb.withdraw(amount);
        }
        else if(type == 3)
        {
            sb.calc_interest();
        }
        else if(type == 4)
        {
            fd.close();
        }
        else
            System.out.println("***Invalid choice***");
    }

}
