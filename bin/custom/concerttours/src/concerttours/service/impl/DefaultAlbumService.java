package concerttours.service.impl;

import concerttours.daos.AlbumDAO;
import concerttours.model.AlbumModel;
import concerttours.service.AlbumService;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DefaultAlbumService implements AlbumService {
    @Autowired
    private AlbumDAO albumDAO;

    @Override
    public List<AlbumModel> getAlbums(String type) {
        List<AlbumModel> result = albumDAO.getAlbums(type);
        if(result == null){
            throw new UnknownIdentifierException("Albums with code '" + type + "' not found!");
        }
        return result;
    }

    @Override
    public Integer getCountOfAlbums() {
        return albumDAO.getCountOfAlbums();
    }
}
