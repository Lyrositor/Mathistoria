/*
 * Copyright © 2013 Marc Gagné <gagne.marc@gmail.com>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the COPYING file for more details.
 *
 */

package Mathistoria;

public class Relation {

    public static enum Type {
        HasEvent,
        WarDeclaredBy,
        WarDeclaredTo
    }

    private Type fType;
    private Node fParent;
    private Node fChild;

    /**
     * Establishes a parent-to-child relationship between two nodes.
     */
    public Relation(Type type, Node parent, Node child)
    {

        fType = type;
        fParent = parent;
        fChild = child;

    }

}
