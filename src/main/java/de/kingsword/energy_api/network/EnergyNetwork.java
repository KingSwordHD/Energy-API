package de.kingsword.energy_api.network;

import de.kingsword.energy_api.capability.EnergyCapability;
import de.kingsword.energy_api.capability.EnergyStorage;
import de.kingsword.energy_api.network.enums.CalculationType;

import java.util.*;
import java.util.function.Function;

/**
 * EnergyNetwork represents a collection of EnergyCapability objects. In general,
 * EnergyNetwork ticks all the components and moves the Energy from one part to another.
 *
 * TODO:
 * - Pathfinding through pipes from one part to another.
 * - fill Machines first, then Battery and then Generator.
 * - Drain Battery first, then Generator
 */

public class EnergyNetwork {
    private List<EnergyCapability> components;
    private CalculationType calculationType;

    private Map<EnergyCapability, Set<EnergyCapability>> connections = new HashMap<>();

    public EnergyNetwork(List<EnergyCapability> components, CalculationType calculationType) {
        this.components = components;
        this.calculationType = calculationType;
    }

    public boolean tick () {
        return false;
    }

    public long totalNetworkEnergy() {
        long total = 0;

        for (EnergyCapability component : components) {
            if (component instanceof EnergyStorage storage) {
                total += storage.getStoredEnergy();
            }
        }

        return total;
    }

    public void addComponent(EnergyCapability component) {
        components.add(component);
    }

    public void removeComponent(EnergyCapability component) {
        components.remove(component);
    }

    public void setCalculationType(CalculationType calculationType) {
        this.calculationType = calculationType;
    }

    public CalculationType getCalculationType() {
        return calculationType;
    }

    public List<EnergyCapability> pathfindAStar(
            EnergyCapability start,
            EnergyCapability end,
            Function<EnergyCapability, BlockPos> positonOf
    ) {
        PriorityQueue<OpenEntry> open = new PriorityQueue<>(Comparator.comparingLong(OpenEntry::fScore));
        Set<EnergyCapability> visited = new HashSet<>();
        Map<EnergyCapability, EnergyCapability> cameFrom = new HashMap<>();
        Map<EnergyCapability, Long> gScore = new HashMap<>();

        BlockPos nodePos = positonOf.apply(start);
        BlockPos endPos = positonOf.apply(end);
        int h = nodePos.manhattanDistance(endPos);

        gScore.put(start, 0L);
        open.add(new OpenEntry(start, h));
        return null;
    }
}
