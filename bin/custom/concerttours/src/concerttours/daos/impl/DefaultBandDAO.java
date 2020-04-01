package concerttours.daos.impl;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.sql.Timestamp;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.time.TimeService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import concerttours.daos.BandDAO;
import concerttours.model.BandModel;

@Component(value = "bandDAO")
public class DefaultBandDAO implements BandDAO
{
    /**
     * Use SAP Commerce FlexibleSearchService for running queries against the database
     */
    @Autowired
    private FlexibleSearchService flexibleSearchService;

    @Autowired
    private TimeService timeService;
    /**
     * Finds all Bands by performing a FlexibleSearch using the {@link FlexibleSearchService}.
     */
    @Override
    public List<BandModel> findBands()
    {
        // Build a query for the flexible search.
        final String queryString = //
                "SELECT {p:" + BandModel.PK + "} "//
                        + "FROM {" + BandModel._TYPECODE + " AS p} ";
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        // Note that we could specify paginating logic by providing a start and count variable (commented out below)
        // This can provide a safeguard against returning very large amounts of data, or hogging the database when there are
        // for example millions of items being returned.
        // As we know that there are only a few persisted bands in this use case we do not need to provide this.
        //query.setStart(start);
        //query.setCount(count);
        // Return the list of BandModels.
        return flexibleSearchService.<BandModel> search(query).getResult();
    }
    /**
     * Finds all Bands by given code by performing a FlexibleSearch using the {@link FlexibleSearchService}.
     */
    @Override
    public List<BandModel> findBandsByCode(final String code)
    {
        final String queryString = //
                "SELECT {p:" + BandModel.PK + "}" //
                        + "FROM {" + BandModel._TYPECODE + " AS p} "//
                        + "WHERE " + "{p:" + BandModel.CODE + "}=?code ";
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        query.addQueryParameter("code", code);
        return flexibleSearchService.<BandModel> search(query).getResult();
    }

    @Override
    public Integer getCountOfBands(Long periodHours) {
        final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery("SELECT * FROM {Band AS b} WHERE {b:creationTime} > ?date");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, Integer.parseInt("-" + periodHours));
        Date yesterdayDate = cal.getTime();
        flexibleSearchQuery.addQueryParameter("date", yesterdayDate);
//        String queryString = "SELECT * FROM {Band as b} WHERE {b.creationTime} > " + timestamp;
        SearchResult<BandModel> result = flexibleSearchService.search(flexibleSearchQuery);
        if(result != null){
            return result.getCount();
        }else{
            return 0;
        }
    }
}