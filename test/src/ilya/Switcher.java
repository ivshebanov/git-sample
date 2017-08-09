package ilya;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
    private List<ElectricityConsumer> listeners = new ArrayList<ElectricityConsumer>();

    public void addElectricityListener(ElectricityConsumer listener) {
        this.listeners.add(listener);
    }

    public void removeElectricityListener(ElectricityConsumer listener) {
        this.listeners.remove(listener);
    }

    public void switchOf() {
        System.out.println("Выключатель включен");
        for (ElectricityConsumer c : listeners) {
            c.electricityOn(this);
        }
    }
}
