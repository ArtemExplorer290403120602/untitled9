package Task1;

public class Rabbit extends Animal {
    public void eat(String food) {
        if (food == "Grass") {
            System.out.println("Кроллик ест траву!");
        } else {
            System.out.println("Кроллик недоволен");
        }
    }
    public void voice() {
        System.out.println("Кроллик прыгает задними лапками");
    }
}
