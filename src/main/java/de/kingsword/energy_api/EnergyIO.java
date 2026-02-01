package de.kingsword.energy_api;

public interface EnergyIO extends EnergyStorage {
    EnergyResult insert(long amount, EnergyUnit unit);

    EnergyResult extract(long amount, EnergyUnit unit);

    default boolean canInsert() {
        return true;
    }

    default boolean canExtract() {
        return true;
    }


}
