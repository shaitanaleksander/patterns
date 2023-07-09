package bridge;

public class Main {

    public static void main(String[] args) {

        TV tv = new SamsungTV();
        TV sony = new SonyTV();

        RemountControl basicRemote = new AdvancedRemote(tv);

        RemountControl sonyRemote = new BasicRemote(sony);

        basicRemote.turnOn();
        sonyRemote.turnOff();


    }
}
