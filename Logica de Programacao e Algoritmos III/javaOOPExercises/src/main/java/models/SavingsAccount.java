package models;

import enumerators.AccountTypesEnum;

public class SavingsAccount extends Account{

    public SavingsAccount(Client clientOwner) {
        super(clientOwner);
        type = AccountTypesEnum.SAVINGS_ACCOUNT;
    }

    @Override
    public void printBankStatement() {
        System.out.println("=== Bank Statement - Savings Account ===");
        super.printBankStatementTemplate();
    }

}
