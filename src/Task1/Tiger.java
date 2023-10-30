package Task1;

public class Tiger extends Animal {
    public void eat(String food) {
        if (food == "Meat") {
            System.out.println("Тигр ест мясо");
        } else if (food == "Water") {
            System.out.println("Тигр пьет воду");
        } else {
            System.out.println("Тигр недоволен!");
        }
    }
    public void voice() {
        System.out.println("Тигр рычит!");
    }
}
