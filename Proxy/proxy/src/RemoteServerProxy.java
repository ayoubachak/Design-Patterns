interface RemoteServer {
    void connect();
    void disconnect();
    void execute(String task);
}

class RealRemoteServer implements RemoteServer {
    private String host;
    private String user;
    private String password;

    public RealRemoteServer(String host, String user, String password) {
        this.host = host;
        this.user = user;
        this.password = password;
    }

    public void connect() {
        System.out.println("Connecting to " + host + " as " + user + "...");
    }

    public void disconnect() {
        System.out.println("Disconnecting from " + host + "...");
    }

    public void execute(String task) {
        System.out.println("Executing task '" + task + "' on " + host + " as " + user + "...");
    }
}

class RemoteServerProxy implements RemoteServer {
    private RealRemoteServer server;
    private String host;
    private String user;
    private String password;

    public RemoteServerProxy(String host, String user, String password) {
        this.host = host;
        this.user = user;
        this.password = password;
    }

    public void connect() {
        if (server == null) {
            server = new RealRemoteServer(host, user, password);
        }
        server.connect();
    }

    public void disconnect() {
        if (server != null) {
            server.disconnect();
        }
    }

    public void execute(String task) {
        if (server != null) {
            server.execute(task);
        } else {
            System.out.println("Error: You must connect to the server before executing tasks!");
        }
    }
}
