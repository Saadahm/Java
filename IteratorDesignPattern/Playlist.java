package IteratorDesignPattern;

import java.util.ArrayList;

public interface Playlist {
    PlaylistIterator createIterator();
    void addSong(String s);
}
