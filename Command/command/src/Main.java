public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Command addCommand = new AddCommand(calculator, 10);
        Command substractCommand = new SubstractCommand(calculator, 5);
        CalculatorInvoker invoker = new CalculatorInvoker(addCommand);
        invoker.invoke();
        System.out.println(calculator.result);
        invoker = new CalculatorInvoker(substractCommand);
        invoker.invoke();
        System.out.println(calculator.result);
    }
}