package de.kingsword.energy_api.component;

import de.kingsword.energy_api.capability.EnergyProducer;
import de.kingsword.energy_api.capability.EnergyStorage;

public class Generator implements EnergyProducer, EnergyStorage {
    private int storedEnergy = 0;
    private int capacity = 10000;
    @Override
    public int produceEnergy(int amount) {
        return 0;
    }

    @Override
    public int getStoredEnergy() {
        return 0;
    }

    @Override
    public void storeEnergy(int amount) {

    }

    @Override
    public int retrieveEnergy(int amount) {
        return 0;
    }

    @Override
    public void setCapacity(int capacity) {

    }

    @Override
    public int getCapacity() {
        return 0;
    }
}
