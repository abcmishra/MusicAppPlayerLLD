public class Main {
    public static void main(String[] args) {
        // Create Artists
        Artist artist1 = new Artist("Taylor Swift");
        Artist artist2 = new Artist("Ed Sheeran");

        // Create Albums
        Album album1 = new Album("1989", artist1);
        Album album2 = new Album("Divide", artist2);

        // Create Songs
        Song song1 = new Song("1", "Blank Space", artist1, album1, "MP3", 240, "path/to/blank_space.mp3");
        Song song2 = new Song("2", "Style", artist1, album1, "MP3", 230, "path/to/style.mp3");
        Song song3 = new Song("3", "Shape of You", artist2, album2, "MP3", 250, "path/to/shape_of_you.mp3");

        // Add songs to albums
        album1.addSong(song1);
        album1.addSong(song2);
        album2.addSong(song3);

        // Create Playlist
        Playlist playlist = new Playlist("101", "My Favorites");
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);

        // Create Music Library
        MusicLibrary library = new MusicLibrary();
        library.addSong(song1);
        library.addSong(song2);
        library.addSong(song3);
        library.addPlaylist(playlist);

        // Create Music Player
        MusicPlayer player = new MusicPlayer();
    }
}

