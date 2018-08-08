package p03_dependency_inversion;

public class SubtractionStrategy implements Strategy{
    public int calculate(int firstOperand, int secondOperand){
        return firstOperand - secondOperand;
    }
}
