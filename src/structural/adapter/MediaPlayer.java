package structural.adapter;

/**
 * The Adapter Pattern is a structural design pattern that allows two incompatible interfaces to work together.
 * It acts as a bridge between the two interfaces by converting the interface of a class into another interface that the client expects.
 * <p>
 * ---When----
 * When you want to use an existing class but its interface does not match the one you need.
 * When you want to create a reusable class that can work with different interfaces.
 * When you want to work with legacy code without modifying its existing structure.
 */
public interface MediaPlayer {
    void player(String type, String filename);
}

interface AdvancedMediaPlayer {
    void vlcPlayer(String filename);

    void mp4Player(String filename);
}

class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void vlcPlayer(String filename) {
        System.out.println(filename + "-vlc Player");
    }

    @Override
    public void mp4Player(String filename) {
        System.out.println(filename + ".mp4");
    }
}

class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void vlcPlayer(String filename) {
        System.out.println(filename + " vlc player playing");
    }

    @Override
    public void mp4Player(String filename) {
        System.out.println(filename);
    }
}

class Adapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public Adapter(String filename) {
        if (filename.equals("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void player(String type, String filename) {
        if (type.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.vlcPlayer(filename);
        } else {
            advancedMediaPlayer.mp4Player(filename);
        }
    }
}

class AudioPlayer implements MediaPlayer {

    Adapter mediaAdapter;

    @Override
    public void player(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new Adapter(audioType);
            mediaAdapter.player(audioType, fileName);
        } else {
            System.out.println("Invalid media type: " + audioType);
        }
    }
}

class MediaPlayerApplication {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.player("vlc", "sdjkhfh");
    }
}



