package patterns.behavioral.strategy;

public class SunshineWearingStrategy implements IWearingStrategy {
    public String GetClothes() {
        return "T-Shirt";
    }

    public String GetAccessories() {
        return "sunglasses";
    }

}
