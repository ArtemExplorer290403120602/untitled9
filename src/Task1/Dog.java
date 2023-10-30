package Task1;

public class Dog extends Animal {
    public void eat(String food) {
        if (food == "Meat") {
            System.out.println("Собака ест мясо");
        } else if (food == "Juice") {
            System.out.println("Собака пьет сок");
        } else {
            System.out.println("Собака недовольна!");
        }
    }

    public void voice() {
        System.out.println("Собачка Гаф-Гаф");
    }
}
