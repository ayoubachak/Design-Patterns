// Target Interface
interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}

// Adaptee class
class VlcPlayer implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }
    public void playMp4(String fileName) {
        // do nothing
    }
}

class Mp4Player implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        // do nothing
    }
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}

// Adapter class
interface MediaPlayer {
    void play(String audioType, String fileName);
}

class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;
    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}

// Client class
class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else{
            System.out.println("Invalid media. "+ audioType + " format not supported");
        }
    }
}
