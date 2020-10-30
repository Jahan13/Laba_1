package bsu.rfct.java.laba_1;

public abstract class Food implements Consumable {
    private String name = null;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean equals(Object obj) {
        if (obj instanceof Food) {
            return (this.name != null || ((Food) obj).name != null) && this.name.equals(((Food) obj).name);
        } else {
            return false;
        }
    }

    public String toString() {
        return this.name;
    }
}
