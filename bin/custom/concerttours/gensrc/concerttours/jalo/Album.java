/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 23, 2020, 11:59:57 AM                   ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import concerttours.constants.ConcerttoursConstants;
import concerttours.jalo.Band;
import concerttours.jalo.Song;
import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type Album.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class Album extends GenericItem
{
	/** Qualifier of the <code>Album.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>Album.realeaseYear</code> attribute **/
	public static final String REALEASEYEAR = "realeaseYear";
	/** Qualifier of the <code>Album.bands</code> attribute **/
	public static final String BANDS = "bands";
	/** Qualifier of the <code>Album.types</code> attribute **/
	public static final String TYPES = "types";
	/** Relation ordering override parameter constants for Album2MusicType from ((concerttours))*/
	protected static String ALBUM2MUSICTYPE_SRC_ORDERED = "relation.Album2MusicType.source.ordered";
	protected static String ALBUM2MUSICTYPE_TGT_ORDERED = "relation.Album2MusicType.target.ordered";
	/** Relation disable markmodifed parameter constants for Album2MusicType from ((concerttours))*/
	protected static String ALBUM2MUSICTYPE_MARKMODIFIED = "relation.Album2MusicType.markmodified";
	/** Qualifier of the <code>Album.songs</code> attribute **/
	public static final String SONGS = "songs";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n BANDS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<Album> BANDSHANDLER = new BidirectionalOneToManyHandler<Album>(
	ConcerttoursConstants.TC.ALBUM,
	false,
	"bands",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SONGS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Song> SONGSHANDLER = new OneToManyHandler<Song>(
	ConcerttoursConstants.TC.SONG,
	false,
	"album",
	null,
	false,
	true,
	CollectionType.SET
	).withRelationQualifier("songs");
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(REALEASEYEAR, AttributeMode.INITIAL);
		tmp.put(BANDS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Album.bands</code> attribute.
	 * @return the bands
	 */
	public Band getBands(final SessionContext ctx)
	{
		return (Band)getProperty( ctx, "bands".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Album.bands</code> attribute.
	 * @return the bands
	 */
	public Band getBands()
	{
		return getBands( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Album.bands</code> attribute. 
	 * @param value the bands
	 */
	public void setBands(final SessionContext ctx, final Band value)
	{
		BANDSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Album.bands</code> attribute. 
	 * @param value the bands
	 */
	public void setBands(final Band value)
	{
		setBands( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		BANDSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	@Override
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("MusicType");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(ALBUM2MUSICTYPE_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Album.realeaseYear</code> attribute.
	 * @return the realeaseYear - Date of realease
	 */
	public Date getRealeaseYear(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, "realeaseYear".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Album.realeaseYear</code> attribute.
	 * @return the realeaseYear - Date of realease
	 */
	public Date getRealeaseYear()
	{
		return getRealeaseYear( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Album.realeaseYear</code> attribute. 
	 * @param value the realeaseYear - Date of realease
	 */
	public void setRealeaseYear(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, "realeaseYear".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Album.realeaseYear</code> attribute. 
	 * @param value the realeaseYear - Date of realease
	 */
	public void setRealeaseYear(final Date value)
	{
		setRealeaseYear( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Album.songs</code> attribute.
	 * @return the songs
	 */
	public Set<Song> getSongs(final SessionContext ctx)
	{
		return (Set<Song>)SONGSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Album.songs</code> attribute.
	 * @return the songs
	 */
	public Set<Song> getSongs()
	{
		return getSongs( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Album.songs</code> attribute. 
	 * @param value the songs
	 */
	public void setSongs(final SessionContext ctx, final Set<Song> value)
	{
		SONGSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Album.songs</code> attribute. 
	 * @param value the songs
	 */
	public void setSongs(final Set<Song> value)
	{
		setSongs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to songs. 
	 * @param value the item to add to songs
	 */
	public void addToSongs(final SessionContext ctx, final Song value)
	{
		SONGSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to songs. 
	 * @param value the item to add to songs
	 */
	public void addToSongs(final Song value)
	{
		addToSongs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from songs. 
	 * @param value the item to remove from songs
	 */
	public void removeFromSongs(final SessionContext ctx, final Song value)
	{
		SONGSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from songs. 
	 * @param value the item to remove from songs
	 */
	public void removeFromSongs(final Song value)
	{
		removeFromSongs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Album.title</code> attribute.
	 * @return the title - name of album
	 */
	public String getTitle(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "title".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Album.title</code> attribute.
	 * @return the title - name of album
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Album.title</code> attribute. 
	 * @param value the title - name of album
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "title".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Album.title</code> attribute. 
	 * @param value the title - name of album
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Album.types</code> attribute.
	 * @return the types
	 */
	public Collection<EnumerationValue> getTypes(final SessionContext ctx)
	{
		final List<EnumerationValue> items = getLinkedItems( 
			ctx,
			true,
			ConcerttoursConstants.Relations.ALBUM2MUSICTYPE,
			"MusicType",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Album.types</code> attribute.
	 * @return the types
	 */
	public Collection<EnumerationValue> getTypes()
	{
		return getTypes( getSession().getSessionContext() );
	}
	
	public long getTypesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			ConcerttoursConstants.Relations.ALBUM2MUSICTYPE,
			"MusicType",
			null
		);
	}
	
	public long getTypesCount()
	{
		return getTypesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Album.types</code> attribute. 
	 * @param value the types
	 */
	public void setTypes(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setLinkedItems( 
			ctx,
			true,
			ConcerttoursConstants.Relations.ALBUM2MUSICTYPE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ALBUM2MUSICTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Album.types</code> attribute. 
	 * @param value the types
	 */
	public void setTypes(final Collection<EnumerationValue> value)
	{
		setTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to types. 
	 * @param value the item to add to types
	 */
	public void addToTypes(final SessionContext ctx, final EnumerationValue value)
	{
		addLinkedItems( 
			ctx,
			true,
			ConcerttoursConstants.Relations.ALBUM2MUSICTYPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ALBUM2MUSICTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to types. 
	 * @param value the item to add to types
	 */
	public void addToTypes(final EnumerationValue value)
	{
		addToTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from types. 
	 * @param value the item to remove from types
	 */
	public void removeFromTypes(final SessionContext ctx, final EnumerationValue value)
	{
		removeLinkedItems( 
			ctx,
			true,
			ConcerttoursConstants.Relations.ALBUM2MUSICTYPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ALBUM2MUSICTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from types. 
	 * @param value the item to remove from types
	 */
	public void removeFromTypes(final EnumerationValue value)
	{
		removeFromTypes( getSession().getSessionContext(), value );
	}
	
}
