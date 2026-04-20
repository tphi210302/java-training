package Day_4_abstract;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo(1,12);
        ToaDo td2 = new ToaDo(12,32);
        ToaDo td3 = new ToaDo(24,54);

        Hinh h1 = new Diem(td1);
        Hinh h2 = new HinhChuNhat(td2,12,13);
        Hinh h3 = new HinhTron(td3,12);

        System.out.println("Diện tích Điểm: " +h1.tinhdientich());
        System.out.println("Diện tích Hình tròn: " +h2.tinhdientich());
        System.out.println("Dien tich HCN:" +h3.tinhdientich());
    }
}

