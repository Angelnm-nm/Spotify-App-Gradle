package edu.iesam.features.songs.domain;

import edu.iesam.features.authors.domain.Author;

import java.util.ArrayList;

public interface SongRepository {

    ArrayList<Song> getSongs();
    public void saveSong(Song song);
}
