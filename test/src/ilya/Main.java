package ilya;

//шаблон слушатель

public class Main {

    public static void fire(Object center) {
        System.out.println("fire");
    }

    public static void main(String[] args) {
//        final String message = "ГОр";
        String message = "ГОр";

        Switcher sw = new Switcher();

        //подписка на событие
        sw.addElectricityListener(new Lamp());
        sw.addElectricityListener(new Radio());
        sw.addElectricityListener(new ElectricityConsumer() {
            @Override
            public void electricityOn(Object sender) {
                System.out.println("Горим");
                System.out.println(message);
            }
        });

        sw.addElectricityListener(sender -> System.out.println("Пожар " + message));
        sw.addElectricityListener(s -> Main.fire(s));
        sw.addElectricityListener(Main::fire);

        sw.switchOf();
    }
}