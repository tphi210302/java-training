package Day_11_Exception_Handling;

import Day_11_Exception_Handling.Exception.AccountNotFoundException;
import Day_11_Exception_Handling.Exception.InsufficientBalanceException;
import Day_11_Exception_Handling.Exception.InvalidAmountException;
import Day_11_Exception_Handling.Exception.SameAccountException;

public class TransferService {
    public void transfer(Account from, Account to, double amount) throws AccountNotFoundException, InsufficientBalanceException, InvalidAmountException, SameAccountException{
        //Số tiền không hợp lệ
       if (amount < 0){
           throw new InvalidAmountException("Số tiền không hợp lệ");
       }
       //Không đủ số dư
        if (from.getBalance() < amount){ //điều kiện số tiền trong ví nhỏ hơn số tiền chuyển ra
           throw new InsufficientBalanceException("Không đủ số dư");
        }
        //tài khoản không tồn tại
        if ( from == null || to == null  ){
            throw new AccountNotFoundException("Tài khoản không tồn tại");
        }
        //Chuyển cho chính mình
        if ( from == to) {
            throw new SameAccountException("Chuyển cho chính mình");
        }

        to.deposit(amount);
        from.withdraw(amount);
    }
}
