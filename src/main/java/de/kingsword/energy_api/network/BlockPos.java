package de.kingsword.energy_api.network;

public record BlockPos(int x, int y, int z) {
    public int manhattanDistance(BlockPos other) {
        return Math.abs(x - other.x) + Math.abs(y - other.y) + Math.abs(z - other.z);
    }
}
