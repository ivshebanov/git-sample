import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.ArrayList;

public class Main {
    private static DAO dao;
    private static Phone phone;
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
//        theWholeBase();
        start();
    }

    private static void start() {
        phone = new Phone();
        dao = new DAO();
        logics();
    }

    private static void logics() {
        try {
            System.out.println("Доброго времени суток, давайте выберем Вам телефон.");
            System.out.println(dao.question1level());
            System.out.println("Сенторный(1) или Кнопочный(2)");
            int numQues1 = Integer.parseInt(bufferedReader.readLine());
            if (numQues1 == 1) {
                phone.setType("Сенсорный");
                sensory();
            } else {
                phone.setType("Кнопочный");
                button();
            }
            phone.print();
        } catch (IOException e) {
            System.out.println("Вы ввели некорректные данные, попробуйте заново");
            logics();
        }
    }

    private static void sensory() throws IOException {
        System.out.println(dao.question1level4());
        System.out.println("ANDROID(1) или IOS(2)");
        int num = Integer.parseInt(bufferedReader.readLine());
        if (num == 1) {
            phone.setOs("ANDROID");
            android();
        } else {
            phone.setOs("IOS");
            ios();
        }
    }

    private static void ios() throws IOException {
        displaySizeSensory();
        memory();
        cameraDouble();
    }

    private static void android() throws IOException {
        displaySizeSensory();
        displayOledSensory();
        memory();
        flash();
        batterySensoryAndButton();
        UsbSensory();
        camera();
        cameraDouble();
    }

    private static void button() throws IOException {
        operatingSystemBatton();
        displaySizeButton();
        displayOledButton();
        memory();
        flash();
        batterySensoryAndButton();
        UsbButton();
        camera();
    }

    private static void displaySizeSensory() throws IOException {
        System.out.println(dao.question1level2());
        ArrayList<Double> displaySizeList = new ArrayList<>();
        displaySizeList.add(3.5);
        displaySizeList.add(4.);
        displaySizeList.add(4.7);
        displaySizeList.add(5.1);
        displaySizeList.add(5.5);
        displaySizeList.add(5.7);
        System.out.println("3.5d(0), 4d(1), 4.7d(2), 5.1d(3), 5.5d(4), 5.7d(5)");
        int displaySize = Integer.parseInt(bufferedReader.readLine());
        phone.setScreenSize(displaySizeList.get(displaySize));
    }

    private static void displayOledSensory() throws IOException {
        System.out.println(dao.question2level2());
        ArrayList<String> arrayListOled = new ArrayList<>();
        arrayListOled.add("LCD");
        arrayListOled.add("OLED");
        arrayListOled.add("AMOLED");
        arrayListOled.add("Предпочтительно AMOLED");
        System.out.println("LCD(0), OLED(1), AMOLED(2), не знаю(3)");
        int displayOled = Integer.parseInt(bufferedReader.readLine());
        if (displayOled == 3) {
            System.out.println("Предложу вам AMOLED");
        }
        phone.setScreenOled(arrayListOled.get(displayOled));
    }

    private static void batterySensoryAndButton() throws IOException {
        System.out.println(dao.question1level3());
        ArrayList<Integer> battaryList = new ArrayList<>();
        battaryList.add(1000);
        battaryList.add(1500);
        battaryList.add(2000);
        battaryList.add(2300);
        battaryList.add(2500);
        battaryList.add(2700);
        battaryList.add(2900);
        battaryList.add(3000);
        battaryList.add(3500);
        battaryList.add(4100);
        System.out.println("Ведите номер числа по порядку");
        for (Integer el : battaryList) {
            System.out.print(el + " ");
        }
        int batteryNum = Integer.parseInt(bufferedReader.readLine());
        phone.setBattery(battaryList.get(batteryNum - 1));
    }

    private static void memory() throws IOException {
        System.out.println(dao.question1level6());
        ArrayList<Integer> memorList = new ArrayList<>();
        memorList.add(8);
        memorList.add(16);
        memorList.add(32);
        memorList.add(64);
        memorList.add(128);
        memorList.add(256);
        System.out.println("Введите номер числа попорядку");
        for (Integer el : memorList) {
            System.out.print(el + " ");
        }
        int displayOled = Integer.parseInt(bufferedReader.readLine());
        phone.setMemory(memorList.get(displayOled - 1));
    }

    private static void flash() throws IOException {
        System.out.println(dao.question2level6());
        System.out.println("ДА, понадобится(1) или НЕТ, не понадобится(2)");
        int num = Integer.parseInt(bufferedReader.readLine());
        if (num == 1) {
            phone.setFlash("ДА");
        } else {
            phone.setFlash("НЕТ");
        }
    }

    private static void UsbSensory() throws IOException {
        System.out.println(dao.question2level3());
        System.out.println("Mini USB(1) или USB TYPE-C(2)");
        int num = Integer.parseInt(bufferedReader.readLine());
        if (num == 1) {
            phone.setCharging("Mini USB");
        } else {
            phone.setCharging("USB TYPE-C");
        }
    }

    private static void camera() throws IOException {
        System.out.println(dao.question1level5());
        System.out.println("Хорошую(1) или Безразницы(2)");
        int num = Integer.parseInt(bufferedReader.readLine());
        if (num == 1) {
            phone.setCamera("От 10м.п.");
        } else {
            phone.setCamera("Не имеет значения");
        }
    }

    private static void cameraDouble() throws IOException {
        System.out.println(dao.question2level5());
        System.out.println("Да, хочу(1) или Нет, не хочу(2)");
        int num = Integer.parseInt(bufferedReader.readLine());
        if (num == 1) {
            phone.setCameraDouble("С двойной камерой");
        } else {
            phone.setCameraDouble("Двойная камера не нужна");
        }
    }

    private static void operatingSystemBatton() throws IOException {
        phone.setOs("ANDROID");
    }

    private static void displaySizeButton() throws IOException {
        System.out.println(dao.question1level2());
        ArrayList<Double> displaySizeList = new ArrayList<>();
        displaySizeList.add(3.5);
        displaySizeList.add(3.);
        displaySizeList.add(2.5);
        displaySizeList.add(2.);
        System.out.println("3.5d(0), 3d(1), 2.5d(2), 2d(3)");
        int displaySize = Integer.parseInt(bufferedReader.readLine());
        phone.setScreenSize(displaySizeList.get(displaySize));
    }

    private static void displayOledButton() {
        phone.setScreenOled("LCD");
    }

    private static void UsbButton() {
        phone.setCharging("Mini USB");
    }

    private static void theWholeBase() {
        System.out.println("Hello World!");
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1/expertsystem", "postgres", "12345");
            if (con != null) {
                System.out.println("Подключились!");
            }
            assert con != null;
            Statement st = con.createStatement();
            String sql = "Select * From qusetion";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("id_qusetion") + " " +
                        rs.getString("level") + " " +
                        rs.getString("num_qusetion") + " " +
                        rs.getString("qusetion"));
            }
            rs.close();
            st.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
