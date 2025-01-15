import java.util.ArrayList;
import java.util.List;

public class Artist {
    private String name;
    private List<Album> albums;

    // Constructor
    public Artist(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    // Add an album
    public void addAlbum(Album album) {
      if(!albums.contains(album)){
          albums.add(album);
      }
      else {
          System.out.println("Album is already present");
      }
    }

    // Getters
    public String getName() { return name; }
    public List<Album> getAlbums() { return albums; }
}