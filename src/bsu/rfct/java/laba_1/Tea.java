package bsu.rfct.java.laba_1;

public class Tea extends Food {
   private String color = null;

    public Tea(String color) {
        super("Tea");
        this.color=color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color=color;
    }

    public String toString() {
        return super.toString() + " with '" + this.color.toUpperCase() + "' color";
    }

    public void consume() {
        System.out.println(this + " is drunk");
    }
}


