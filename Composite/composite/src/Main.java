public class Main {
    public static void main(String[] args) {
        FileSystemComponent root = new Directory("root");
        FileSystemComponent home = new Directory("home");
        FileSystemComponent user = new Directory("user");
        FileSystemComponent documents = new Directory("documents");
        FileSystemComponent file1 = new File("file1.txt", 100);
        FileSystemComponent file2 = new File("file2.txt", 200);

        root.add(home);
        home.add(user);
        user.add(documents);
        documents.add(file1);
        documents.add(file2);

        System.out.println("File system structure:");
        root.display();

        System.out.println("\nCopying entire file system to /backup:");
        root.copy("/backup");

        System.out.println("\nMoving entire file system to /mnt:");
        root.move("/mnt");

        System.out.println("\nRenaming user directory to 'myuser': ");
        user.rename("myuser");
        root.display();
    }
}
