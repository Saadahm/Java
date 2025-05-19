package IteratorDesignPattern;

import java.util.ArrayList;

public class SpotifyPlayer implements Playlist{

    ArrayList<String> songs=new ArrayList<>();

    @Override
    public PlaylistIterator createIterator() {
        return new FavoritesListSpotifyIterator(songs);
    }
   public void addSong(String songName)
    {
        if(songName.contains("Fav"))
            songs.add(songName);
    }


}
