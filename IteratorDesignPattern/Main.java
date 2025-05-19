package IteratorDesignPattern;

public class Main {
    public static void main(String[] args)
    {
        Playlist playlist1=new CDPlayer();
        playlist1.addSong("Song 1");
        playlist1.addSong("Song 2 Fav");
        playlist1.addSong("Song 3");
        playlist1.addSong("Song 4 Fav");

        PlaylistIterator playlistIterator1= playlist1.createIterator();
        while(playlistIterator1.hasNext())
        {
            System.out.println("Playing: " + playlistIterator1.next());
        }

        Playlist playlist2=new SpotifyPlayer();
        playlist2.addSong("Song 1");
        playlist2.addSong("Song 2 Fav");
        playlist2.addSong("Song 3");
        playlist2.addSong("Song 4 Fav");

        PlaylistIterator playlistIterator2= playlist2.createIterator();

        while(playlistIterator2.hasNext())
        {
            System.out.printf("%nPlaying: " + playlistIterator2.next());
        }

    }
}
