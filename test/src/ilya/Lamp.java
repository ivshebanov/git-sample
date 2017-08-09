package ilya;

public class Lamp implements ElectricityConsumer {

    @Override
    public void electricityOn(Object sender) {
        lightOn();
    }

    private void lightOn() {
        System.out.println("Лампа зажгласть");
    }
}
