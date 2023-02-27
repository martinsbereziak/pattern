package patterns.structural.adapter;

public class ElectricityConsumer {

    public static void ChargeNotebook(INewElectricitySystem electricitySystem) {
        System.out.println(electricitySystem.MatchWideSocket());
    }

}
