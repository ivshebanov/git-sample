package ilya;

public class Radio implements ElectricityConsumer {
    @Override
    public void electricityOn(Object sender) {
        playMusic();
    }

    private void playMusic() {
        System.out.println("Радио заиграло");
    }
}
