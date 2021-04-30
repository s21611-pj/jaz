package pl.pjatk.wojture;
//praca domowa
public class MyHomeworkClass {
    private String customString;

    public MyHomeworkClass(String customString) {
        this.customString = customString;
    }

    public String getCustomString() {
        return customString;
    }

    public void setCustomString(String customString) {
        this.customString = customString;
    }

    public void printCustomString() {
        System.out.println("------------------\nValue from MyHomeworkClass is: " + customString  + "\n------------------");
    }
}
