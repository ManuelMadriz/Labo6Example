public class Computer {
    private String cpu;
    private String gpu;
    private int ramSize;
    private int storageSize;
    private boolean hasWifi;
    private boolean hasBluetooth;

    public Computer() {
    }

    public Computer(String cpu, String gpu, int ramSize, int storageSize, boolean hasWifi, boolean hasBluetooth) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.hasWifi = hasWifi;
        this.hasBluetooth = hasBluetooth;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }
}
