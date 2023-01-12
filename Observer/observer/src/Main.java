public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        NewsChannel channel1 = new NewsChannel();
        NewsChannel channel2 = new NewsChannel();
        agency.registerObserver(channel1);
        agency.registerObserver(channel2);
        agency.setMessage("Breaking News: New Coronavirus strain found");
    }
}
