package de.kingsword.energy_api;

import java.util.Collection;

public interface EnergyNetwork {
    Collection<EnergyNode> getNodes();

    void addNode(EnergyNode node);

    void removeNode(EnergyNode node);

    void tick();
}
