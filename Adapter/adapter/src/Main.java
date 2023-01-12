public class Main {
    public static void main(String[] args) {
        // first example 
        Shape[] shapes = {new RectangleAdapter(new Rectangle())};
        for (Shape shape : shapes) {
            shape.draw();
        }

        // Second example 
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "bruh.mp3");
        audioPlayer.play("mp4", "Will any one even see this content.mp4");
        audioPlayer.play("vlc", "I think not.vlc");
        audioPlayer.play("avi", "this seems to need some marketing.avi");
    }
}
