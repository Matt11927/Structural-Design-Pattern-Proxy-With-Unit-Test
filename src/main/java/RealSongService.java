import java.util.ArrayList;
import java.util.List;

public class RealSongService implements SongService {

    private ArrayList<Song> songs = new ArrayList<>();

    public void addSong(Song song) { songs.add(song);}

    @Override
    public Song searchSongId(Integer songID) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}

        for (Song song : songs) {
            if (song.getSongID() == songID) {
                return song;
            }
        }

        return null;
    }

    @Override
    public List<Song> searchSongTitle(String title) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}

        List<Song> results = new ArrayList<>();

        for (Song song : songs) {
            if (song.getSongTitle().equalsIgnoreCase(title)) {
                results.add(song);
            }
        }

        return results;
    }

    @Override
    public List<Song> searchSongAlbum(String album) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}

        List<Song> results = new ArrayList<>();

        for (Song song : songs) {
            if (song.getSongAlbum().equalsIgnoreCase(album)) {
                results.add(song);
            }
        }

        return results;
    }
}
