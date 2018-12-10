package homework.homeWork4;

import java.util.ArrayList;
import java.util.List;

public class MainTransport {
    public static List<ElectroBus> electroBusList;
    public static List<Car> carList;
    public static List<Bus> busList;

    public static void main(String[] args) {
        electroBusList = new ArrayList<ElectroBus>();
        generateCountElectroBus(7, 3);
        generateCountElectroBus(2, 1);
        generateCountElectroBus(9, 2);

        carList = new ArrayList<Car>();
        generateCountCar(10, 1);
        generateCountCar(5, 2);

        busList = new ArrayList<Bus>();
        generateCountBus(5, 1);
        generateCountBus(3, 2);

        printTrans(busList);
        printTrans(carList);
        printTrans(electroBusList);


        electroBusList.get(0).drive();
        electroBusList.get(0).stop();
        electroBusList.get(0).parking();
        System.out.println(electroBusList.get(9).toString());
        electroBusList.get(3).setSpeed(67);
        electroBusList.get(3).controlmaxSpeed(electroBusList.get(3).getSpeed());
        electroBusList.get(3).goDistance(11000);
        System.out.println(electroBusList.get(3).toString());

        electroBusList.get(1).setDistance(12000);
        electroBusList.get(1).drive();
        electroBusList.get(1).go();
        electroBusList.get(1).stop();

        //Whether 5 people will take Neoplan buses 5
        int countMest = 0;
        int countBus = 0;
        for (Bus bus : busList) {
            countBus++;
            if (countBus > 5)
                break;
            if (bus.getNameTransport().equals("Neoplan"))
                countMest += bus.getCountPassenger();
        }
        if (countMest > 250)
            System.out.println("Yes");
        else
            System.out.println("No");


        //System.out.println(electroBusList.get(1).getMiles());

        System.out.println(electroBusList.get(0).equals(carList.get(0)));
        System.out.println(electroBusList.get(0).equals(busList.get(3)));
        System.out.println(carList.get(1).equals(busList.get(2)));
        //System.out.println(busList.get(10).equals(busList.get(1)));

        System.out.println(electroBusList.get(0).getStatus());
        printTrans(electroBusList);
    }

    public static void generateCountElectroBus(int count, int type){
        for (int i = 0; i < count; i++) {
            electroBusList.add(generateElectroBus(type));
        }
    }
    public static ElectroBus generateElectroBus(int type){
    ElectroBus electroBus = null;
    switch (type){
        case 1:
        electroBus = new ElectroBus(2,"Gruzovoy", "MAN", 2,
                    18, false, 0, "AB-00034968");
        case 2:
            electroBus = new ElectroBus(4,"Gruzovoy", "MAZ",3,
                    20, false, 0, "NN-000234234");
        case 3:
            electroBus = new ElectroBus(8,"Passagerkiy", "Scania",133,
                    24, false, 0, "PP-34534557364");
        }
        return electroBus;
    }

    public static void generateCountCar(int count, int type){
        for (int i = 0; i < count; i++) {
            carList.add(generateCar(type));
        }
    }
    public static Car generateCar(int type) {
        Car newCar = null;
        switch (type) {
            case 1:
                newCar = new Car(2, "HatchBeck", "Tesla",
                    5, 100, false, 0, "TE 1234 - 7");
                break;
            case 2:
                newCar = new Car(2, "Sedan", "Volvo",
                        5, 200, false, 0, "UQ-000789");
                break;
            case 3:
                newCar = new Car(2, "Minivan", "Volkswagen",
                        7, 500, true, 0, "PO-345342");
                break;
            }
        return newCar;
    }

    public static void generateCountBus(int count, int type){
        for (int i = 0; i<count; i++) {
            busList.add(generateBus(type));
        }
    }

    public static Bus generateBus(int type){
        Bus newBus = null;
        switch (type){
            case 1:
            newBus = new Bus(3, "Bus - Turist 42 passenger", "Neoplan",
                    20, true, 42, 0, "VC-0001");
            case 2:
            newBus = new Bus(3, "Bus - City 56 passenger", "MAZ",
                    22, true, 56, 0, "LK-000345");
        }
        return newBus;
    }
    public static void printTrans(List list){
        for (Object object: list) {
            System.out.println(object);
        }
    }
}