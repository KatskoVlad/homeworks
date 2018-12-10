package homework.homeWork4;

import java.util.Objects;

public class ElectroBus extends Transport {

    private int miles;
    private int countPassenger;
    private String regNumber;

    public static final int allowedWieght = 25000;
    public static final int maxSpeed = 60;
    public static final int controlMiles = 10000;

    public ElectroBus(int countAxis, String typeTransport, String nameTransport,
                      int countPassenger, int loadCapacity, boolean diesel, int miles, String regNumber) {
        super(countAxis, typeTransport, nameTransport, loadCapacity, diesel);
        this.miles = miles;
        this.regNumber = regNumber;
    }

    public ElectroBus() {
    }

    public void go() {
        if (getStatus() == "START") {
            for (int i = 0; i < super.getDistance() / 10; i++) {
                setMiles(i * 10);
            }
        }

    }

    public String getRegNumber() {
        return regNumber;
    }

    @Override
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    @Override
    public void setRegNumber(String serial, String number) {
        this.regNumber = serial + "-" + number;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public void setCountPassenger(int countPassenger) {
        this.countPassenger = countPassenger;
    }

    @Override
    public void controlmaxSpeed(int speed) {
        if (speed > maxSpeed)
            System.out.println("Maximum speed exceeded ElectroBus!");
    }

    @Override
    public void mileage() {
        if (this.miles > controlMiles)
            System.out.println("Service ElectroBus!");
    }

    @Override
    public void totalLoadCapacity(int wieght) {
        if (wieght > allowedWieght)
            System.out.println("Weight limit exceeded ElectroBus!");
        else
            System.out.println("Weight limit ElectroBus");
    }

    @Override
    public void goDistance(int distance) {
        for (int i = 0; i < distance; i++) {
            setMiles(i);
        }
        mileage();
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles += miles;
    }

    @Override
    public String toString() {
        return "ElectroBus{" +
                " miles=" + miles +
                ", countAxis=" + super.getCountAxis() +
                ", typeTransport=" + super.getTypeTransport() +
                ", nameTransport=" + super.getNameTransport() +
                ", loadCapacity=" + super.getLoadCapacity() + '\'' +
                ", disel=" + super.isDiesel() +
                ", distance=" + super.getDistance() +
                ", countPassenger=" + countPassenger +
                ", regNumber='" + regNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElectroBus that = (ElectroBus) o;
        return miles == that.miles &&
                countPassenger == that.countPassenger &&
                Objects.equals(regNumber, that.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(miles, countPassenger, regNumber);
    }
}
