package Day_4_abstract;

import Day_4_abstract.ToaDo;

public abstract class Hinh {
    protected ToaDo ToaDo;

    public Hinh(ToaDo toaDo) {
        ToaDo = toaDo;
    }

    public ToaDo getToaDo() {
        return ToaDo;
    }

    public void setToaDo(ToaDo toaDo) {
        ToaDo = toaDo;
    }
    public abstract double tinhdientich();
}
