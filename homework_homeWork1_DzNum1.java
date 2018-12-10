package homework.homeWork1;

import java.util.Scanner;

public class DzNum1 {

    public static final int DEFAULT_HOURS_VALUE = 24;
    public static final int DEFAULT_MINUTES_VALUE = 1440;
    public static final int DEFAULT_SECONDS_VALUE = 86400;

    public static void main(String[] args) {
        System.out.println("Task 1");
        System.out.println("Enter your weight: ");
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        System.out.println("Your weight on the moon is equal: " + weight * 0.16);

        System.out.println("Task 2");
        int[] array = {40, 60, 30, 90, 70, 20, 50, 80, 10, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] * 0.1);
        }

        System.out.println("Task 3");
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        boolean boolPolidrom = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                boolPolidrom = false;
                break;
            }
        }
        if (boolPolidrom) {
            System.out.println("Polidrom");
        } else {
            System.out.println("Not polidrom");
        }
        System.out.println("Task 4");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Все четные цифры от 1 до 100: " + i);
            }
        }

        System.out.println("Task 5");
        for (int i = 0; i < 15; i++) {
            if (i % 2 != 0)
                System.out.println("Все нечетные цифры от 1 до 15 " + i);
        }

        System.out.println("Task 6");
        for (int i = 2; i < 100; i += 2) {
            System.out.println(i);
        }

        System.out.println("Task 7");
        int summa = 0;
        for (int i = 20; i < 200; i++) {
            summa += i;
        }
        System.out.println(summa);

        System.out.println("Task 8");
        for (int i = 1; i <= 12; i++) {
            if (i == 1) {
                System.out.println("January");
            } else if (i == 2){
                System.out.println("February");
            } else if (i == 3){
                System.out.println("March");
            } else if(i ==4){
                System.out.println("April");
            } else if (i == 5) {
                System.out.println("May");
            } else if (i == 6) {
                System.out.println("June");
            } else if (i == 7) {
                System.out.println("July");
            } else if (i == 8) {
                System.out.println("August");
            }else if (i == 9) {
                System.out.println("September");
            }else if (i == 10) {
                System.out.println("October");
            }else if (i == 11) {
                System.out.println("November");
            }else if (i == 12) {
                System.out.println("December");
            }
        }
        System.out.println("Task 9");
        int firstValue = 1;
        int secondValue = 2;
        int temp = 0;
        temp = firstValue;
        firstValue = secondValue;
        secondValue = temp;

        System.out.println(firstValue);
        System.out.println(secondValue);

        System.out.println("Task 10");
        int value1 = 10;
        int value2 = 20;
        int resultat = value1 + value2;
        System.out.println(resultat);

        System.out.println("Task 11");
        int val1 = 300;
        int val2 = 600;
        int val3 = 900;
        int max = 0;
        if (val1 > val2) {
            max = val1;
        }else if (val3 > max){
            max = val3;
        }
        System.out.println(max);

        System.out.println("Task 12");
        boolean bool1 = true;
        boolean bool2 = false;
        if (bool1) {
            System.out.println("истина");
        } else {
            System.out.println("ложь");
        }
        if (bool2) {
            System.out.println("истина");
        } else {
            System.out.println("ложь");
        }

        System.out.println("Task 13");
        String str1 = "Первая строка";
        String str2 = "Вторая строка";
        System.out.println(str1 + " " + str2);
        System.out.println(str1.concat(str2));
        System.out.println(String.join(" - ", str1, str2));
        System.out.println("Task 14");
        int v1 = 5;
        int v2 = 10;
        if (v1 > v2) {
            v1 += 3;
        } else {
            v2 += 8;
        }
        System.out.println(v1);
        System.out.println(v2);

        System.out.println("Task 15");
        System.out.println("for");
        for (int i = 1; i < 100; i++) {
            System.out.println(i);
        }
        System.out.println("while");
        int i = 1;
        while (i < 100) {
            System.out.println(i);
            i++;
        }
        System.out.println("do while");
        i = 1;
        do {
            System.out.println(i);
        } while (++i <= 100);

        System.out.println("Task 16");
        System.out.println("Please enter a minimum: ");
        int min1 = scanner.nextInt();
        System.out.println("Please enter a maximum: ");
        int max1 = scanner.nextInt();
        System.out.println("Please enter a step: ");
        int step1 = scanner.nextInt();

        int countStep = ((max1 - min1) / step1) + 1;
        for (int j = 0; j <= countStep; j++) {
            System.out.print(min1 + ", ");
            min1 += step1;
            if (min1 == max1) {
                System.out.println(min1);
                break;
            }
        }

        System.out.println("Task 17");
        double[] array17 = {4.5, 2.2, 5.9, 2.1, 8.3, 7.5};
        double maximum = array17[0];
        for (int index = 0; index < array17.length; index++) {
            if (array17[index] > maximum) {
                maximum = array17[index];
            }
        }
        for (int j = 0; j < array17.length; j++) {
            array17[j] = array17[j] / maximum;
        }
        System.out.println("Maximum - " + maximum);
        for (double a : array17) {
            System.out.println(a);
        }
        System.out.println("Task 18");
        double usd = exchangeCurrency(5555.55, 67.56);
        System.out.println(usd);

        System.out.println("Task *");
        int days = scanner.nextInt();
        calcTime(days);

    }

    public static double exchangeCurrency(double rubli, double kurs) {
        return rubli / kurs;
    }

    //Напишите программу, которая будет считать количество часов, минут и
    //секунд в n-ном количестве суток.
    public static void calcTime(int countDays) {
        if (countDays <= 0) {
            throw new IllegalArgumentException();
        }
        int hours = countDays * DEFAULT_HOURS_VALUE;
        int minutes = countDays * DEFAULT_MINUTES_VALUE;
        int seconds = countDays * DEFAULT_SECONDS_VALUE;
        System.out.println("In " + countDays + " days, count hours: " + hours + ", count minutes: " + minutes + ", count seconds: " +
                seconds);
    }
}
