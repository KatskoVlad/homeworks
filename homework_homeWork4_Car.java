package homework.homeWork4;

import java.util.Objects;

public class Car extends Transport {
    private int miles;
    private int countPassenger;
    private String regNumber;
    public static final int allowedWieght = 2000;
    public static final int maxSpeed = 120;
    public static final int controlMiles = 15000;

    public Car() {
    }

    public Car(int countAxis, String typeTransport, String nameTransport,
               int countPassenger, int loadCapacity, boolean diesel, int miles, String regNumber) {
        super(countAxis, typeTransport, nameTransport, loadCapacity, diesel);
        this.miles = miles;
        this.regNumber = regNumber;
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

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles += miles;
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
            System.out.println("Maximum speed exceeded Car!");
    }

    @Override
    public void mileage() {
        if (miles > controlMiles)
            System.out.println("Service Car!");
    }

    @Override
    public void totalLoadCapacity(int wieght) {
        if (wieght > allowedWieght)
            System.out.println("Weight limit exceeded Car!");
        else
            System.out.println("Weight limit Car");
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
        return "Car{" +
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
        Car car = (Car) o;
        return miles == car.miles &&
                countPassenger == car.countPassenger &&
                Objects.equals(regNumber, car.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(miles, countPassenger, regNumber);
    }
}
