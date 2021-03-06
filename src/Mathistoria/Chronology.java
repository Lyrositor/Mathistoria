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

    private int fCurrentPeriod;
    private NodeList fNodes;

    /**
     * Initializes the chronology to a blank state.
     */
    public Chronology()
    {

        fNodes = new NodeList();

    }

    /**
     * Based on the current state, calculates the next event(s) to
     * occur.
     * @param period The current period being simulated.
     */
    public void generateEvents(int period)
    {
        
        fCurrentPeriod = period;

        // Always generate a new nation when the simulation begins.
        if (period == 0)
        {
            addEvent(Event.EventType.NationFounded);
            return;
        }

        // Process each nation to determine their current state.
        ArrayList<Nation> nations = fNodes.getByType(new Nation(0));
        for (int i = 0; i < nations.size(); i++)
        {
            Nation nation = nations.get(i);
            nation.update(fCurrentPeriod);
        }

    }

    /**
     * Adds a new event to the chronology.
     * Related nodes can be optionally specified (warring nations,
     * revolutionary leaders...).
     * @param type The type of event to generate.
     * @param nodes A list of required nodes for the generation of the
     * event.
     */
    private Event addEvent(Event.EventType type, Node... nodes)
    {

        Event newEvent = null;
        if (type == Event.EventType.NationFounded)
        {
            Nation nation = new Nation(fCurrentPeriod);
            fNodes.add(nation);
            newEvent = new NationFounded(fCurrentPeriod, nation);
        }
        fNodes.add(newEvent);
        return newEvent;

    }

    /**
     * Utility class for node management.
     */
    private class NodeList
    {
        private ArrayList<Node> fNodeList;

        /**
         * Initializes an empty node list.
         */
        public NodeList()
        {

            fNodeList = new ArrayList<Node>();

        }

        /**
         * Adds a new node to the list.
         * @param node The node to add to the NodeList.
         */
        public void add(Node node)
        {

            int nodeId = fNodeList.size();
            node.setId(nodeId);
            fNodeList.add(node);

        }

        /**
         * Removes a node from the list.
         * @param nodeId The desired node's ID.
         */
        public boolean remove(int nodeId)
        {

            for (int i = 0; i < fNodeList.size(); i++)
                if (((Node) fNodeList.get(i)).getId() == nodeId)
                {
                    fNodeList.remove(i);
                    return true;
                }
            return false;

        }

        /**
         * Returns the node with the specified ID.
         * @param nodeId The desired node's ID.
         */
        public Node get(int nodeId)
        {

            for (int i = 0; i < fNodeList.size(); i++)
            {
                Node node = (Node) fNodeList.get(i);
                if (node.getId() == nodeId)
                    return node;
            }
            return null;

        }

        /**
         * Returns a list of nodes with the specified Type.
         * @param nodeType The type of node to look for.
         */
        public <T> ArrayList<T> getByType(T type)
        {

            ArrayList<T> filteredNodes = new ArrayList<T>();
            for (int i = 0; i < fNodeList.size(); i++)
            {
                if (fNodeList.get(i).getClass().equals(type.getClass()))
                {
                    T node = (T) fNodeList.get(i);
                    filteredNodes.add(node);
                }
            }
            return filteredNodes;

        }

        /**
         * Returns a list of all nodes.
         */
        public Node[] getNodes()
        {

            return fNodeList.toArray(new Node[fNodeList.size()]);

        }
    }

}
