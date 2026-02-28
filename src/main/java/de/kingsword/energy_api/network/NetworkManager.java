package de.kingsword.energy_api.network;

import java.util.ArrayList;
import java.util.List;

public class NetworkManager {
    private static List<EnergyNetwork> networks = new ArrayList<>();

    public static void registerNetwork(EnergyNetwork network) {
        networks.add(network);
    }

    public static void unregisterNetwork(EnergyNetwork network) {
        networks.remove(network);
    }


}
