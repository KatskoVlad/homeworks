package homework.homeWork4;

public abstract class Transport {
    private int speed;
    private int countAxis;
    private String typeTransport;
    private String nameTransport;
    private int loadCapacity;
    private boolean diesel;
    private String status;
    private int distance;
    public static final String STOP = "STOP";
    public static final String START = "START";
    public static final String PARKING = "PARKING";

    public Transport() {
    }

    public Transport(int countAxis, String typeTransport,
                     String nameTransport, int loadCapacity,
                     boolean diesel) {
        this.countAxis = countAxis;
        this.typeTransport = typeTransport;
        this.nameTransport = nameTransport;
        this.loadCapacity = loadCapacity;
        this.diesel = diesel;
    }

    public void drive() {
        status = START;
    }

    public void stop() {
        status = STOP;
    }

    public void parking() {
        status = PARKING;
    }

    public abstract void controlmaxSpeed(int speed);

    public abstract void mileage();

    public abstract void totalLoadCapacity(int wieght);

    public abstract void goDistance(int distance);

    public abstract void setRegNumber(String regNumber);

    public abstract void setRegNumber(String serial, String regNumber);

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCountAxis() {
        return countAxis;
    }

    public void setCountAxis(int countAxis) {
        this.countAxis = countAxis;
    }

    public String getTypeTransport() {
        return typeTransport;
    }

    public void setTypeTransport(String typeTransport) {
        this.typeTransport = typeTransport;
    }

    public String getNameTransport() {
        return nameTransport;
    }

    public void setNameTransport(String nameTransport) {
        this.nameTransport = nameTransport;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public boolean isDiesel() {
        return diesel;
    }

    public void setDiesel(boolean diesel) {
        this.diesel = diesel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
