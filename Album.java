import java.util.ArrayList;
import java.util.List;

public class Album {
    private String title;
    private Artist artist;
    private List<Song> songs;

    public Album(String title,Artist artist){
        this.title=title;
        this.artist=artist;
        this.songs= new ArrayList<>();
    }

    public void addSong(Song song){
        if(!songs.contains(song)){
            songs.add(song);
        }

        else {
            System.out.println("Song is already present");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
