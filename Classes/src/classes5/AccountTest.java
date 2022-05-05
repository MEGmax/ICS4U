package classes5;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.awt.*;

public class AccountTest
{
    public static void main(String[] args)
    {
        String input;
        String pattern = "#,###.00";
        DecimalFormat dollar = new DecimalFormat(pattern);

        input = JOptionPane.showInputDialog("What is your account starting balance: ");

        BankAccount account = new BankAccount(input);

        input = JOptionPane.showInputDialog("How much were you paid this month: ");
        account.deposit(input);

        JOptionPane.showMessageDialog(null, "Your pay has been deposited. Your current balance is: $ " + dollar.format(account.getBalance()));
        dollar.format(account.getBalance());

        input = JOptionPane.showInputDialog("How would you like to withdraw");
        account.withdraw(input);

        JOptionPane.showMessageDialog(null, "Now your balance is $" + dollar.format(account.getBalance()));

        System.exit(0);

    }
}
