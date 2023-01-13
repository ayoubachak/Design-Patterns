public class Main {
    public static void main(String[] args) {
        RemoteServer server = new RemoteServerProxy("ayoubachak.com", "user", "password");
        server.connect();
        server.execute("task1");
        server.execute("task2");
        server.disconnect();
    }
}
