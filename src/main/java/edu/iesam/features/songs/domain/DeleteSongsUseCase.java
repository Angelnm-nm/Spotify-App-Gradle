package edu.iesam.features.songs.domain;

import edu.iesam.features.authors.data.AuthorDataRepository;
import edu.iesam.features.authors.data.AuthorMemLocalDataSource;

public class DeleteSongsUseCase {
    SongRepository songRepository;
    public DeleteSongsUseCase(SongRepository songRepository) {
        this.songRepository = songRepository;

    }
}
