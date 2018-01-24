public class Phone {
    private String type;
    private String os;
    private double screenSize;
    private String screenOled;
    private int memory;
    private String flash;
    private String camera;
    private String cameraDouble;
    private int battery;
    private String charging;

    public void print() {
        System.out.println();
        System.out.println();
        System.out.println("--------------------------------------");
        if (type != null) System.out.println("Тип телефона: " + type);
        if (os != null) System.out.println("Система: " + os);
        if (screenSize != 0) System.out.println("Разрешение экрана: " + screenSize);
        if (screenOled != null) System.out.println("Матрица: " + screenOled);
        if (memory != 0) System.out.println("Память: " + memory);
        if (flash != null) System.out.println("Флешка: " + flash);
        if (camera != null) System.out.println("Камера: " + camera);
        if (cameraDouble != null) System.out.println("Вторая камера: " + cameraDouble);
        if (battery != 0) System.out.println("Батарея: " + battery);
        if (charging != null) System.out.println("Зарядка: " + charging);
        System.out.println("--------------------------------------");
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void setScreenOled(String screenOled) {
        this.screenOled = screenOled;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setFlash(String flash) {
        this.flash = flash;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public void setCameraDouble(String cameraDouble) {
        this.cameraDouble = cameraDouble;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setCharging(String charging) {
        this.charging = charging;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "type='" + type + '\'' +
                ", os='" + os + '\'' +
                ", screenSize=" + screenSize +
                ", screenOled='" + screenOled + '\'' +
                ", memory=" + memory +
                ", flash='" + flash + '\'' +
                ", camera='" + camera + '\'' +
                ", cameraDouble='" + cameraDouble + '\'' +
                ", battery=" + battery +
                ", charging='" + charging + '\'' +
                '}';
    }
}
