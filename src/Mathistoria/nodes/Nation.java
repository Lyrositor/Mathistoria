/*
 * Copyright © 2013 Marc Gagné <gagne.marc@gmail.com>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the COPYING file for more details.
 *
 */

package Mathistoria;

import java.util.Random;

class Nation extends Node {

    private final static String[] fNationNames = {
        "Filencai", "Cordora", "Arnon", "Slince", "Lovio", "Opabaska",
        "Taraskellion", "Tuxiztis", "Zubaqwe", "Tores", "Lensilvan",
        "Ganayesti", "Doromiel", "Mancen", "Dorian"
    };
    private final static Object[][] fRegimes = {
        {"Democracy", 1.4},
        {"Theocracy", 1.8},
        {"Monarchy", 0.9},
        {"Dictatorship", 0.4},
        {"Republic", 1.0},
        {"Oligarchy", 1.0}
    };

    private double fEducation;
    private int fFoundationPeriod;
    private double fHappiness;
    private String fName;
    private int fPopulation;
    private double fPopulationMod;
    private Object[] fRegime;
    private double fTechnology;

    /**
     * Founds a new nation and generates its characteristics randomly.
     * @param foundationPeriod The period during which the nation was
     * founded.
     */
    public Nation(int foundationPeriod)
    {

        Random random = new Random();
        fFoundationPeriod = foundationPeriod;
        fName = fNationNames[random.nextInt(fNationNames.length)];
        fPopulation = 1000 + random.nextInt(
            1000 * (int) Math.pow(foundationPeriod + 1, 2)
        );
        fPopulationMod = Math.random() * 3 + 1.2;
        fPopulation *= Math.sqrt((double) foundationPeriod + 1);
        fRegime = fRegimes[random.nextInt(fRegimes.length)];
        fTechnology = Math.min(Math.pow(foundationPeriod, 2)*0.01, 1.0);
        update(foundationPeriod);

    }

    /**
     * Updates the nation's properties to account for the time which has
     * passed.
     */
    public void update(int period)
    {

        fPopulation *= fPopulationMod;
        fEducation = calculateEducation();
        fHappiness = calculateHappiness();
    }

    /**
     * Returns the nation's date of foundation (as a period int).
     */
    public int getFoundationPeriod()
    {

        return fFoundationPeriod;

    }

    /**
     * Returns the nation's full name.
     */
    public String getName()
    {

        return "The " + fRegime[0] + " of " + fName;

    }

    /**
     * Returns the nation's current population.
     */
    public int getPopulation()
    {

        return fPopulation;

    }

    /**
     * Calculates the population's current level of education.
     */
    public double calculateEducation()
    {

        return 0.0;

    }

    /**
     * Calculates the population's current happiness.
     */
    public double calculateHappiness()
    {
    
        return 0.0;
    
    }

}
