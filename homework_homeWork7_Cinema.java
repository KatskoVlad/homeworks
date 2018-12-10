package homework.homeWork7;

public class Cinema {
    public static void main(String[] args) {
        Films.Inner inner = new Films(1, "Mr.Byn").new Inner(2.10, "comedy", "Jan Reno");
        System.out.println(inner.toString());
    }
}
