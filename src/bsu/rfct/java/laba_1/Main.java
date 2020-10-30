package bsu.rfct.java.laba_1;

public class Main {

    public static void main(String[] args) {
        Food[] breakfast = new Food[20];
        int i = 0;
        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[i] = new Cheese();
            }
            if (parts[0].equals("Apple")) {
                breakfast[i] = new Apple(parts[1]);
            }
            if (parts[0].equals("Tea")) {
                breakfast[i] = new Tea(parts[1]);
            }
            i++;
        }
        for (Food food : breakfast) {
            if (food != null)
                food.consume();
            else
                break;
        }
        System.out.println("Всего хорошего!");
    }
}

