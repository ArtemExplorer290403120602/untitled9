package Task1;

import java.util.Scanner;

//Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
//Переопределить методы voice(), eat(String food) чтобы они выводили верную
//информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
//Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
//туда “Grass” он должен написать в консоли что любит есть травку. Если передадим
//“Meat” или другую строку то он будет недоволен.
public class Main {
    public static void main(String[] args) {
        Animal animalOne = new Rabbit();
        Animal animalTwo = new Tiger();
        Animal animalThree = new Dog();
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------");
        animalOne.voice();
        animalOne.eat("Grass");
        animalOne.eat("Meat");
        animalOne.eat("Milk");
        System.out.println("------------------------------------");
        animalTwo.voice();
        animalTwo.eat("Meat");
        animalTwo.eat("Water");
        System.out.println("------------------------------------");
        animalThree.voice();
        animalThree.eat("Juice");
        animalThree.eat("Coffe");
        System.out.println("------------------------------------");
    }
}
