package p03_dependency_inversion;


public class PrimitiveCalculator {

    private Strategy currentStrategy;

    public PrimitiveCalculator() {
        this.currentStrategy = new AdditionStrategy();
    }

    public void changeStrategy(char operator) {
        switch (operator) {
            case '+':
                this.currentStrategy = new AdditionStrategy();
                break;
            case '-':
                this.currentStrategy = new SubtractionStrategy();
                break;
            case '/':
                this.currentStrategy = new DivideStrategy();
                break;
            case '*':
                this.currentStrategy = new MultiplyStrategy();
                break;
        }
    }

    public int performCalculation(int firstOperand, int secondOperand) {
        return this.currentStrategy.calculate(firstOperand, secondOperand);
    }
}
