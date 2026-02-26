package edu.iesam.features.albums.domain;

import edu.iesam.features.songs.domain.Song;
import edu.iesam.features.songs.domain.SongRepository;

public class SaveAlbumsUseCase {

    AlbumRepository albumRepository;

    public SaveAlbumsUseCase(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public void execute(Album album) {
        albumRepository.saveAlbum(album);
    }

}
