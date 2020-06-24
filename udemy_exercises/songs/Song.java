package udemy_exercises.songs;

public class Song {
  private String title;
  private String duration;

  public Song(String title, String duration) {
    this.title = title;
    this.duration = duration;

  }

  private String returnSongData() {
    return "Song Name: " + this.title + " Duration: " + this.duration + " min";
  }

  public String returnTheReturn() {
    return returnSongData();
  }
}

/*
 ** Song Player w/ Java Classes** - **Song class** - Title - Duration - **A song
 * must exist in an album before it can be added to the playlist (so you can
 * only play songs that you own.)**
 */
