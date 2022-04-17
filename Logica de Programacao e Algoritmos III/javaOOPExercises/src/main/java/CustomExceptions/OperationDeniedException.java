package CustomExceptions;

public class OperationDeniedException extends Throwable {
    public OperationDeniedException(String s) {
        super(s);
    }
}
