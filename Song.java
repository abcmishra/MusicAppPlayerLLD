public class Song {
    private String id; // Unique identifier for the song
    private String title;
    private Artist artist;
    private Album album;
    private String format; // MP3, WAV, AAC, etc.
    private int duration; // In seconds
    private String filePath; // Path to the song file

    // Constructor
    public Song(String id, String title, Artist artist, Album album, String format, int duration, String filePath) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.format = format;
        this.duration = duration;
        this.filePath = filePath;
    }

    // Getters and Setters
    public String getId() { return id; }
    public String getTitle() { return title; }
    public Artist getArtist() { return artist; }
    public Album getAlbum() { return album; }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFormat() { return format; }
    public int getDuration() { return duration; }
    public String getFilePath() { return filePath; }
}