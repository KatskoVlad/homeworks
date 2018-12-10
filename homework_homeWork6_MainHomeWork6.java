package homework.homeWork6;

import com.htp.Lesson6Test.domain.EquipmentEnum;
import homework.homeWork6.util.IceBox;
import homework.homeWork6.util.Television;

public class MainHomeWork6 {
    public static void main(String[] args) {
        Television television = new Television("TV - Plazma", 10000, "Home TV", EquipmentEnum.WARRANTY24,
                41.5,5, "A-88823", "Toshiba" );

        IceBox iceBox = new IceBox("Vertical Icebox", false, "Working", 5);

        System.out.println(television.getWarranty().equals(EquipmentEnum.WARRANTY24));
        television.on();
        television.isPurpose();
        television.getState();
        television.getClassСonsumption();
        System.out.println(iceBox.toString());
        System.out.println(television.toString());

    }
}
