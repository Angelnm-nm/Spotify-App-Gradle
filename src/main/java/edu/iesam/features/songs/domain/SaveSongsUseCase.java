package edu.iesam.features.songs.domain;

import edu.iesam.features.authors.domain.Author;
import edu.iesam.features.authors.domain.AuthorRepository;

public class SaveSongsUseCase {

    SongRepository songRepository;

    public SaveSongsUseCase(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public void execute(Song song) {
        songRepository.saveSong(song);
    }

}
