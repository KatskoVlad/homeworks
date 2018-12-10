package homework.homeWork8;

import java.util.Scanner;

public class HomeWork8String {
    public String workingString;
    public static final String WORKINGSTRINGCONST = " Разнообразный и богатый ! опыт! реализация намеченных 1 \n"+
    " плановых заданий способствует подготовки и реализации новых предложений. Товарищи! новая 2 \n"+
    " \"модель\" организационной деятельности играет важную роль в формировании позиций, 3 \n"+
    " занимаемых участниками в отношении поставленных задач? 4 \n" +
    " Повседневная практика показывает, (что) дальнейшее развитие различных форм деятельности 5 \n"+
    " представляет собой интересный эксперимент проверки соответствующий условий активизации! 6 \n"+
    " С другой стороны постоянное информационно-пропагандистское обеспечение нашей деятельности 7 \n"+
    " способствует подготовки и реализации дальнейших направлений развития. Равным образом дальнейшее 8 \n"+
    " развитие различных форм деятельности способствует подготовки и реализации *форм* развития. 9 ";

    public final static char[] VOWELS = {'а', 'у', 'о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е'};
    public final static char[] CONSONANTS = {'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л',
                                             'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};
          public String intputStr(){
        Scanner scanner = new Scanner(System.in);
        workingString = scanner.nextLine();
        return workingString;
    }

    public HomeWork8String(String workingString) {
        this.workingString = workingString;
    }

    public HomeWork8String() {
    }

    public String getWorkingString() {
        return workingString;
    }

    public void setWorkingString(String workingString) {
        this.workingString = workingString;
    }

}
