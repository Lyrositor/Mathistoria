/*
 * Copyright © 2013 Marc Gagné <gagne.marc@gmail.com>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the COPYING file for more details.
 *
 */


public class Mathistoria {

    final static int PERIOD = 12;

    // Starts the main loop; each iteration corresponds to one month.
    public static void main(String args[]) {

        int maxYears;
        String outputFolder;
        Chronology chronology = new Chronology();

        // Ensure we have both a number of iterations to perform and
        // an output folder.
        if (args.length == 2)
        {
            maxYears = Integer.parseInt(args[0]);
            outputFolder = args[1];
        }
        else
        {
            System.out.println(
                "Please specify the number of years to iterate over " +
                "and the output folder."
            );
            return;
        }

        // Main loop.
        for (int i=0; i < maxYears * PERIOD; i++)
        {
            System.out.printf("Simulating Year %d, Period %d\n",
                (i - i % PERIOD) / PERIOD,
                i % PERIOD
            );
        }

        // Output the data in HTML format by default.
        HTMLWriter outputWriter = new HTMLWriter();
        outputWriter.write(chronology, outputFolder);

    }

}
