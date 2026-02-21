package de.kingsword.energy_api.component;

import de.kingsword.energy_api.capability.EnergyConductor;

public class Cable implements EnergyConductor {
    private int transferRate = 0;
    @Override
    public int getTransferRate() {
        return transferRate;
    }
    @Override
    public void setTransferRate(int transferRate) {
        this.transferRate = transferRate;
    }
}
