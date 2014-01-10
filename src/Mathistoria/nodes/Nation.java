/*
 * Copyright © 2013 Marc Gagné <gagne.marc@gmail.com>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the COPYING file for more details.
 *
 */

package Mathistoria;

class Nation extends Node {

    private int fFoundationPeriod;
    private double fHappiness;
    private int fPopulation;
    private double fPopulationMod;

    /**
     * Founds a new nation and generates its characteristics randomly.
     * @param foundationPeriod The period during which the nation was
     * founded.
     */
    public Nation(int foundationPeriod)
    {

        fFoundationPeriod = foundationPeriod;
        fHappiness = Math.random() * 0.3 + 0.7;
        fPopulation = (int) Math.random() * 5000 + 10000;
        fPopulationMod = Math.random() * 3 + 1.2;
        fPopulation *= Math.sqrt((double) foundationPeriod + 1);
        update(foundationPeriod);

    }

    /**
     * Updates the nation's properties to account for the time which has
     * passed.
     */
    public void update(int period)
    {

        fPopulation *= fPopulationMod;

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
