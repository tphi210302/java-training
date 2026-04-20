package Day_5_6_abstract;

public class MayBay extends PhuongTienDiChuyen {
    private String loaiNhienLieu;


    public MayBay(HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super("May Bay", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }
    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 1000;
    }

    public void catCanh(){
        System.out.println("Cất Cánh");
    }
    public void haCanh(){
        System.out.println("Hạ Cánh");
    }
}
