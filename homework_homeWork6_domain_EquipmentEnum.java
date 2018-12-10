package homework.homeWork6.domain;

public enum EquipmentEnum {
    WARRANTY12(12), WARRANTY24(24), WARRANTY36(36);
    private double warrantys;

    EquipmentEnum(double warrantys) {
        this.warrantys = warrantys;
    }
    public boolean isWarranty(){
        switch (this){
            case WARRANTY12:
                return true;
            case WARRANTY24:
            case WARRANTY36:
                default:
                    return false;
        }
    }

    }
