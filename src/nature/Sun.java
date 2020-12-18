package nature;
import interfaces.*;
public class Sun implements ConditionChecker, StatusSetter {
    private boolean sunset = true;
    @Override
    public void evening() {
        sunset = true;
    }
    @Override
    public void morning() {
        sunset = false;
    }

    @Override
    public boolean condition() {
        return sunset;
    }

    @Override
    public void printCondition() {
        System.out.println(condition() ? "Солнце клонилось к закату" :
                "Солнце в зените");
    }
}
