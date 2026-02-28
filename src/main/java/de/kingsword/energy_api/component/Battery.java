package de.kingsword.energy_api.component;

import de.kingsword.energy_api.capability.EnergyStorage;

public class Battery implements EnergyStorage {
    private long storedEnergy = 0;
    private long capacity = 10000;

    @Override
    public long getStoredEnergy() {
        return storedEnergy;
    }

    @Override
    public long storeEnergy(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (storedEnergy + amount >= capacity) {
            storedEnergy = capacity;
            return amount;
        }
        storedEnergy += amount;
        return amount;
    }

    @Override
    public long retrieveEnergy(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
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
    public long getCapacity() {
        return capacity;
    }
}
