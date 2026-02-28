package de.kingsword.energy_api.component;

import de.kingsword.energy_api.capability.EnergyConductor;

public class Cable implements EnergyConductor {
    private int transferRate = 0;
    @Override
    public long getTransferRate() {
        return transferRate;
    }
    @Override
    public void setTransferRate(int transferRate) {
        if (transferRate < 0) {
            throw new IllegalArgumentException("Transfer rate must be positive");
        }
        this.transferRate = transferRate;
    }
}
