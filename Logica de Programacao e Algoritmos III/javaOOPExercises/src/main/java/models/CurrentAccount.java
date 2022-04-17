package models;

import enumerators.AccountTypesEnum;

public class CurrentAccount extends Account{

    public CurrentAccount(Client clientOwner) {
        super(clientOwner);
        type = AccountTypesEnum.CURRENT_ACCOUNT;
    }

    @Override
    public void printBankStatement() {
        System.out.println("=== Bank Statement - Current Account ===");
        super.printBankStatementTemplate();
    }
}
