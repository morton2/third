package com.codecool.farm;

import com.codecool.farm.animal.Animal;

class Butcher {

    boolean result = false;

    public boolean canButcher(Animal pig) {
        if(pig.getSize() > 4) {
           result = true;
        }
        return result;
    }
}
