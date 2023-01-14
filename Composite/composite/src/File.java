class File implements FileSystemComponent {
    private String name;
    private long size;
    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }
    public void display() {
        System.out.println("File: " + name + ", size: " + size);
    }
    public void copy(String destination) {
        System.out.println("Copying file " + name + " to " + destination);
    }
    public void move(String destination) {
        System.out.println("Moving file " + name + " to " + destination);
    }
    public void rename(String newName) {
        System.out.println("Renaming file " + name + " to " + newName);
        this.name = newName;
    }
    @Override
    public void add(FileSystemComponent home) {
        // TODO Auto-generated method stub
        
    }
}
