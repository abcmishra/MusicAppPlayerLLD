import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private Song currentSong;
    private boolean isPlaying;
    private boolean isShuffle;
    private boolean isRepeat;
    private int volume; // 0 to 100
    private Playlist playlist;

    // Constructor
    public MusicPlayer() {
        this.isPlaying = false;
        this.isShuffle = false;
        this.isRepeat = false;
        this.volume = 50; // Default volume
    }

    // Play a song
    public void play(Song song) {
        this.currentSong = song;
        this.isPlaying = true;
        System.out.println("Playing: " + song.getTitle());
    }

    // Pause the current song
    public void pause() {
        if (isPlaying) {
            this.isPlaying = false;
            System.out.println("Paused: " + currentSong.getTitle());
        }
    }

    // Resume playback
    public void resume() {
        if (!isPlaying && currentSong != null) {
            this.isPlaying = true;
            System.out.println("Resumed: " + currentSong.getTitle());
        }
    }

    // Stop playback
    public void stop() {
        if (currentSong != null) {
            System.out.println("Stopped: " + currentSong.getTitle());
            this.currentSong = null;
            this.isPlaying = false;
        }
    }

    // Shuffle mode
    public void toggleShuffle() {
        this.isShuffle = !isShuffle;

        if (isShuffle) {
            List<Song> songs = playlist.getSongs();
            Random random = new Random();

            for (int i = songs.size() - 1; i > 0; i--) {
                int j = random.nextInt(i + 1); // Pick a random index
                // Swap songs[i] and songs[j]
                Song temp = songs.get(i);
                songs.set(i, songs.get(j));
                songs.set(j, temp);
            }
            System.out.println("Shuffle mode ON: Playlist shuffled");
        } else {
            System.out.println("Shuffle mode OFF");
        }
        // Repeat mode
        public void toggleRepeat() {
            this.isRepeat = !isRepeat;
            System.out.println("Repeat mode: " + (isRepeat ? "ON" : "OFF"));
        }

        // Adjust volume
        public void setVolume(int volume){
            this.volume = Math.max(0, Math.min(volume, 100));
            System.out.println("Volume set to: " + this.volume);
        }
    }
}