/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 31, 2020, 5:26:45 PM                    ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type PeriodAwareCronJob.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class PeriodAwareCronJob extends CronJob
{
	/** Qualifier of the <code>PeriodAwareCronJob.periodHours</code> attribute **/
	public static final String PERIODHOURS = "periodHours";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PERIODHOURS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PeriodAwareCronJob.periodHours</code> attribute.
	 * @return the periodHours
	 */
	public Long getPeriodHours(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, "periodHours".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PeriodAwareCronJob.periodHours</code> attribute.
	 * @return the periodHours
	 */
	public Long getPeriodHours()
	{
		return getPeriodHours( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PeriodAwareCronJob.periodHours</code> attribute. 
	 * @return the periodHours
	 */
	public long getPeriodHoursAsPrimitive(final SessionContext ctx)
	{
		Long value = getPeriodHours( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PeriodAwareCronJob.periodHours</code> attribute. 
	 * @return the periodHours
	 */
	public long getPeriodHoursAsPrimitive()
	{
		return getPeriodHoursAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PeriodAwareCronJob.periodHours</code> attribute. 
	 * @param value the periodHours
	 */
	public void setPeriodHours(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, "periodHours".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PeriodAwareCronJob.periodHours</code> attribute. 
	 * @param value the periodHours
	 */
	public void setPeriodHours(final Long value)
	{
		setPeriodHours( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PeriodAwareCronJob.periodHours</code> attribute. 
	 * @param value the periodHours
	 */
	public void setPeriodHours(final SessionContext ctx, final long value)
	{
		setPeriodHours( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PeriodAwareCronJob.periodHours</code> attribute. 
	 * @param value the periodHours
	 */
	public void setPeriodHours(final long value)
	{
		setPeriodHours( getSession().getSessionContext(), value );
	}
	
}
