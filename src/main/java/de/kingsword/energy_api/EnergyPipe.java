package de.kingsword.energy_api;

public class EnergyPipe implements EnergyNode {

    private final PipeType type;
    private final EnergyIO io;

    public EnergyPipe(PipeType type, EnergyIO io) {
        this.type = type;
        this.io = io;
    }

    public PipeType getType() {
        return type;
    }

    @Override
    public EnergyIO getEnergyIO() {
        return null;
    }

    @Override
    public void tick(EnergyNetwork network) {
        //Pipe ist passiv - Netzwerk steuert den Transfer
    }
}
