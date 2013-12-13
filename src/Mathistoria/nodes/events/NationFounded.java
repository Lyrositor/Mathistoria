/*
 * Copyright © 2013 Marc Gagné <gagne.marc@gmail.com>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the COPYING file for more details.
 *
 */

package Mathistoria;

class NationFounded extends Event {

    protected final static EventType fEventType = EventType.NationFounded;

    private Nation fNation;

    /**
     * Initializes a new nation foundation event.
     * @param period The period associated with the event.
     * @param nation The nation associated with the event.
     */
    public NationFounded(int period, Nation nation)
    {

        super(period);
        fNation = nation;

    }

}
