package com.codecool.farm;

import com.codecool.farm.animal.Animal;
import com.codecool.farm.animal.Cattle;
import com.codecool.farm.animal.Pig;
import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;

class Farm {

    private List<Animal> animals;

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public void feedAnimals() {
        List<Animal> feedAnimList = getAnimals();
        feedAnimList.get(0).feed();
        feedAnimList.get(1).feed();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void butcher(Butcher butcher) {
        if(butcher.canButcher(animals.get(animals.size() - 1))) {
            animals.remove(animals.size() - 1);
        }
    }

    public boolean isEmpty() {
        boolean result = false;
        if(animals.isEmpty()) {
            result = true;
        }
        return result;
    }

    public List<String> getStatus() {
        List<String> result = new ArrayList<>();
        String resultAnimal;
        for (int i = 0; i < animals.size(); i++) {
            if(animals.get(i) instanceof Pig) {
                resultAnimal = "pig";
            } else {
                resultAnimal = "cattle";
            }
            result.add(String.format("There is a %d sized %s in the farm.",animals.get(i).getSize(),resultAnimal));
        }
        return result;
    }
}
