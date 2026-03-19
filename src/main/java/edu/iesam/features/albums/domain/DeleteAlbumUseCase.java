package edu.iesam.features.albums.domain;

import edu.iesam.features.albums.data.AlbumDataRepository;
import edu.iesam.features.albums.presentation.AlbumView;

public class   DeleteAlbumUseCase {
    private AlbumRepository albumRepository;

    public DeleteAlbumUseCase(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }
}

