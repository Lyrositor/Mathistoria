/*
 * Copyright © 2013 Marc Gagné <gagne.marc@gmail.com>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the COPYING file for more details.
 *
 */

package Mathistoria;

import java.util.*;

public class Chronology {

    private ArrayList fEvents;
    private ArrayList fRelations;

    /**
     * Initializes the chronology to a blank state.
     */
    public Chronology()
    {

        fEvents = new ArrayList();
        fRelations = new ArrayList();

    }

    /**
     * Based on the current state, calculates the next event(s) to
     * occur.
     */
    public void generateEvents(int i)
    {
        // Always generate a new nation when the simulation begins.
        if (i == 0)
        {
            addEvent(Event.Type.NationFounded);
            return;
        }
    }

    /**
     * Adds a new event to the chronology.
     * Related nodes can be optionally specified (warring nations,
     * revolutionary leaders...).
     */
    private Event addEvent(Event.Type type, Node... nodes)
    {
        Event newEvent = null;
        if (type == Event.Type.NationFounded)
        {
            Nation nation = new Nation();
        }
        return newEvent;
    }

}
