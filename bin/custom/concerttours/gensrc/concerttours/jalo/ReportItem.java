/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 31, 2020, 5:26:45 PM                    ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type ReportItem.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class ReportItem extends GenericItem
{
	/** Qualifier of the <code>ReportItem.amountOfSong</code> attribute **/
	public static final String AMOUNTOFSONG = "amountOfSong";
	/** Qualifier of the <code>ReportItem.amountOfBands</code> attribute **/
	public static final String AMOUNTOFBANDS = "amountOfBands";
	/** Qualifier of the <code>ReportItem.amountOfAlbums</code> attribute **/
	public static final String AMOUNTOFALBUMS = "amountOfAlbums";
	/** Qualifier of the <code>ReportItem.timestamp</code> attribute **/
	public static final String TIMESTAMP = "timestamp";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(AMOUNTOFSONG, AttributeMode.INITIAL);
		tmp.put(AMOUNTOFBANDS, AttributeMode.INITIAL);
		tmp.put(AMOUNTOFALBUMS, AttributeMode.INITIAL);
		tmp.put(TIMESTAMP, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReportItem.amountOfAlbums</code> attribute.
	 * @return the amountOfAlbums
	 */
	public Integer getAmountOfAlbums(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, "amountOfAlbums".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReportItem.amountOfAlbums</code> attribute.
	 * @return the amountOfAlbums
	 */
	public Integer getAmountOfAlbums()
	{
		return getAmountOfAlbums( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReportItem.amountOfAlbums</code> attribute. 
	 * @return the amountOfAlbums
	 */
	public int getAmountOfAlbumsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAmountOfAlbums( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReportItem.amountOfAlbums</code> attribute. 
	 * @return the amountOfAlbums
	 */
	public int getAmountOfAlbumsAsPrimitive()
	{
		return getAmountOfAlbumsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReportItem.amountOfAlbums</code> attribute. 
	 * @param value the amountOfAlbums
	 */
	public void setAmountOfAlbums(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, "amountOfAlbums".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReportItem.amountOfAlbums</code> attribute. 
	 * @param value the amountOfAlbums
	 */
	public void setAmountOfAlbums(final Integer value)
	{
		setAmountOfAlbums( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReportItem.amountOfAlbums</code> attribute. 
	 * @param value the amountOfAlbums
	 */
	public void setAmountOfAlbums(final SessionContext ctx, final int value)
	{
		setAmountOfAlbums( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReportItem.amountOfAlbums</code> attribute. 
	 * @param value the amountOfAlbums
	 */
	public void setAmountOfAlbums(final int value)
	{
		setAmountOfAlbums( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReportItem.amountOfBands</code> attribute.
	 * @return the amountOfBands
	 */
	public Integer getAmountOfBands(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, "amountOfBands".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReportItem.amountOfBands</code> attribute.
	 * @return the amountOfBands
	 */
	public Integer getAmountOfBands()
	{
		return getAmountOfBands( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReportItem.amountOfBands</code> attribute. 
	 * @return the amountOfBands
	 */
	public int getAmountOfBandsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAmountOfBands( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReportItem.amountOfBands</code> attribute. 
	 * @return the amountOfBands
	 */
	public int getAmountOfBandsAsPrimitive()
	{
		return getAmountOfBandsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReportItem.amountOfBands</code> attribute. 
	 * @param value the amountOfBands
	 */
	public void setAmountOfBands(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, "amountOfBands".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReportItem.amountOfBands</code> attribute. 
	 * @param value the amountOfBands
	 */
	public void setAmountOfBands(final Integer value)
	{
		setAmountOfBands( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReportItem.amountOfBands</code> attribute. 
	 * @param value the amountOfBands
	 */
	public void setAmountOfBands(final SessionContext ctx, final int value)
	{
		setAmountOfBands( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReportItem.amountOfBands</code> attribute. 
	 * @param value the amountOfBands
	 */
	public void setAmountOfBands(final int value)
	{
		setAmountOfBands( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReportItem.amountOfSong</code> attribute.
	 * @return the amountOfSong
	 */
	public Integer getAmountOfSong(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, "amountOfSong".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReportItem.amountOfSong</code> attribute.
	 * @return the amountOfSong
	 */
	public Integer getAmountOfSong()
	{
		return getAmountOfSong( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReportItem.amountOfSong</code> attribute. 
	 * @return the amountOfSong
	 */
	public int getAmountOfSongAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAmountOfSong( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReportItem.amountOfSong</code> attribute. 
	 * @return the amountOfSong
	 */
	public int getAmountOfSongAsPrimitive()
	{
		return getAmountOfSongAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReportItem.amountOfSong</code> attribute. 
	 * @param value the amountOfSong
	 */
	public void setAmountOfSong(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, "amountOfSong".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReportItem.amountOfSong</code> attribute. 
	 * @param value the amountOfSong
	 */
	public void setAmountOfSong(final Integer value)
	{
		setAmountOfSong( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReportItem.amountOfSong</code> attribute. 
	 * @param value the amountOfSong
	 */
	public void setAmountOfSong(final SessionContext ctx, final int value)
	{
		setAmountOfSong( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReportItem.amountOfSong</code> attribute. 
	 * @param value the amountOfSong
	 */
	public void setAmountOfSong(final int value)
	{
		setAmountOfSong( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReportItem.timestamp</code> attribute.
	 * @return the timestamp
	 */
	public Date getTimestamp(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, "timestamp".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReportItem.timestamp</code> attribute.
	 * @return the timestamp
	 */
	public Date getTimestamp()
	{
		return getTimestamp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReportItem.timestamp</code> attribute. 
	 * @param value the timestamp
	 */
	public void setTimestamp(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, "timestamp".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReportItem.timestamp</code> attribute. 
	 * @param value the timestamp
	 */
	public void setTimestamp(final Date value)
	{
		setTimestamp( getSession().getSessionContext(), value );
	}
	
}
