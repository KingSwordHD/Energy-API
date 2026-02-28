package de.kingsword.energy_api.capability;

public interface EnergyStorage extends EnergyCapability {

    long getStoredEnergy();
    // add energy to storage
    long storeEnergy(int amount);
    // get energy from storage
    long retrieveEnergy(int amount);
    // get/set max energy capacity
    void setCapacity(int capacity);
    long getCapacity();
}
