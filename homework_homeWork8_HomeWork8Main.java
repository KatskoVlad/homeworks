package homework.homeWork8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class HomeWork8Main extends HomeWork8String {

    public static void main(String[] args) {
        HomeWork8String homeWork8String = new HomeWork8String();
        Scanner scanner = new Scanner(System.in);
        homeWork8String.workingString = scanner.nextLine();
        if (homeWork8String.workingString.isEmpty()){
            homeWork8String.workingString = WORKINGSTRINGCONST;
        }
        //Task #1
        printString(1, task1(homeWork8String.workingString));
        //Task #2
        printString(2, task2(homeWork8String.workingString));
        //Task #3
        printString(3, task3(homeWork8String.workingString));
        //Task #4
        printString(4, task4(homeWork8String.workingString, 4, '_'));
        //Task #5
        printString(5, task5(homeWork8String.workingString));
        //Task #6
        System.out.println("Task - 6");
        task6_1(homeWork8String.workingString);
        task6_2(homeWork8String.workingString);
        //Task #7
        task7(homeWork8String.workingString);
        printString(7, task7(homeWork8String.workingString));
        //Task #8
        task8Test(homeWork8String.workingString, 10);
    }

    private static String task1(String workingString){
        //1. Преобразовать текст так, чтобы каждое слово начиналось с заглавной буквы.
        String words[] = workingString.split(" ");
        String outString = "";

        for (String word: words) {
            if (!word.isEmpty()) {
                String firstSymbol = word.substring(0, 1).toUpperCase();
                String allWords = word.substring(1);
                outString += firstSymbol + allWords + " ";
            }
        }
        return outString;
    }
    private static int task2(String workingString){
        //2. Подсчитать количество содержащихся в данном тексте знаков препинания
        int countSymbol = 0;
        char symbol;
        for (int i=0; i<workingString.length()-1; i++) {
            symbol = workingString.charAt(i);
            if (symbol==',' || symbol=='.' ||symbol=='!' ||symbol=='?' ||
                symbol==':' || symbol==';' || symbol=='-')
                countSymbol++;
        }
        return countSymbol;
    }
    private static int task3(String workingString){
        //3.  Определить сумму всех целых чисел, встречающихся в заданном тексте
        int summa = 0;
        String digits = "";
        String words[] = workingString.split(" ");

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j <words[i].length() ; j++) {
                char charValue = words[i].charAt(j);
                if (Character.isDigit(charValue)){
                    summa+=Character.getNumericValue(charValue);
                }
            }
        }
        return summa;
    }

    private static String task4(String workingString, int index, char symbol) {
        //4. В каждом слове текста k-ю букву заменить заданным символом.
        //   Если  k больше длины слова, корректировку не выполнять.
        StringBuilder stringBuilder = new StringBuilder();
        if (workingString != null && workingString.length() > 0 && index > 0) {
            for (String word : workingString.split(" ")) {
                if (word.length() >= index) {
                    stringBuilder.append(word.substring(0, index - 1)).append(symbol).append(word.substring(index, word.length()));
                } else {
                    stringBuilder.append(word);
                }
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
    private static String task5(String workingString){
        //5. Удалить из текста его часть, заключенную между двумя символами,
        // которые вводятся (например, между скобками ‘(’ и ‘)’ или между
        // звездочками ‘*’ и т.п.).
        return workingString.replaceAll("[\"].*[\"]", "")
                            .replaceAll("[(].*[)]", "")
                            .replaceAll("[!].*[!]", "")
                            .replaceAll("[*].*[*]", "");
    }
    private static void task6_1(String workingString){
        //6_1 Variant. Найти и напечатать, сколько раз повторяется в
        // тексте каждое слово, которое встречается в нем.
        String words[] = workingString.toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String word: words) {
            if(!word.isEmpty()){
                Integer countWords = map.get(word);
                if (countWords==null){
                    countWords = 0;
                }
                map.put(word, ++countWords);
            }
        }
        for (String word:words) {
            System.out.println(word+" : "+map.get(word));
        }
    }
    private static void task6_2(String workingString){
        //6_2 Variant. Найти и напечатать, сколько раз повторяется в
        // тексте каждое слово, которое встречается в нем.
        String[] words=workingString.split(" ");
        Object[] wordsdistinct=unique(words);

        for(Object distword: wordsdistinct){
            int i=0;
            for(String oneword: words){
                if (oneword.equals(distword)) {
                    i++;
                }
            }
            System.out.println("Слово:\"" + distword + "\" встречается "+i+" раз(а)");
        }

    }
    private static Object[] unique(String[] arrayName) {
        ArrayList distinct = new ArrayList ();
        for(int i=0; i<arrayName.length;i++ ) {
            if(!distinct.contains(arrayName[i])) {
                distinct.add(arrayName[i]);
            }
        }
        return distinct.toArray();
    }

    private static String task7(String workingString){
        //7. Найти, каких букв, гласных или согласных,
        // больше в каждом предложении текста.
        int countVowels = 0;
        int countConsonants = 0;

        for (int i = 0; i < workingString.length(); i++) {
            for (int j = 0; j < VOWELS.length; j++) {
                if (workingString.charAt(i)==VOWELS[j]){
                    countVowels++;
                }
            }
            for (int k = 0; k <CONSONANTS.length ; k++) {
                if (workingString.charAt(i)==CONSONANTS[k]){
                    countConsonants++;
                }
            }
        }
        return "Count vowels: "+countVowels +" Count consonants: "+ countConsonants;
    }

    private static void task8Test(String workingString, int len){
        String questionSentences = task8(workingString);
        String[] words = splitToWords(questionSentences);
        showCertainLengthWords(words, len);
    }

    private static String[] splitToWords(String string) {
        return string.split("[ ,.:;?!]+");
    }

    private static String[] splitToSentences(String string) {
        return string.split("[!.?]+");
    }

    private static String task8(String workingString) {
        //8. Во всех вопросительных предложениях текста найти и
        // напечатать без повторений слова заданной длины
        String[] partDividedByQuestionMark = workingString.split("[?]+[!]*[ ]*");
        StringBuilder stringBuilder = new StringBuilder();
        String str = partDividedByQuestionMark[partDividedByQuestionMark.length - 1].trim();
        int border = partDividedByQuestionMark.length;
        if (str.matches(".+[!.]")) {
            border = partDividedByQuestionMark.length - 1;
        }
        for (int i = 0; i < border; i++) {
            String[] tempString = splitToSentences(partDividedByQuestionMark[i]);
            stringBuilder.append(tempString[tempString.length - 1]);
            stringBuilder.append("? ");
        }
        return stringBuilder.toString();
    }

    private static void showCertainLengthWords(String[] words, int length) {
        for (String word : words) {
            if (length == word.length()) {
                System.out.println(word);
            }
        }
    }

    private static void printString(int task, String workingString){
        System.out.println("Task - " +task);
        System.out.println(workingString);
    }

    private static void printString(int task, int workingString){
        System.out.println("Task - " +task);
        System.out.println(workingString);
    }
    private static void printString(String workingString){
        System.out.println(workingString);
    }
}
