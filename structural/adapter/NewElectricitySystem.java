package patterns.structural.adapter;

public class NewElectricitySystem implements INewElectricitySystem {

    public String MatchWideSocket() {
        return "220V";
    }

}
