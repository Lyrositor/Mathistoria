/*
 * Copyright © 2013 Marc Gagné <gagne.marc@gmail.com>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the COPYING file for more details.
 *
 */

package Mathistoria;

public abstract class Event {

    public static enum Type {
        Epidemic,
        Famine,
        GoldenAge,
        NationFounded,
        NationDestroyed,
        PersonBorn,
        Revolution,
        War,
        Default
    }

    protected final static Type fType = Type.Default;

    public Event()
    {
    }

    /**
     * Returns the event's type.
     */
    public Type getType() {

        return fType;

    }

}

