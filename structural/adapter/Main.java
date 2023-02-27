package patterns.structural.adapter;

import java.io.IOException;

import static patterns.structural.adapter.ElectricityConsumer.ChargeNotebook;

public class Main {

    public static void main(String[] args) throws IOException {
        var newElectricitySystem = new NewElectricitySystem();
        ChargeNotebook(newElectricitySystem);
        var oldElectricitySystem = new OldElectricitySystem();
        var adapter = new Adapter(oldElectricitySystem);
        ChargeNotebook(adapter);
    }
    
}