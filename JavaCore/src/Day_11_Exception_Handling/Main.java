package Day_11_Exception_Handling;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(1,"Vũ Quốc Phi", 100000);
        Account acc2 = new Account(2, "Thedp",200000);

        TransferService service = new TransferService();

        try {
            service.transfer(acc1,acc2,10000);
            System.out.println("Chuyển khoản thành công ! " );
            System.out.println("Số dư còn lại " + acc1.getName()+ " : "  + acc1.getBalance());
            System.out.println("Cập nhật số dư "+ acc2.getName()+ " : " + acc2.getBalance());
        } catch (Exception e){
            System.out.println("Lỗi : " +e.getMessage());

        }finally {
            System.out.println("Kết thúc giao dịch!");
        }
    }
}
