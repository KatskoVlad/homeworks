package homework.homeWork4;

import java.util.Objects;

public class Bus extends Transport {

    private int countPassenger;
    private int miles;
    private String regNumber;

    public static final int allowedWieght = 30000;
    public static final int maxSpeed = 80;
    public static final int controlMiles = 20000;

    public Bus(int countPassenger, int miles) {
        this.countPassenger = countPassenger;
        this.miles = miles;
    }

    public Bus(int countAxis, String typeTransport, String nameTransport,
               int loadCapacity, boolean diesel, int countPassenger, int miles, String regNumber) {
        super(countAxis, typeTransport, nameTransport, loadCapacity, diesel);
        this.countPassenger = countPassenger;
        this.miles = miles;
        this.regNumber = regNumber;
    }

    public Bus() {
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

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles += miles;
    }

    @Override
    public void controlmaxSpeed(int speed) {
        if (speed > maxSpeed)
            System.out.println("Maximum speed exceeded Bus!");
    }

    @Override
    public void mileage() {
        if (miles > controlMiles)
            System.out.println("Service Car!");
    }

    @Override
    public void totalLoadCapacity(int wieght) {
        if (wieght > allowedWieght)
            System.out.println("Weight limit exceeded Bus!");
        else
            System.out.println("Weight limit Bus");
    }

    @Override
    public void goDistance(int distance) {
        for (int i = 0; i < distance; i++) {
            setMiles(i);
        }
        mileage();
    }

    @Override
    public String toString() {
        return "Bus{" +
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
        Bus bus = (Bus) o;
        return countPassenger == bus.countPassenger &&
                miles == bus.miles &&
                Objects.equals(regNumber, bus.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countPassenger, miles, regNumber);
    }
}
