public class Main {
    public static void main(String[] args) {
        User robert = new User();
        robert.setName("Robert");

        User john = new User();
        john.setName("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
