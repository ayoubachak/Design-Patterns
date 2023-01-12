interface Command {
    void execute();
}

class Calculator {
    int result;

    public void add(int value) {
        result += value;
    }

    public void substract(int value) {
        result -= value;
    }
}

class AddCommand implements Command {
    Calculator calculator;
    int value;

    public AddCommand(Calculator calculator, int value) {
        this.calculator = calculator;
        this.value = value;
    }

    @Override
    public void execute() {
        calculator.add(value);
    }
}

class SubstractCommand implements Command {
    Calculator calculator;
    int value;

    public SubstractCommand(Calculator calculator, int value) {
        this.calculator = calculator;
        this.value = value;
    }

    @Override
    public void execute() {
        calculator.substract(value);
    }
}

class CalculatorInvoker {
    Command command;

    public CalculatorInvoker(Command command) {
        this.command = command;
    }

    public void invoke() {
        command.execute();
    }
}
