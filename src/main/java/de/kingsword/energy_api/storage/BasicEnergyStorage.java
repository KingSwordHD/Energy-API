package de.kingsword.energy_api.storage;

import de.kingsword.energy_api.capability.EnergyStorage;

public class BasicEnergyStorage implements EnergyStorage {
    private int storedEnergy = 0;
    private int capacity = 10000;

    @Override
    public int getStoredEnergy() {
        return storedEnergy;
    }

    @Override
    public void storeEnergy(int amount) {
        if (storedEnergy + amount >= capacity) {
            storedEnergy = capacity;
            return;
        }
        storedEnergy += amount;
    }

    @Override
    public int retrieveEnergy(int amount) {
        if (storedEnergy - amount < 0) {
            int remainer = storedEnergy;
            storedEnergy = 0;
            return remainer;
        }
        storedEnergy -= amount;
        return amount;
    }

    @Override
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }
}
