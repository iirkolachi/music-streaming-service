public class MainApp {
    public static void main(String[] args) {
        StreamingService spotify = new StreamingService("Spotify");

        Artist artist = new Artist("Imagine Dragons");
        Album album = new Album("Night Visions", artist);
        Song song = new Song("Demons", 178, artist);
        album.addSong(song);
        artist.addAlbum(album);

        User user = new User("iirkola_chi", "iirkolachi@yahoo,com");
        Playlist playlist = new Playlist("Favorites", user);
        playlist.addSong(song);
        user.getLibrary().addPlaylist(playlist);

        SubscriptionPlan premium = new SubscriptionPlan("basic+", 15);
        SubscriptionService subService = new SubscriptionService();
        subService.subscribeUser(user, premium, spotify);

        SongPlayer player = new SongPlayer();
        player.playSong(song, album, playlist);

        System.out.println("Total subscription plans created: " + SubscriptionPlan.getTotalPlans());
        System.out.println("Total users subscribed: " + StreamingService.getTotalUsers());
    }
}