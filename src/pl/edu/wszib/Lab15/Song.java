package pl.edu.wszib.Lab15;

public class Song {
    private String artist;
  private String title;
   private String albums;

    public Song(String artist, String title, String albums) {
        this.artist = artist;
        this.title = title;
        this.albums = albums;
    }

    @Override
    public String toString() {
        return "Song{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                ", albums='" + albums + '\'' +
                '}';
    }
}
