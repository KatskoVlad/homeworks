package homework.homeWork3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Airline> airlines = new ArrayList<>();
        airlines.add(createAirline("Saratov", "234217", "Airbus A310", 9, 10, 1));
        airlines.add(createAirline("Moscow", "345778", "Airbus A320", 10, 20, 2));
        airlines.add(createAirline("Saint-Petersburg", "675859", "TY-154", 11, 10, 1));
        airlines.add(createAirline("Minsk", "PP3443", "Airbus A310", 11, 10, 3));
        airlines.add(createAirline("Kursk", "686790", "TY-134", 12, 50, 3));
        airlines.add(createAirline("Klin", "353594", "Airbus A310", 13, 40, 1));
        airlines.add(createAirline("Novosibirsk", "J36306", "Airbus A310", 14, 35, 2));
        airlines.add(createAirline("Oryol", "R45756", "Airbus A310", 15, 38, 1));
        airlines.add(createAirline("Kiev", "Q23423", "Airbus A310", 16, 31, 6));
        airlines.add(createAirline("Odessa", "SU4215", "Airbus A330", 17, 35, 5));
        airlines.add(createAirline("Yalta", "SU8769", "Airbus A310", 18, 42, 1));
        airlines.add(createAirline("Smolensk", "JT3775", "Airbus A310", 19, 55, 4));
        airlines.add(createAirline("Pskov", "UU4357", "Airbus A310", 20, 39, 2));
        airlines.add(createAirline("Minsk", "PO3231", "Airbus A330", 20, 21, 4));
        airlines.add(createAirline("Minsk", "PO3233", "Airbus A310", 21, 21, 7));
        airlines.add(createAirline("Grodno", "MN6675", "Airbus A320", 22, 29, 1));
        airlines.add(createAirline("Brest", "NN2342", "Airbus A310", 23, 45, 3));

        System.out.println("a) Список рейсов для заданного пункта назначения");

        String point = "Minsk";
        for (int i = 0; i < airlines.size(); i++) {
            if (airlines.get(i).getDestination().equals(point)){
                System.out.println(airlines.get(i).toString());
            }
        }
//        airlines.stream().filter(air -> point.equals(air.getDestination())).forEachOrdered((air) -> System.out.println(air.toString()));

        System.out.println("b) Список рейсов для заданного дня недели");
        int day1 = 1;
        for (int i = 0; i < airlines.size(); i++) {
            if (airlines.get(i).getdayOfTheWeek()==day1){
                System.out.println(airlines.get(i).toString());
            }
        }
//        airlines.stream().filter(air -> (day1 == air.getdayOfTheWeek())).forEachOrdered((air) -> System.out.println(air.toString()));

        System.out.println("c) Список рейсов для заданного дня недели, время вылета для которых больше заданного.");

        int day2 = 1;
        int hour = 9;
        int minutes = 10;
        for (int i = 0; i < airlines.size(); i++) {
            if (airlines.get(i).getdayOfTheWeek()==day2 && airlines.get(i).getTimeHour()==hour &&
                airlines.get(i).getTimeMinutes()==minutes){
                System.out.println(airlines.get(i).toString());
            }
        }
//        airlines.stream().filter(air -> (day2 == air.getdayOfTheWeek() && hour == air.getTimeHour() && minutes == air.getTimeMinutes()
//        )).forEachOrdered((air) -> System.out.println(air.toString()));
    }

    private static Airline createAirline(String destination, String trainNumber, String typeAircraft, int timeHour, int timeMinutes, int dayOfTheWeek) {
        Airline airline = new Airline();
        airline.setDestination(destination);
        airline.setTrainNumber(trainNumber);
        airline.setTypeAircraft(typeAircraft);
        airline.setTimeHour(timeHour);
        airline.setTimeMinutes(timeMinutes);
        airline.setdayOfTheWeek(dayOfTheWeek);
        return airline;
    }
}
