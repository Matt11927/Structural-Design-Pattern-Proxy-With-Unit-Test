import java.util.List;
public interface SongService {
    Song searchSongId(Integer songID);
    List<Song> searchSongTitle(String title);
    List<Song> searchSongAlbum(String album);
}
