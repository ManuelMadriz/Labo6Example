public class ConcreteComputerBuilder implements ComputerBuilder{

    private String cpu;
    private String gpu;
    private int ramSize;
    private int storageSize;
    private boolean hasWifi;
    private boolean hasBluetooth;

    public ConcreteComputerBuilder(){
        this.reset();
    }

    @Override
    public ComputerBuilder setCpu(String cpu) {
        return this;
    }

    @Override
    public ComputerBuilder setGpu(String gpu) {
        return this;
    }

    @Override
    public ComputerBuilder setRamSize(int ram) {
        return this;
    }

    @Override
    public ComputerBuilder setStorageSize(int storageSize) {
        this.
        return this;
    }

    @Override
    public ComputerBuilder setsWifi(boolean wifi) {
        this.hasWifi=wifi;
        return this;
    }

    @Override
    public ComputerBuilder usesBluetooth() {
        this.hasBluetooth=true;
        return this;
    }

    public void reset() {
        this.cpu="";
        this.gpu="";
        this.ramSize=0;
        this.storageSize=0;
        this.hasWifi=false;
        this.hasBluetooth=false;
    }

    @Override
    public Computer build() {
        Computer computer = new Computer(cpu, gpu, ramSize, storageSize, hasWifi,hasBluetooth);
        this.reset();
        return computer;
    }
}
