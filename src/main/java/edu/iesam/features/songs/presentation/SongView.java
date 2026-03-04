package edu.iesam.features.songs.presentation;

import edu.iesam.features.authors.data.AuthorDataRepository;
import edu.iesam.features.authors.data.AuthorMemLocalDataSource;
import edu.iesam.features.authors.domain.Author;
import edu.iesam.features.authors.domain.SaveAuthorsUseCase;
import edu.iesam.features.songs.data.SongDataRepository;
import edu.iesam.features.songs.data.SongMemLocalDataSource;
import edu.iesam.features.songs.domain.GetSongsUseCase;
import edu.iesam.features.songs.domain.SaveSongsUseCase;
import edu.iesam.features.songs.domain.Song;

import java.util.ArrayList;

public class SongView {

    public static void printSongs() {
        GetSongsUseCase getSongsUseCase = new GetSongsUseCase(new SongDataRepository(SongMemLocalDataSource.newInstance()));

        ArrayList<Song> songs = getSongsUseCase.execute();

        System.out.println(songs);
    }
    public static void saveAuthors() {
        Song newSong = new Song("2", "name2", "2000", "España");

        SaveSongsUseCase saveSongsUseCase = new SaveSongsUseCase(
                new SongDataRepository(
                        new SongMemLocalDataSource()));

        saveSongsUseCase.execute(newSong);
    }
}

