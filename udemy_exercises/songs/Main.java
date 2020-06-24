package udemy_exercises.songs;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Storm Bringer", "Deep Purple");
        album.addSong("Storm Bringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("the gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);

        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        Scanner s = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist.");
            return;
        } else {
            System.out.println("Now playing => " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = s.nextInt();
            s.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Playlist Complete.");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing: " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist.");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing: " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the playlist.");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list.");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else {
                            System.out.println("Now playing " + listIterator.previous());

                        }
                    }
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions: \nPress:");
        System.out.println("0 - to quit");
        System.out.println("1 - to play the next song");
        System.out.println("2 - to play the previous song");
        System.out.println("3 - to replay the current song");
        System.out.println("4 - list songs in the playlist");
        System.out.println("5 - print available actions");
        System.out.println("6 - delete current song from playlist");
        System.out.print("Selection: ");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("============================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("============================");
    }

}