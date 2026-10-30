import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
