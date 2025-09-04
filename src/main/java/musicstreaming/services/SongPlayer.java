package musicstreaming.services;

import musicstreaming.models.*;

public class SongPlayer {

    public void playSong(Song song, Album album, Playlist playlist) {
        System.out.println("Playing " + playlist.getName() + ", " + song.getTitle() + " by " + song.getArtist().getName()
                + " (duration " + song.getDuration() + " seconds) from the album " + album.getName());
    }
}