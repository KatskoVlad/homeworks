package homework.homeWork2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DzNum2 {
    private static int[] arr = {99, 80, 30, 80, 50, 10, 20, 70, 40, 60, 99};

    public static void main(String[] args) {
//        int[] m = new int [10];
//        for(int a = 0; a<m.length; a++) m[a]=R.nextInt(50);

        System.out.println("Task 1: Write a Java program to sort a numeric array and a string array.");
        // numeric array
        int[] arrTemp = sort(arr);
        printArr(arrTemp);

        //string array
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[10];
        for (int i = 0; i < 10; i++) {
            str[i] = scanner.nextLine();
        }


        System.out.println("Task 2");
        int summa = sum(arr);
        printInt(summa);

        System.out.println("Task 3");
        int[][] p = new int[10][5];
        paintGrid("-", p);

        System.out.println("Task 4");
        double average = summa / arr.length;
        System.out.println("Average is " + average);

        System.out.println("Task 5");
        findElement(99, arr);

        System.out.println("Task 6");
        System.out.println("Array element index: " + findIndex(99, arr));

        System.out.println("Task 7");
        arrTemp = removeElement(50, arr);
        printArr(arrTemp);

        System.out.println("Task 8");
        arrTemp = copyArray(arr);
        printArr(arrTemp);

        System.out.println("Task 9");
        System.out.println("Before");
        printArr(arrTemp);
        arrTemp = insertArrayOnIndex(77, 1, arr);
        System.out.println("After");
        printArr(arrTemp);

        System.out.println("Task 10");
        System.out.println("Max element in Array: " + maxElement(arr));
        System.out.println("Min element in Array: " + minElement(arr));

        System.out.println("Task 11");
        System.out.println("Before");
        printArr(arrTemp);
        arrTemp = changeArray(arr);
        System.out.println("After");
        printArr(arrTemp);

        System.out.println("Task 12");
        repeatIntegerElements(arr);

        System.out.println("Task 13");
        String[] arrString = {"Ivan", "Alex", "Slava", "Dima", "Ignat", "Vlad", "Oleg", "Maxim", "Ivan", "Pavel"};
        repeatStringElements(arrString);

        System.out.println("Task 14");
        String[] arrString1 = {"Ivan", "Alex", "Slava", "Dima", "Ignat", "Vlad", "Oleg", "Maxim", "Ivan", "Pavel"};
        String[] arrString2 = {"Ivan1", "Alex", "Slava", "Dima2", "Ignat3", "Vlad", "Oleg4", "Maxim5", "Ivan6", "Pavel"};
        repeatStringTwoElements(arrString1, arrString2);

        System.out.println("Task 15");
        int[] arrInt1 = {88, 55, 10, 22, 70, 40, 60, 99};
        int[] arrInt2 = {99, 80, 30, 80, 50, 10, 20, 70};
        repeatIntegerTwoElements(arrInt1, arrInt2);

        System.out.println("Task 16");
        int[] arrInt = {88, 55, 10, 22, 70, 40, 60, 99, 88, 10};
        arrInt = sort(arrInt);
        arrInt = removeRepeatInteger(arrInt);
        printArr(arrInt);

        System.out.println("Task 17");
        int[] arrInt3 = {98, 99, 10, 100, 105, 100, 60, 99, 107, 10};
        int res1 = retriveTwoMaxElem(arrInt3);
        System.out.println(sortReverce(arrInt3));


        System.out.println("Task 18");
        int[] arrInt4 = {88, 10, 10, 22, 70, 40, 6, 99, 99, 9};
        int res2 = retriveTwoMinElem(arrInt4);
        printInt(res2);

        System.out.println("Task 19");
        createTwoMatrixOneSize();

        System.out.println("Task 20");

    }

    private static void printArr(int[] arr) {
        for (int element : arr) {
            System.out.println(element);
        }
    }

    // Task 1
    private static int[] sort(int[] arr) {
        int index = 0;
        int goodSortArr = 0;
        while (true) {
            if (arr[index] > arr[index + 1]) {
                int q = arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = q;
                goodSortArr = 0;
            } else {
                goodSortArr++;
            }
            index++;
            if (index == arr.length - 1) {
                index = 0;
            }
            if (goodSortArr == arr.length - 1)
                break;
        }
        return arr;
    }

    // Task 2
    private static int sum(int[] arr) {
        int summa = 0;
        for (int i = 0; i < arr.length; i++) {
            summa += arr[i];
        }
        return summa;
    }

    private static void printInt(int summa) {
        System.out.println(summa);
    }

    // Task 3
    private static void paintGrid(String symbol, int[][] p) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf(symbol, p[j][i]);
            }
            System.out.println("");
        }
    }

    // Task 5
    private static void findElement(int element, int[] arr) {
        boolean foundElement = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                foundElement = true;
                break;
            }
        }
        if (foundElement) {
            System.out.println("Set element exists in this array!");
        } else {
            System.out.println("Set element does not exist in this array!");
        }
    }

    // Task 6
    private static int findIndex(int element, int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
            }
        }
        return index;
    }

    // Task 7
    private static int[] removeElement(int element, int[] arr) {
        int[] array = new int[arr.length - 1];
        int indexRemove = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                indexRemove = i;
            }
            if (indexRemove == 0) {
                array[i] = arr[i];
            } else {
                array[indexRemove] = arr[i + 1];
                indexRemove++;
            }
            if (arr.length - 1 == indexRemove) {
                break;
            }
        }

        return array;
    }

    // Task 8
    private static int[] copyArray(int[] arr) {
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }
        return array;
    }

    // Task 9
    private static int[] insertArrayOnIndex(int element, int index, int[] arr) {
        arr[index] = element;
        return arr;
    }

    // Task 10
    private static int maxElement(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int minElement(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Task 11
    private static int[] changeArray(int[] arr) {
        int[] array = new int[arr.length];
        int i = 0;
        for (int j = arr.length - 1; j >= 0; j--) {
            array[i] = arr[j];
            i++;
        }
        return array;
    }

    // Task 12
    private static void repeatIntegerElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    System.out.println("Repeating integer element in Array: " + arr[i]);
                    break;
                }
            }
        }
    }

    // Task 13
    private static void repeatStringElements(String[] arrStr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arrStr.length; j++) {
                if ((arrStr[j]).equals(arrStr[i])) {
                    System.out.println("Repeating string in Array: " + arrStr[i]);
                }
            }
        }
    }

    // Task 14
    private static void repeatStringTwoElements(String[] arr1, String[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    System.out.println("Repeating to String in two Array: " + arr1[i]);
                }
            }
        }
    }

    // Task 15
    private static void repeatIntegerTwoElements(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println("Repeating to String in two Array: " + arr1[i]);
                }
            }
        }
    }

    // Task 15
    private static int[] removeRepeatInteger(int[] arr) {
        int unique = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                unique++;
            }
        }
        int[] resultat = new int[unique];
        int k = 0;
        if (resultat.length > 0)
            resultat[k++] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                resultat[k++] = arr[i];
            }
        }
        return resultat;
    }

    // Task 16
    private static int sortReverce(int[] arr) {
        int[] array = new int[arr.length];
        arr = sort(arr);
        int index = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            array[index] = arr[i];
            index++;
        }
        return array[1];
    }

    // Task 17
    private static int retriveTwoMaxElem(int[] array) {
//        int high1 = Integer.MAX_VALUE;
//        int high2 = Integer.MAX_VALUE;
//        for (int i : array) {
//            if (i<high1) {
//                high2 = high1;
//                high1 = i;
//            } else if (i<high2) {
//                high2 = i;
//            }
//        }
//        return high2;

//        int max = 0;
//        int not_max = 0;
//        for (int x : array) {
//            if (x > not_max){
//                not_max = x;
//                if (x > max){
//                    not_max = max;
//                    max = x;
//                }
//            }
//        }
//        return max;
        Arrays.sort(array);
        int index = array.length - 1;
        while (array[index] == array[array.length - 1]) {
            index--;
        }
        return array[index];
    }

    // Task 18
    private static int retriveTwoMinElem(int[] array) {
        int high1 = Integer.MIN_VALUE;
        int high2 = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > high1) {
                high2 = high1;
                high1 = i;
            } else if (i > high2) {
                high2 = i;
            }
        }
        return high2;
    }

    // Task 19
    private static void createTwoMatrixOneSize() {
        Random random = new Random();
        int[][] matrica1 = new int[2][2];
        int[][] matrica2 = new int[2][2];
        for (int i = 0; i < matrica1.length; i++) {
            for (int j = 0; j < matrica1.length; j++) {
                matrica1[i][j] = random.nextInt();
            }
        }
        for (int i = 0; i < matrica2.length; i++) {
            for (int j = 0; j < matrica2.length; j++) {
                matrica2[i][j] = random.nextInt();
            }
        }
        for (int i = 0; i < matrica1.length; i++) {
            for (int j = 0; j < matrica2.length; j++) {
                System.out.println(matrica1[i][j] + " + " + matrica2[i][j] + " = " + (matrica1[i][j] + matrica2[i][j]));
            }
        }
    }
    // Task 20
}
