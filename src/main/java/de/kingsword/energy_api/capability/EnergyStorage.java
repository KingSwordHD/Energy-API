package de.kingsword.energy_api.capability;

public interface EnergyStorage extends EnergyCapability {
    int getStoredEnergy();
    void storeEnergy(int amount);
    int retrieveEnergy(int amount);
    void setCapacity(int capacity);
    int getCapacity();
}
