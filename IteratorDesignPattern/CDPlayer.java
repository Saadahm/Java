package IteratorDesignPattern;

import java.util.ArrayList;

public class CDPlayer implements Playlist{

    ArrayList<String>songs=new ArrayList<>();
    @Override
    public PlaylistIterator createIterator() {
        return new ArrayListCDIterator(songs);
    }

    public void addSong(String songName)
    {
        songs.add(songName);
    }

}
