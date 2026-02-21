package de.kingsword.energy_api.capability;

public interface EnergyConductor extends EnergyCapability {
    int getTransferRate();
    void setTransferRate(int transferRate);
}
