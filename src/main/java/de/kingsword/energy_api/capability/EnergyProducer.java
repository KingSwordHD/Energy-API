package de.kingsword.energy_api.capability;

public interface EnergyProducer extends EnergyCapability {
    int produceEnergy(int amount);
}
