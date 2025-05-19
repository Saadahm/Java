package IteratorDesignPattern;

import java.util.ArrayList;

public class ArrayListCDIterator implements PlaylistIterator{

    ArrayList<String> songs;
    int index;
    public ArrayListCDIterator(ArrayList<String> songs){
        this.songs=songs;
        index=0;
    }
    @Override
    public boolean hasNext() {
        return index<songs.size();
    }

    @Override
    public String next() {
        return songs.get(index++);
    }
}
