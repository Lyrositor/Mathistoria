/*
 * Copyright © 2013 Marc Gagné <gagne.marc@gmail.com>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the COPYING file for more details.
 *
 */

package Mathistoria;

class Nation extends Node {

    protected final static Type fType = Type.Nation;

    private int fFoundationPeriod;
    private int fPopulation;

    /**
     * Founds a new nation and generates its characteristics randomly.
     * @param foundationPeriod The period during which the nation was
     * founded.
     */
    public Nation(int foundationPeriod)
    {

        fFoundationPeriod = foundationPeriod;

    }

    /**
     * Returns the nation's date of foundation (as a period int).
     */
    public int getFoundationPeriod()
    {

        return fFoundationPeriod;

    }

    /**
     * Returns the nation's current population.
     */
    public int getPopulation()
    {

        return fPopulation;

    }

}
