public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ComputerBuilder builder = new ConcreteComputerBuilder();

        Computer c1 = builder.setCpu("Intel 7600 I").setRamSize(8).usesBluetooth().build();

        Computer c2 = builder.setCpu("Intel Pentium").setRamSize(4).setsWifi(true).build();
    }
}