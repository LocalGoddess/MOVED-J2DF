package me.hammer86gn.d2df.event;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * An annotation used to define that a method is an <i>Event</i>
 * <p></p>
 * <b>Warning</b> cancelling an event that cannot be cancelled will result in an exception being thrown
 */
@Documented
@Target(ElementType.METHOD)
public @interface EventHelper {
    /**
     * Should the event be cancelled or not
     *
     * @return <i>true</i> if event should be cancelled <i>false</i> otherwise
     */
    boolean cancelled() default false;
}
