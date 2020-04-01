package concerttours.jobs;

import concerttours.model.PeriodAwareCronJobModel;
import concerttours.model.ReportItemModel;
import concerttours.service.AlbumService;
import concerttours.service.BandService;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.apache.log4j.Logger;

import java.util.Date;

public class ReportJob extends AbstractJobPerformable<PeriodAwareCronJobModel> {
    private static final Logger LOG = Logger.getLogger(ReportJob.class);
    private AlbumService albumService;
    private BandService bandService;
    @Override
    public PerformResult perform(PeriodAwareCronJobModel periodAwareCronJobModel) {
        ReportItemModel report = new ReportItemModel();
        report.setAmountOfAlbums(albumService.getCountOfAlbums());
        report.setAmountOfBands(bandService.getCountOfBand(periodAwareCronJobModel.getPeriodHours()));
        report.setTimestamp(new Date());
        LOG.info("Coding task");
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    public AlbumService getAlbumService() {
        return albumService;
    }

    public void setAlbumService(AlbumService albumService) {
        this.albumService = albumService;
    }

    public BandService getBandService() {
        return bandService;
    }

    public void setBandService(BandService bandService) {
        this.bandService = bandService;
    }
}
