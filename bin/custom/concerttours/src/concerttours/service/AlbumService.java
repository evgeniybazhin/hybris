package concerttours.service;

import concerttours.model.AlbumModel;

import java.util.List;

public interface AlbumService {
    List<AlbumModel> getAlbums(String type);
    Integer getCountOfAlbums();
}
