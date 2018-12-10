package homework.homeWork6.util;

import com.htp.Lesson6Test.domain.EquipmentEnum;

public abstract class Appliances<S, I> {
       private S name;
       private I price;
       private S purpose;
       private I warranty;

    public Appliances(S name) {
        this.name = name;
    }

    public Appliances(S name, I price, S purpose, I warranty) {
        this.name = name;
        this.price = price;
        this.purpose = purpose;
        this.warranty = warranty;
    }

    public S getName() {
        return name;
    }

    public void setName(S name) {
        this.name = name;
    }

    public I getPrice() {
        return price;
    }

    public void setPrice(I price) {
        this.price = price;
    }

    public S getPurpose() {
        return purpose;
    }

    public void setPurpose(S purpose) {
        this.purpose = purpose;
    }

    public I getWarranty() {
        return warranty;
    }

    public void setWarranty(I warranty) {
        this.warranty = warranty;
    }

    abstract void getState();
    public abstract void validateWarranty(EquipmentEnum warranty);


    @Override
    public String toString() {
        return "Appliances{" +
                "name=" + name +
                ", price=" + price +
                ", purpose=" + purpose +
                ", warranty=" + warranty +
                '}';
    }

}
