/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 20, 2020, 2:22:35 PM                    ---
 * ----------------------------------------------------------------
 */
package concerttours.constants;

/**
 * @deprecated since ages - use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast"})
public class GeneratedConcerttoursConstants
{
	public static final String EXTENSIONNAME = "concerttours";
	public static class TC
	{
		public static final String ALBUM = "Album".intern();
		public static final String BAND = "Band".intern();
		public static final String CONCERT = "Concert".intern();
		public static final String CONCERTTYPE = "ConcertType".intern();
		public static final String MUSICTYPE = "MusicType".intern();
		public static final String SONG = "Song".intern();
	}
	public static class Attributes
	{
		public static class MusicType
		{
			public static final String ALBUM = "album".intern();
			public static final String BANDS = "bands".intern();
		}
		public static class Product
		{
			public static final String BAND = "band".intern();
			public static final String HASHTAG = "hashtag".intern();
		}
	}
	public static class Enumerations
	{
		public static class ConcertType
		{
			public static final String OPENAIR = "openair".intern();
			public static final String INDOOR = "indoor".intern();
		}
		public static class MusicType
		{
			// no values defined
		}
	}
	public static class Relations
	{
		public static final String ALBUM2BAND = "Album2Band".intern();
		public static final String ALBUM2MUSICTYPE = "Album2MusicType".intern();
		public static final String BAND2MUSICTYPE = "Band2MusicType".intern();
		public static final String PRODUCT2ROCKBAND = "Product2RockBand".intern();
		public static final String SONG2ALBUM = "Song2Album".intern();
		public static final String SONG2BAND = "Song2Band".intern();
	}
	
	protected GeneratedConcerttoursConstants()
	{
		// private constructor
	}
	
	
}
