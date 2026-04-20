package Day_5_6_abstract;

public abstract class PhuongTienDiChuyen {
    private String name;
    private String loaiNhienLieu;
    private long vanToc;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public long getVanToc() {
        return vanToc;
    }

    public void setVanToc(long vanToc) {
        this.vanToc = vanToc;
    }

    protected String loaiPhuongTien;
    protected HangSanXuat hangSanXuat;

    public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
        this.loaiPhuongTien = loaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }

    public String getLoaiPhuongTien() {
        return loaiPhuongTien;
    }

    public void setLoaiPhuongTien(String loaiPhuongTien) {
        this.loaiPhuongTien = loaiPhuongTien;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String layTenHangSanXuat(){
        return this.hangSanXuat.getTenhangSanXuat();
    }

    public void batDau() {
        System.out.println("Bắt Đầu");
    }

    public void tangToc() {
        System.out.println("Tăng Tốc");
    }

    public void dungLai() {
        System.out.println("Dừng Lại");
    }

    public abstract double layVanToc();
}
