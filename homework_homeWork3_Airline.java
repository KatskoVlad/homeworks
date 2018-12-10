package homework.homeWork3;

public class Airline {
    private String destination;
    private String trainNumber;
    private String typeAircraft;
    private int timeMinutes;
    private int timeHour;
    private int dayOfTheWeek;

    public Airline() {
    }

    public Airline(String destination, String trainNumber, String typeAircraft, int timeMinutes, int timeHour, int dayOfTheWeek) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.typeAircraft = typeAircraft;
        this.timeMinutes = timeMinutes;
        this.timeHour = timeHour;
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getTypeAircraft() {
        return typeAircraft;
    }

    public void setTypeAircraft(String typeAircraft) {
        this.typeAircraft = typeAircraft;
    }

    public int getTimeMinutes() {
        return timeMinutes;
    }

    public void setTimeMinutes(int timeMinutes) {
        this.timeMinutes = timeMinutes;
    }

    public int getTimeHour() {
        return timeHour;
    }

    public void setTimeHour(int timeHour) {
        this.timeHour = timeHour;
    }

    public int getdayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setdayOfTheWeek(int dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    @Override
    public String toString() {
        return "Airlines{" +
                "Destination = '" + destination + '\'' +
                ", Train Number = '" + trainNumber + '\'' +
                ", Type Aircraft = '" + typeAircraft + '\'' +
                ", Time Hour = " + timeHour + ":" +
                ", Time Minutes = " + timeMinutes +
                ", Day Of The Week = " + returnStrDayOfTheWeek(dayOfTheWeek) +
                '}';
    }

    public static String returnStrDayOfTheWeek(int dayOfTheWeek) {
        String strReturnDay = "";
        switch (dayOfTheWeek) {
            case 1:
                strReturnDay = "Monday";
                break;
            case 2:
                strReturnDay = "Tuesday";
                break;
            case 3:
                strReturnDay = "Wednesday";
                break;
            case 4:
                strReturnDay = "Thursday";
                break;
            case 5:
                strReturnDay = "Friday";
                break;
            case 6:
                strReturnDay = "Saturday";
                break;
            case 7:
                strReturnDay = "Sanday";
                break;

        }
        return strReturnDay;
    }

}
