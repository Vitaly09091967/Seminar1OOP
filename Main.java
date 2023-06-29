public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.toGo(); // Этот вид может двигаться
        animal.fly(); // Этот вид не умеет летать
        animal.swim(); // Этот вид не умеет плавать
        animal.run(); // Этот вид не умеет бегать

        Animal flyingAnimal = new FlyingAnimal();
        flyingAnimal.toGo(); // Этот вид может двигаться
        flyingAnimal.fly(); // Этот вид умеет летать
        flyingAnimal.swim(); // Этот вид не умеет плавать
        flyingAnimal.run(); // Этот вид не умеет бегать

        Animal swimmingAnimal = new SwimmingAnimal();
        swimmingAnimal.toGo(); // Этот вид может двигаться
        swimmingAnimal.fly(); // Этот вид не умеет летать
        swimmingAnimal.swim(); // Этот вид умеет плавать
        swimmingAnimal.run(); // Этот вид не умеет бегать

        Animal runningAnimal = new RunningAnimal();
        runningAnimal.toGo(); // Этот вид может двигаться
        runningAnimal.fly(); // Этот вид не умеет летать
        runningAnimal.swim(); // Этот вид не умеет плавать
        runningAnimal.run(); // Этот вид умеет бегать
    }
}
