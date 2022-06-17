package helpers;

public class ComboBoxItem {
    private final int value;
    private final String text;

    public ComboBoxItem(int value, String text){
        this.value = value;
        this.text = text;
    }

    public int getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return text;
    }
}
