package Day_4_abstract;
import Day_4_abstract.Hinh;
import Day_4_abstract.ToaDo;

public class HinhChuNhat extends Hinh {
    private double chieuCao , chieuRong;

    public HinhChuNhat(ToaDo toaDo, double chieurong, double chieucao) {
        super(toaDo);
        this.chieuRong = chieurong;
        this.chieuCao = chieucao;
    }
    public double getChieucao() {
        return chieuCao;
    }
    public void setChieucao(double chieucao) {
        this.chieuCao = chieucao;
    }
    public double getChieurong() {
        return chieuRong;
    }
    public void setChieurong(double chieurong) {
        this.chieuRong = chieurong;
    }
    @Override
    public double tinhdientich(){
        return this.chieuCao*this.chieuRong;
    }
}
