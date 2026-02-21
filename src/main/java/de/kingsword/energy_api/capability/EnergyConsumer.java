package de.kingsword.energy_api.capability;

public interface EnergyConsumer extends EnergyCapability {
    int consumeEnergy(int amount);
}
