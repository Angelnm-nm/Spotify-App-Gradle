package edu.iesam.features.albums.presentation;

import edu.iesam.features.albums.data.AlbumDataRepository;
import edu.iesam.features.albums.data.AlbumMemLocalDataSource;
import edu.iesam.features.albums.domain.Album;
import edu.iesam.features.albums.domain.GetAlbumsUseCase;
import edu.iesam.features.albums.domain.SaveAlbumsUseCase;
import edu.iesam.features.songs.data.SongDataRepository;
import edu.iesam.features.songs.data.SongMemLocalDataSource;
import edu.iesam.features.songs.domain.SaveSongsUseCase;
import edu.iesam.features.songs.domain.Song;

import java.util.ArrayList;

public class AlbumView {

    public static void printAlbums() {
        GetAlbumsUseCase getAlbumsUseCase = new GetAlbumsUseCase(
                new AlbumDataRepository(
                        new AlbumMemLocalDataSource()));

        ArrayList<Album> albums = getAlbumsUseCase.execute();
        System.out.println(albums);
    }
    public static void saveAuthors() {
        Album newAlbum = new Album("2", "name2", "2000");

        SaveAlbumsUseCase saveAlbumsUseCase = new SaveAlbumsUseCase(
                new AlbumDataRepository(
                        new AlbumMemLocalDataSource()));

        saveAlbumsUseCase.execute(newAlbum);
    }

}
