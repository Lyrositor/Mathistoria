/*
 * Copyright © 2013 Marc Gagné <gagne.marc@gmail.com>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the COPYING file for more details.
 *
 */

package Mathistoria;

abstract class Event extends Node {

    public static enum EventType {
        Epidemic,
        Famine,
        GoldenAge,
        NationFounded,
        NationDestroyed,
        PersonBorn,
        Revolution,
        WarEnded,
        WarStarted,
        Default
    }
    protected int fPeriod;

    protected final static EventType fEventType = EventType.Default;

    /**
     * Initializes a new event.
     * @param period The period associated with the event.
     */
    public Event(int period)
    {

        super();
        fPeriod = period;

    }

    /**
     * Returns the event's type.
     */
    public EventType getEventType()
    {

        return fEventType;

    }

}
