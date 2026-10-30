import java.util.List;

public class Main {

    public static void main(String[] args) {

        RealSongService realService = new RealSongService();


        realService.addSong(new Song(1, "Dreams", "NF", "Perception", 258));

        realService.addSong(new Song(2, "Remember This", "NF", "Perception", 242));

        realService.addSong(new Song(3, "The Search", "NF", "The Search", 248));

        realService.addSong(new Song(4, "Leave Me Alone", "NF", "The Search", 305));

        realService.addSong(new Song(5, "Hope", "NF", "Hope", 270));

        realService.addSong(new Song(6, "Fear", "NF", "Fear", 266));

        realService.addSong(new Song(7, "Give me a Reason", "NF", "Fear", 220));

        SongProxy proxy = new SongProxy(realService);


        System.out.println("First ID Search");
        Song song1 = proxy.searchSongId(1);

        System.out.println(song1.getSongTitle() + " - " + song1.getArtist());

        System.out.println();

        System.out.println("Second ID Search (Cached)");
        Song song2 = proxy.searchSongId(1);

        System.out.println(song2.getSongTitle() + " - " + song2.getArtist());

        System.out.println();


        System.out.println("Search By Title");

        List<Song> titleResults = proxy.searchSongTitle("Dreams");

        for (Song song : titleResults) {
            System.out.println(song.getSongTitle() + " - " + song.getArtist());
        }

        System.out.println();


        System.out.println("Search By Album");

        List<Song> albumResults = proxy.searchSongAlbum("Perception");

        for (Song song : albumResults) {
            System.out.println(song.getSongTitle() + " - " + song.getArtist());
        }

        System.out.println();


        System.out.println("Search By Album Again (Cached)");

        albumResults = proxy.searchSongAlbum("Perception");

        for (Song song : albumResults) {
            System.out.println(song.getSongTitle() + " - " + song.getArtist());
        }



    }
}