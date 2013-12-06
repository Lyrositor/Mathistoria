/*
 * Copyright © 2013 Marc Gagné <gagne.marc@gmail.com>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the COPYING file for more details.
 *
 */

package Mathistoria;

public class HTMLWriter extends Writer {

    public HTMLWriter()
    {

        super(Format.HTML);

    }

    public boolean write(Chronology chronology, String outputFolder)
    {

        return true;

    }

}

