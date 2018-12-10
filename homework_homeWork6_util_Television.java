package homework.homeWork6.util;

import com.htp.Lesson6Test.domain.EquipmentEnum;

public class Television extends Appliances implements Purpose, Functions{
        private double sizeTv;
        private double classСonsumption;
        private String model;
        private String firm;
        private boolean tvState;

//    public Television(String name, double sizeTv, double classСonsumption, String model, String firm) {
//        super(name);
//        this.sizeTv = sizeTv;
//        this.classСonsumption = classСonsumption;
//        this.model = model;
//        this.firm = firm;
//    }

    public Television(String name, Integer price, String purpose, EquipmentEnum warranty,
                      double sizeTv, double classСonsumption, String model, String firm) {
        super(name, price, purpose, warranty);
        this.sizeTv = sizeTv;
        this.classСonsumption = classСonsumption;
        this.model = model;
        this.firm = firm;
    }

    public double getSizeTv() {
        return sizeTv;
    }

    public void setSizeTv(double sizeTv) {
        this.sizeTv = sizeTv;
    }

    public double getClassСonsumption() {
        return classСonsumption;
    }

    public void setClassСonsumption(double classСonsumption) {
        this.classСonsumption = classСonsumption;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    @Override
    public void on() {
        tvState = true;
    }

    @Override
    public void off() {
        tvState = false;
    }

    @Override
    public void isPurpose() {
        System.out.println("TV");
    }

    @Override
    public void validateWarranty(EquipmentEnum warranty) {

    }

    @Override
    public void getState() {
        if (tvState) {
            System.out.println("TV State is ON");
        } else {
            System.out.println("TV State is OFF");
        }
    }

    @Override
    public String toString() {
        return "Television{" +
                "sizeTv=" + sizeTv +
                ", classСonsumption=" + classСonsumption +
                ", model='" + model + '\'' +
                ", firm='" + firm + '\'' +
                ", tvState=" + tvState +
                '}';
    }
}
