package musicstreaming.models;

import java.util.*;

public class Playlist {

    private String name;
    private User owner;
    private List<Song> songs;

    public Playlist(String name, User owner) {
        this.name = name;
        this.owner = owner;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song) {
        songs.add(song);
    }
}