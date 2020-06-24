package udemy_exercises.songs;

public class Album {

  public static void main(String[] args) {
    Song s = new Song("Heart Bursts into Fire", "3.5");
    System.out.println(s.returnTheReturn());
  }
}

/*
**Song Player w/ Java Classes**
     - **Album class** 
       - Playlist of **Songs**.
       - addPlayist() (songs must appear in the list in the order by which they were added)
       - stop()
       - nextSong()
       - previousSong()
       - repeatSong()
       - showPlaylist()
       - removePlaylist()
     - **A song must exist in an album before it can be added to the playlist (so you can only play songs that you own.)**
*/