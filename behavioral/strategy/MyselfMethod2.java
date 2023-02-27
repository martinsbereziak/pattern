package patterns.behavioral.strategy;

import static java.lang.String.format;

public class MyselfMethod2 {
    private IWearingStrategy _wearingStrategy = new DefaultWearingStrategy();

    public void ChangeStrategy(IWearingStrategy wearingStrategy) {
        _wearingStrategy = wearingStrategy;
    }

    public void GoOutside() {
        var clothes = _wearingStrategy.GetClothes();
        var accessories = _wearingStrategy.GetAccessories();
        System.out.println(format("Today I wore %s and took %s", clothes, accessories));
    }

}
