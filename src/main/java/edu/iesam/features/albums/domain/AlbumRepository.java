package edu.iesam.features.albums.domain;

import edu.iesam.features.songs.domain.Song;

import java.util.ArrayList;

public interface AlbumRepository {

    public ArrayList<Album> getAlbums();
    public void saveAlbum(Album album);

}
