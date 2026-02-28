package de.kingsword.energy_api.network;

import de.kingsword.energy_api.capability.EnergyCapability;

public record OpenEntry(EnergyCapability node, long fScore) {
}
