package facade;

public class Computer { // facade

    private final CPU cpu;
    private final Memory memory;
    private final HardDrive hardDrive;

    public Computer(CPU cpu, Memory memory, HardDrive hardDrive) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public void start() {
        this.cpu.start();
        this.memory.start();
        this.hardDrive.start();
    }
}
