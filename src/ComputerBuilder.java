public interface ComputerBuilder {
    public ComputerBuilder setCpu(String cpu);
    public ComputerBuilder setGpu(String gpu);
    public ComputerBuilder setRamSize(int ram);
    public ComputerBuilder setStorageSize(int storageSize);
    public ComputerBuilder setsWifi(boolean wifi);
    public ComputerBuilder usesBluetooth();

    public Computer build();
}
