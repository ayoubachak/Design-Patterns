public class Main {
    public static void main(String[] args) {
        Evaluator evaluator = new Evaluator();
        System.out.println(evaluator.evaluate("2"));
        System.out.println(evaluator.evaluate("2 3 +"));
        System.out.println(evaluator.evaluate("5 ( 2 3 + ) *"));
        System.out.println(evaluator.evaluate("10 ( 5 2 * ) -"));
        // System.out.println(evaluator.evaluate("20 / (5 * 2)")); I dont have enouh time to implement this type of calculation, if you could do a pull request, it would be great 🥺
        
    }
}
