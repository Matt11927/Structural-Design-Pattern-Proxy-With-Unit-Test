import java.util.HashMap;
import java.util.List;

public class SongProxy implements SongService {

    private RealSongService realSongService;
    private HashMap<Integer, Song> songIdCache = new HashMap<>();
    private HashMap<String, List<Song>> songTitleCache = new HashMap<>();
    private HashMap<String, List<Song>> songAlbumCache = new HashMap<>();

    public SongProxy(RealSongService realSongService) {
        this.realSongService = realSongService;
    }

    @Override
    public Song searchSongId(Integer songID) {

        if (songIdCache.containsKey(songID)) {
            return songIdCache.get(songID);
        }

        Song song = realSongService.searchSongId(songID);

        if (song != null) {
            songIdCache.put(songID, song);
        }

        return song;
    }

    @Override
    public List<Song> searchSongTitle(String title) {

        if (songTitleCache.containsKey(title)) {
            return songTitleCache.get(title);
        }

        List<Song> songs = realSongService.searchSongTitle(title);

        songTitleCache.put(title, songs);

        return songs;
    }

    @Override
    public List<Song> searchSongAlbum(String album) {

        if (songAlbumCache.containsKey(album)) {
            return songAlbumCache.get(album);
        }

        List<Song> songs = realSongService.searchSongAlbum(album);

        songAlbumCache.put(album, songs);

        return songs;
    }
}