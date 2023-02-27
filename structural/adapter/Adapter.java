package patterns.structural.adapter;

public class Adapter implements INewElectricitySystem {
    private OldElectricitySystem _adaptee;

    public Adapter(OldElectricitySystem adaptee) {
        _adaptee = adaptee;
    }

    public String MatchWideSocket() {
        return _adaptee.MatchThinSocket();
    }
}
