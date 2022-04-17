package interfaces;

import CustomExceptions.OperationDeniedException;

public interface IAccount {
        void deposit(double amount) throws OperationDeniedException;
        void withDraw(double amount) throws OperationDeniedException;
        void transfer(double amount, IAccount receiverAccount) throws OperationDeniedException;
        void printBankStatement();
}
