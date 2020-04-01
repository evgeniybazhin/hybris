package concerttours.daos;

import concerttours.enums.MusicType;
import concerttours.model.AlbumModel;

import java.util.List;

public interface AlbumDAO {
    List<AlbumModel> getAlbums(String type);
    Integer getCountOfAlbums();
}
