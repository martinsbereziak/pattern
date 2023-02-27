package patterns.behavioral.strategy;

import static java.lang.String.format;

public class MyselfMethod1 {
    public void GoOutside() {
        String weather = "sun";
        String clothes = GetClothes(weather);
        String accessories = GetAccessories(weather);
        System.out.println(format("Today I wore %s and took %s", clothes, accessories));
    }

    private String GetAccessories(String weather) {
        String accessories;
        switch (weather) {
            case "sun":
                accessories = "sunglasses";
                break;
            case "rain":
                accessories = "umbrella";
                break;
            default:
                accessories = "nothing";
                break;
        }
        return accessories;
    }

    private String GetClothes(String weather) {
        String clothes;
        switch (weather) {
            case "sun":
                clothes = "T-Shirt";
                break;
            case "rain":
                clothes = "Coat";
                break;
            default:
                clothes = "Shirt";
                break;
        }
        return clothes;
    }

}
