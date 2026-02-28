package de.kingsword.energy_api.capability;

public interface EnergyProducer extends EnergyCapability {
    // add energy to network
    long produceEnergy(int amount);
}
