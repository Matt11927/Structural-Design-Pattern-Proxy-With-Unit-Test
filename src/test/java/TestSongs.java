import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class TestSongs {

    @Test
    public void testSong() {

        Song song = new Song(1, "Dreams", "NF", "Perception", 258);

        int actualSongID = song.getSongID();
        String actualSongTitle = song.getSongTitle();
        String actualArtist = song.getArtist();
        String actualAlbum = song.getSongAlbum();
        int actualSongDuration = song.getSongDuration();

        int expectedSongID = 1;
        String expectedSongTitle = "Dreams";
        String expectedSongArtist = "NF";
        String expectedSongAlbum = "Perception";
        int expectedSongDuration = 258;


        assertEquals(expectedSongID,actualSongID);
        assertEquals(expectedSongTitle,actualSongTitle);
        assertEquals(expectedSongArtist,actualArtist);
        assertEquals(expectedSongAlbum,actualAlbum);
        assertEquals(expectedSongDuration,actualSongDuration);
    }

    @Test
    public void testSongSearchSongId() {

        RealSongService service = new RealSongService();

        Song song = new Song(1, "Dreams", "NF", "Perception", 258);

        service.addSong(song);
        Song actual = service.searchSongId(1);
        Song expected = song;
        assertSame(expected, actual);
    }

    @Test
    public void testSongSearchSongTitle() {

        RealSongService service = new RealSongService();

        Song song = new Song(1, "Dreams", "NF", "Perception", 258);

        service.addSong(song);
        List<Song> actual = service.searchSongTitle("Dreams");
        Song expected = song;
        assertSame(expected, actual.get(0));
    }

    @Test
    public void testSongSearchSongAlbum() {

        RealSongService service = new RealSongService();
        Song song = new Song(1, "Dreams", "NF", "Perception", 258);

        service.addSong(song);
        List<Song> actual = service.searchSongAlbum("Perception");
        Song expected = song;
        assertSame(expected, actual.get(0));
    }


    @Test
    public void testProxyCacheById() {

        RealSongService service = new RealSongService();
        Song song = new Song(1, "Dreams", "NF", "Perception", 258);

        service.addSong(song);
        SongProxy proxy = new SongProxy(service);

        Song actual = proxy.searchSongId(1);
        Song expected = proxy.searchSongId(1);

        assertSame(expected, actual);
    }


}
