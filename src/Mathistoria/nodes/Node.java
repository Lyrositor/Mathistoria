/*
 * Copyright © 2013 Marc Gagné <gagne.marc@gmail.com>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the COPYING file for more details.
 *
 */

package Mathistoria;

abstract class Node {

    protected int fNodeId;

    /**
     * Returns the node's ID, as stored in the NodeList.
     */
    public int getId()
    {

        return fNodeId;

    }

    /**
     * Sets the node's ID, as stored in the NodeList.
     * @param nodeId The node's new ID.
     */
    public void setId(int nodeId)
    {

        fNodeId = nodeId;

    }

}
