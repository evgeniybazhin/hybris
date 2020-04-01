package concerttours.attributehandlers;

import concerttours.model.AlbumModel;
import concerttours.model.SongModel;
import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component
public class DurationAttributeHandler extends AbstractDynamicAttributeHandler<String, AlbumModel> {
    final int SECONDS_IN_A_MINUTE = 60;
    @Override
    public String get(AlbumModel model) {
        if(model.getSongs() == null){
            return null;
        }
        Long seconds = 0L;
        for(SongModel song : model.getSongs()){
            seconds += song.getDuration();
        }
        int minutes = (int) (seconds / SECONDS_IN_A_MINUTE);
        seconds -= minutes * SECONDS_IN_A_MINUTE;
        return String.valueOf(minutes) + ":" + seconds;
    }
}
