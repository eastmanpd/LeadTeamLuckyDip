package com.pg.eastmanpd.leadteamluckydip;

import java.util.Random;

/**
 * Created by eastman.pd on 15/01/2015.
 */
public class Instruction {
    public String[] mInstruction = {
            "Come on baby, it's your turn!",
            "Your country needs YOU!",
            "Yeee haaaa!",
            "Buckle up, you're next!",
            "Go get 'um!",
            "don't be scared now...",};

    public String getInstruction () {
        String instruction = "";

        // Randomly select a Lead Team Member
        Random randomGenerator = new Random(); // create a new random number generator
        int randomInstruction  = randomGenerator.nextInt(mInstruction.length);

        instruction = mInstruction[randomInstruction];
        return instruction;
    };


}
