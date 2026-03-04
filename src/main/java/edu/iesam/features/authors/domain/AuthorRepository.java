package edu.iesam.features.authors.domain;

import edu.iesam.features.albums.domain.Album;

import java.util.ArrayList;

public interface AuthorRepository {

    public ArrayList<Author> getAuthors();
    public void saveAuthor(Author author);
    public void deleteAuthor(Album album);
}
