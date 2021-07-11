public class PhoneMaker {
    public static void main(String[] args) {
        // 创建一个 phone 实例
        Phone phone = new Phone();

        phone.hasFingerPrintUnlocker = true;
        phone.price = 1999;

        phone.screen = new Screen();
        phone.screen.producer = "京东方";
        phone.screen.size = 8.8;

        CPU cpu = new CPU();
        cpu.producer = "samsung";
        cpu.speed = 3.5;

        Memory memory = new Memory();
        memory.producer = "samsung";
        memory.capacity = 4;

        Storage storage = new Storage();
        storage.producer = "Intel";
        storage.capacity = 128;

        phone.mainboard = new Mainboard();
        phone.mainboard.cpu = cpu;
        phone.mainboard.storage = storage;
        phone.mainboard.memory = memory;
        phone.mainboard.model = "e3433";
        phone.mainboard.year = 2021;

        phone.prePhone = new Phone();

    }
}
