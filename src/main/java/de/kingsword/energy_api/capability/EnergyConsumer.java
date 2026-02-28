package de.kingsword.energy_api.capability;

public interface EnergyConsumer extends EnergyCapability {
    // delete energy from network
    long consumeEnergy(int amount);
}
