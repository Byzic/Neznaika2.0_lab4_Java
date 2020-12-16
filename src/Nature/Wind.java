package Nature;
import Interfaces.*;

public class Wind implements ConditionChecker, StatusSetter {
    private boolean strong = true;
    @Override
    public void evening() {
        strong = true;
    }
    @Override
    public void morning() {
        strong = false;
    }

    @Override
    public boolean condition() {
        return strong;
    }

    @Override
    public void printCondition() {
        System.out.println(condition() ? "Ветер крепчал" :
                "Погода была безветренной");
    }
}


