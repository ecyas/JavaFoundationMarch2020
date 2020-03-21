package core;

public class WorkWithStatic {
    public static void main(String[] args) {
        Car lamborghini = new Car("Lamborghini", "Yellow");
        System.out.println(lamborghini.getColor() + " " + lamborghini.getName());

        Car ferrari = new Car("Ferrari", "Red");
        System.out.println(ferrari.getColor() + " " + ferrari.getName());

        lamborghini.setColor("Black");

        System.out.println(lamborghini.getColor() + " " + lamborghini.getName());
        System.out.println(ferrari.getColor() + " " + ferrari.getName());


    }
}
