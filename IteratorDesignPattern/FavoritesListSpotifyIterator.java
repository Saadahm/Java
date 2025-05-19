package IteratorDesignPattern;

import java.util.ArrayList;

public class FavoritesListSpotifyIterator implements PlaylistIterator{
    ArrayList<String>songs;
    int index;
    public FavoritesListSpotifyIterator(ArrayList<String>songs){
        this.songs=songs;
        index=0;
    }
    @Override
    public boolean hasNext() {
        return index<songs.size();
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("No more songs");
        }
        return songs.get(index++);
    }
}
