package pl.pjatk.wojture;

public class MySimplePojo {
    private int id;
    private String name;

    public MySimplePojo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void printOutMe() {
        System.out.println("Value from MySimplePojo is: " + name);
    }

    @Override
    public String toString(){
        return "obj value >>> " + name;
    }
}
