package Task2;

public class Dog {

    private Dog() {

    }

    public void voice() {
        System.out.println("Собака лает");
    }

    public void eat(String food) {
        if (food == "Meat") {
            System.out.println("Собака ест мясо!");
        } else {
            System.out.println("Собака недовольна!");
        }
    }

    public static Dog createDog() {
        // Статический метод для создания экземпляра класса Dog.
        return new Dog();
    }
}
