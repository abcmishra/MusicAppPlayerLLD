import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusicLibrary {
    private Map<String, Song> songs; // Key: Song ID
    private Map<String, Playlist> playlists; // Key: Playlist ID

    public MusicLibrary() {
        this.songs = new HashMap<>();
        this.playlists = new HashMap<>();
    }

    // Add a song to the library
    public void addSong(Song song) {
        if(!songs.containsKey(song))
          songs.put(song.getId(), song);
        else {
            System.out.println(" Given key already exists:" +song);
        }
    }

    // Search songs by title, artist, or album
    public List<Song> searchSongs(String keyword) {
        return songs.values().stream()
                .filter(song -> song.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                        song.getArtist().getName().toLowerCase().contains(keyword.toLowerCase()) ||
                        song.getAlbum().getTitle().toLowerCase().contains(keyword.toLowerCase()))
                .toList();
    }


    public void addPlaylist(Playlist playlist) {
        playlists.put(playlist.getId(), playlist);
    }

    public Playlist getPlaylist(String playlistId) {
        return playlists.get(playlistId);
    }
}