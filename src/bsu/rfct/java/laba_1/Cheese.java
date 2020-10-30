package bsu.rfct.java.laba_1;

public class Cheese extends Food {
    public Cheese() {
        super("Cheese");
    }

    public void consume() {
        System.out.println(this + " is eaten");
    }
}