package Day_5_6_abstract;

public class HangSanXuat {
    private String tenhangSanXuat;
    private String tenQuocGia;

    public HangSanXuat(String tenhangSanXuat, String tenQuocGia) {
        this.tenhangSanXuat = tenhangSanXuat;
        this.tenQuocGia = tenQuocGia;
    }

    public String getTenhangSanXuat() {
        return tenhangSanXuat;
    }

    public void setTenhangSanXuat(String tenhangSanXuat) {
        this.tenhangSanXuat = tenhangSanXuat;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }
}
