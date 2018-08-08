package p03_dependency_inversion;

public class MultiplyStrategy implements Strategy{
    public int calculate(int firstOperand, int secondOperand){
        return firstOperand * secondOperand;
    }
}
