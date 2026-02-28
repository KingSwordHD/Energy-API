package de.kingsword.energy_api.component;

import de.kingsword.energy_api.capability.EnergyConsumer;
import de.kingsword.energy_api.capability.EnergyStorage;

public class Machine implements EnergyConsumer, EnergyStorage {

    private int storedEnergy = 0;
    private int capacity = 10000;

    @Override
    public long getStoredEnergy() {
        return storedEnergy;
    }

    @Override
    public long storeEnergy(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (storedEnergy + amount <= capacity) {
            storedEnergy += amount;
            return amount;
        }
        storedEnergy = capacity;
        return amount;
    }

    @Override
    public long retrieveEnergy(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (storedEnergy - amount >= 0) {
            return amount;
        }
        return storedEnergy;
    }

    @Override
    public void setCapacity(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        this.capacity = capacity;
    }

    @Override
    public long getCapacity() {
        return capacity;
    }

    @Override
    public long consumeEnergy(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (storedEnergy - amount >= 0) {
            storedEnergy -= amount;
            return amount;
        }
        return 0;
    }
}
