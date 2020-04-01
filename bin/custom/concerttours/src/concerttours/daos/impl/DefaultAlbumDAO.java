package concerttours.daos.impl;

import concerttours.daos.AlbumDAO;
import concerttours.enums.MusicType;
import concerttours.model.AlbumModel;
import concerttours.model.BandModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component(value = "albumDAO")
public class DefaultAlbumDAO implements AlbumDAO {
    @Autowired
    private FlexibleSearchService flexibleSearchService;
    @Override
    public List<AlbumModel> getAlbums(String type) {
        String queryString = "SELECT {a:PK} FROM {Album as a JOIN Album2MusicType as rel ON {a:PK} = {rel:source} JOIN MusicType AS m ON {rel:target} = {m:PK}} WHERE {m:code}=?type";
        FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        query.addQueryParameter("type", type);
        return flexibleSearchService.<AlbumModel> search(query).getResult();
    }

    @Override
    public Integer getCountOfAlbums() {
        String queryString = "SELECT * FROM {Album as a}";
        FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        return flexibleSearchService.search(query).getCount();
    }
}
