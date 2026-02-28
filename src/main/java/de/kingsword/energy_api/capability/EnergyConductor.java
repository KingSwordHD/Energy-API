package de.kingsword.energy_api.capability;

public interface EnergyConductor extends EnergyCapability {
    /*
     max transfer rate for this cable
     */
    long getTransferRate();
    void setTransferRate(int transferRate);
}
