package behavior_patterns.strategy_pattern;

public class SubstractOperation implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
