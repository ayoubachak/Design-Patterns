public class Main {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayCollection<>(5);
        collection.add(1);
        collection.add(2);
        collection.add(3);

        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Integer item = iterator.next();
            System.out.println(item);
        }
    }
}
