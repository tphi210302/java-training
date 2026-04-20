package Day_5_6_abstract;

import javax.sound.midi.Soundbank;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("Vinfast", "Việt Nam");
        HangSanXuat h2 = new HangSanXuat("Toyota", " Nhật Bản");
        HangSanXuat h3 = new HangSanXuat("Hyndai", " Hàn Quốc");

        PhuongTienDiChuyen p1 = new MayBay(h1,"Xăng");
        PhuongTienDiChuyen p2 = new XeOto(h2, "dầu");
        PhuongTienDiChuyen p3 = new XeDap(h3);

        System.out.println("Lấy hãng sản xuất");
        System.out.println("P1:" + p1.layTenHangSanXuat() + "    "+ "Quốc gia: "+ h1.getTenQuocGia());

        p1.batDau();

        System.out.println("Vận tốc " +p1.layVanToc());

        p1.dungLai();
        }
    }
