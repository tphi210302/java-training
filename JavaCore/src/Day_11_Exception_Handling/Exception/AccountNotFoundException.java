package Day_11_Exception_Handling.Exception;

public class AccountNotFoundException extends Exception{    //checked exception để dùng try - catch
    public AccountNotFoundException(String message){
        super(message);
    }
}
