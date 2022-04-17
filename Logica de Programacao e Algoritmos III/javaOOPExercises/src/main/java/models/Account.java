package models;

import CustomExceptions.OperationDeniedException;
import enumerators.AccountTypesEnum;
import interfaces.IAccount;

public abstract class Account implements IAccount {
    private static long accountNumberGenerator = 0;

    protected AccountTypesEnum type;
    protected int agencyNumber = 1;
    protected long accountNumber;
    protected double balance = 0;
    protected Client clientOwner;

    public Account() {
    }

    public Account(Client clientOwner, double balance) {
        this(clientOwner);
        this.balance = balance;
    }

    public Account(Client clientOwner) {
        this.accountNumber = accountNumberGenerator++;
        this.clientOwner = clientOwner;
    }

    @Override
    public void deposit(double amount) throws OperationDeniedException {
        if(amount > 0) {
            this.balance += amount;
        } else {
            throw new OperationDeniedException("The deposit operation failed. Please inform an amount greater than $0.");
        }
    }

    @Override
    public void withDraw(double amount) throws OperationDeniedException {
        if(amount <= 0) {
            throw new OperationDeniedException("The deposit operation failed. Please inform an amount greater than $0.");
        }
        if (amount <= balance) {
            this.balance -= amount;
        } else {
            throw new OperationDeniedException("WithDraw failed due to insufficient balance.");
        }

    }

    @Override
    public void transfer(double amount, IAccount receiverAccount) throws OperationDeniedException {
        withDraw(amount);
        receiverAccount.deposit(amount);
    }


    protected void printBankStatementTemplate() {
        System.out.println(String.format("Account Owner: %s", this.clientOwner.getName()));
        System.out.println(String.format("Agency Number: %d", this.agencyNumber));
        System.out.println(String.format("Account Number: %d", this.accountNumber));
        System.out.println(String.format("Balance: $ %.2f", this.balance));
        System.out.println();
    }
}
