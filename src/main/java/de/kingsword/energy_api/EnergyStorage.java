package de.kingsword.energy_api;

public interface EnergyStorage {
    long getStoredHE();
    long getCapacityHE();

    default long getFreeSpaceHE() {
        return Math.max(0, getCapacityHE() - getStoredHE());
    }
}
