package ilya;

public class DoubleString implements Move {

    @Override
    public String doubleString(String string) {
        return string + " " + string;
    }
}
