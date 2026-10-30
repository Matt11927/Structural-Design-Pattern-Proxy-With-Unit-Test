public class Song {

    private int songID;
    private String songTitle;
    private String artist;
    private String album;
    private int songDuration;
    public Song(int songID, String songTitle, String artist, String album, int songDuration) {
        this.songID = songID;
        this.songTitle = songTitle;
        this.artist = artist;
        this.album = album;
        this.songDuration = songDuration;
    }

    public int getSongID() { return songID; }

    public String getSongTitle() { return songTitle; }

    public String getArtist() { return artist; }

    public String getSongAlbum() { return album; }

    public int getSongDuration() { return songDuration;}
}
