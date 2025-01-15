import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private  String name;
    private String id;
    private List<Song> songs;

    public Playlist(String name,String id){
        this.name=name;
        this.id=id;
        this.songs= new ArrayList<>();
    }

    public void addSong(Song song){
        if(!songs.contains(song)){
            this.songs.add(song);
        }
        else {
            System.out.println("SOng already present");
        }
    }

    public void removeSong(Song song){
        if(songs.contains(song)){
            songs.remove(song);
        }
        else {
            System.out.println("Song is not present in the playlist");
        }
    }

    public List<Song> getSongs(){
        return songs;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
