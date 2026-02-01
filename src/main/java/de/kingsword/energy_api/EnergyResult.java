package de.kingsword.energy_api;

public record EnergyResult(long amountHE) {
    public static EnergyResult none() {
        return new EnergyResult(0L);
    }
}
