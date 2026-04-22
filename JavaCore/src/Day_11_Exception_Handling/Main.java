package Day_11_Exception_Handling;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(1,"Vũ Quốc Phi", 100000);
        Account acc2 = new Account(2, "Thedp",200000);

        TransferService service = new TransferService();

        try {
            service.transfer(acc1,acc2,10000);
            System.out.println("Chuyển khoản thành công");
            System.out.println("Từ tài khoản:" + acc1.getBalance());
            System.out.println("Đến tài khoản: " + acc2.getBalance());
        } catch (Exception e){
            System.out.println("Lỗi : " +e.getMessage());
            System.out.println("Hoàn thành giao dịch");

        }
    }
}
