import java.util.*;

public class Library {
    private User user;
    private List<Playlist> playlists;

    public Library(User user) {
        this.user = user;
        this.playlists = new ArrayList<>();
    }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public List<Playlist> getPlaylists() { return playlists; }
    public void addPlaylist(Playlist playlist) { playlists.add(playlist); }
}