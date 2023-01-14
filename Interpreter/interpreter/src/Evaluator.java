import java.util.Stack;

interface Expression {
    int interpret();
}

class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public int interpret() {
        return number;
    }
}

class AddExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public AddExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    public int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }
}

class MultiplyExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public MultiplyExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    public int interpret() {
        return leftExpression.interpret() * rightExpression.interpret();
    }
}

class DivideExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public DivideExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    public int interpret() {
        return leftExpression.interpret() / rightExpression.interpret();
    }
}

class SubtractExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public SubtractExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    public int interpret() {
        return leftExpression.interpret() - rightExpression.interpret();
    }
}
class Evaluator {
    private Stack<Expression> stack = new Stack<Expression>();

    public int evaluate(String expression) {
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (token.equals("+")) {
                Expression right = stack.pop();
                Expression left = stack.pop();
                Expression subExpression = new AddExpression(left, right);
                stack.push(subExpression);
            } else if (token.equals("*")) {
                Expression right = stack.pop();
                Expression left = stack.pop();
                Expression subExpression = new MultiplyExpression(left, right);
                stack.push(subExpression);
            } else if (token.equals("-")) {
                Expression right = stack.pop();
                Expression left = stack.pop();
                Expression subExpression = new SubtractExpression(left, right);
                stack.push(subExpression);
            } else if (token.equals("/")) {
                Expression right = stack.pop();
                Expression left = stack.pop();
                Expression subExpression = new DivideExpression(left, right);
                stack.push(subExpression);
            } else {
                try {
                    int value = Integer.parseInt(token);
                    stack.push(new NumberExpression(value));
                } catch (NumberFormatException e) {
                    // throw exception or return error
                }
            }
        }
        
        return stack.pop().interpret();
    }
}
