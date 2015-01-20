package com.pg.eastmanpd.leadteamluckydip;

import java.util.Random;

/**
 * Created by eastman.pd on 15/01/2015.
 */
public class LeadTeam {

    public String[] mLeadTeam = {
            "Rita Bisio",
            "Axel Borlinghaus",
            "Paul Eastman",
            "Nora Forintos",
            "Claudia Jimenez",
            "Brahim Khaloufi",
            "Sam Latif",
            "Dorit Richters",
            "Riccardo Vitale",
            "Erhan Yasli",
            "Look in the Mirror! Do it yourself!" };

    public String getLeadTeamMember () {
        String leadTeamMember = "";

        // Randomly select a Lead Team Member
        Random randomGenerator = new Random(); // create a new random number generator
        int randomLeadTeamMember  = randomGenerator.nextInt(mLeadTeam.length);

        leadTeamMember = mLeadTeam[randomLeadTeamMember];
        return leadTeamMember;
    };
}