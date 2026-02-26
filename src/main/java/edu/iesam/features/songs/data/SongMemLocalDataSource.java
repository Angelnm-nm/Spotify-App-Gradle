package edu.iesam.features.songs.data;

import edu.iesam.features.songs.domain.Song;

import java.util.ArrayList;

public class SongMemLocalDataSource {
    private static SongMemLocalDataSource instance = null;

    private ArrayList<Song> songsMemStorage = new ArrayList<>();

    public SongMemLocalDataSource() {
        initData();
    }

    public void initData() {
        Song song1 = new Song();
        songsMemStorage.add(song1);

        Song song2 = new Song();
        songsMemStorage.add(song2);
    }

    public ArrayList<Song> findAll() {
        return songsMemStorage;
    }
    public void save(Song song) {
        songsMemStorage.add(song);
    }
    public static SongMemLocalDataSource newInstance(){
        if (instance == null){
            instance = new SongMemLocalDataSource();
        }

        return instance;
    }

}
