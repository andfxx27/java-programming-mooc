package andfxx.p5.objectsandreferences;

public class Song {
    private final String title;
    private final String artist;
    private final int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Song comparedSong)) {
            return false;
        }

        return this.title.equals(comparedSong.title) && this.artist.equals(comparedSong.artist) && this.duration == comparedSong.duration;
    }
}
