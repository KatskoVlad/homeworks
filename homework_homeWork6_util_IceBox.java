package homework.homeWork6.util;

import com.htp.Lesson6Test.domain.EquipmentEnum;

public class IceBox extends Appliances implements Purpose, Functions {
    private boolean status;
    private String nameStatus;
    private double temp;
    private boolean iceBoxState;

    public IceBox(String name, boolean status, String nameStatus, double temp) {
        super(name);
        this.status = status;
        this.nameStatus = nameStatus;
        this.temp = temp;
    }

    public IceBox(String name, Integer price, String purpose, Integer warranty,
                  boolean status, String nameStatus, double temp) {
        super(name, price, purpose, warranty);
        this.status = status;
        this.nameStatus = nameStatus;
        this.temp = temp;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getNameStatus() {
        return nameStatus;
    }

    public void setNameStatus(String nameStatus) {
        this.nameStatus = nameStatus;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    @Override
    public void on() {
        iceBoxState = true;
    }

    @Override
    public void off() {
        iceBoxState = false;
    }

    @Override
    public void getState() {
        if (iceBoxState) {
            System.out.println("Ice Box State is ON");
        } else {
            System.out.println("Ice Box State is OFF");
        }
    }

    @Override
    public void validateWarranty(EquipmentEnum warranty) {

    }

    @Override
    public void isPurpose() {
        System.out.println("ICE");
    }

    @Override
    public String toString() {
        return "IceBox{" +
                "status=" + status +
                ", nameStatus='" + nameStatus + '\'' +
                ", temp=" + temp +
                '}';
    }
}
