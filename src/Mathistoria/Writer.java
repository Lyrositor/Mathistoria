/*
 * Copyright © 2013 Marc Gagné <gagne.marc@gmail.com>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the COPYING file for more details.
 *
 */

package Mathistoria;

public abstract class Writer {

    static protected enum Format {
        HTML
    }

    private Format fOutputFormat;

    public Writer()
    {

        this(Format.HTML);

    }

    public Writer(Format outputFormat)
    {

        fOutputFormat = outputFormat;

    }

    public boolean write(Chronology chronology)
    {

        return false;

    }

}
