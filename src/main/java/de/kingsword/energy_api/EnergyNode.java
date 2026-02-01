package de.kingsword.energy_api;

public interface EnergyNode {
    EnergyIO getEnergyIO();

    /**
     * Single-Thread Tick.
     */
    void tick(EnergyNetwork network);
}
