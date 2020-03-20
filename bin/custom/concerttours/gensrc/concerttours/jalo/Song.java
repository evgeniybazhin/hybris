/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 20, 2020, 2:22:35 PM                    ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import concerttours.constants.ConcerttoursConstants;
import concerttours.jalo.Album;
import concerttours.jalo.Band;
import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type Song.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class Song extends GenericItem
{
	/** Qualifier of the <code>Song.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>Song.duration</code> attribute **/
	public static final String DURATION = "duration";
	/** Qualifier of the <code>Song.lirycs</code> attribute **/
	public static final String LIRYCS = "lirycs";
	/** Qualifier of the <code>Song.band</code> attribute **/
	public static final String BAND = "band";
	/** Qualifier of the <code>Song.album</code> attribute **/
	public static final String ALBUM = "album";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n BAND's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<Song> BANDHANDLER = new BidirectionalOneToManyHandler<Song>(
	ConcerttoursConstants.TC.SONG,
	false,
	"band",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ALBUM's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<Song> ALBUMHANDLER = new BidirectionalOneToManyHandler<Song>(
	ConcerttoursConstants.TC.SONG,
	false,
	"album",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(DURATION, AttributeMode.INITIAL);
		tmp.put(LIRYCS, AttributeMode.INITIAL);
		tmp.put(BAND, AttributeMode.INITIAL);
		tmp.put(ALBUM, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Song.album</code> attribute.
	 * @return the album
	 */
	public Album getAlbum(final SessionContext ctx)
	{
		return (Album)getProperty( ctx, "album".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Song.album</code> attribute.
	 * @return the album
	 */
	public Album getAlbum()
	{
		return getAlbum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Song.album</code> attribute. 
	 * @param value the album
	 */
	public void setAlbum(final SessionContext ctx, final Album value)
	{
		ALBUMHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Song.album</code> attribute. 
	 * @param value the album
	 */
	public void setAlbum(final Album value)
	{
		setAlbum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Song.band</code> attribute.
	 * @return the band
	 */
	public Band getBand(final SessionContext ctx)
	{
		return (Band)getProperty( ctx, "band".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Song.band</code> attribute.
	 * @return the band
	 */
	public Band getBand()
	{
		return getBand( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Song.band</code> attribute. 
	 * @param value the band
	 */
	public void setBand(final SessionContext ctx, final Band value)
	{
		BANDHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Song.band</code> attribute. 
	 * @param value the band
	 */
	public void setBand(final Band value)
	{
		setBand( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		BANDHANDLER.newInstance(ctx, allAttributes);
		ALBUMHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Song.duration</code> attribute.
	 * @return the duration - Duration of song
	 */
	public Long getDuration(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, "duration".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Song.duration</code> attribute.
	 * @return the duration - Duration of song
	 */
	public Long getDuration()
	{
		return getDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Song.duration</code> attribute. 
	 * @return the duration - Duration of song
	 */
	public long getDurationAsPrimitive(final SessionContext ctx)
	{
		Long value = getDuration( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Song.duration</code> attribute. 
	 * @return the duration - Duration of song
	 */
	public long getDurationAsPrimitive()
	{
		return getDurationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Song.duration</code> attribute. 
	 * @param value the duration - Duration of song
	 */
	public void setDuration(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, "duration".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Song.duration</code> attribute. 
	 * @param value the duration - Duration of song
	 */
	public void setDuration(final Long value)
	{
		setDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Song.duration</code> attribute. 
	 * @param value the duration - Duration of song
	 */
	public void setDuration(final SessionContext ctx, final long value)
	{
		setDuration( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Song.duration</code> attribute. 
	 * @param value the duration - Duration of song
	 */
	public void setDuration(final long value)
	{
		setDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Song.lirycs</code> attribute.
	 * @return the lirycs - lyrics
	 */
	public String getLirycs(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "lirycs".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Song.lirycs</code> attribute.
	 * @return the lirycs - lyrics
	 */
	public String getLirycs()
	{
		return getLirycs( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Song.lirycs</code> attribute. 
	 * @param value the lirycs - lyrics
	 */
	public void setLirycs(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "lirycs".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Song.lirycs</code> attribute. 
	 * @param value the lirycs - lyrics
	 */
	public void setLirycs(final String value)
	{
		setLirycs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Song.title</code> attribute.
	 * @return the title - Name of song
	 */
	public String getTitle(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "title".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Song.title</code> attribute.
	 * @return the title - Name of song
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Song.title</code> attribute. 
	 * @param value the title - Name of song
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "title".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Song.title</code> attribute. 
	 * @param value the title - Name of song
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
}
