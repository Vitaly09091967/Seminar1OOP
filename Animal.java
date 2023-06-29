/** Java. Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
Дз: добавить в класс Animal методы двигаться(toGo), летать(fly), 
плавать(swim). Создать по два класса наследника Animal, умеющих летать, 
плавать, бегать. При этом добиться того, чтобы не умеющие летать или 
плавать, не могли этого сделать. САМОЕ ВАЖНОЕ! В файле readme.md в 
репозитории гитхаб описать какие проблемы в таком проектировании 
Вы увидели, а также там же написать возникшие при выполнении дз вопросы
(если они есть) */


// Основной класс Animal
public class Animal {
    public void toGo() {
        System.out.println("Этот вид может двигаться");
    }
}

// Класс, наследующийся от Animal и умеющий летать
public class FlyingAnimal extends Animal {
    public void fly() {
        System.out.println("Этот вид умеет летать");
    }
}

// Класс, наследующийся от Animal и умеющий плавать
public class SwimmingAnimal extends Animal {
    public void swim() {
        System.out.println("Этот вид умеет плавать");
    }
}

// Класс, наследующийся от Animal и умеющий бегать
public class RunningAnimal extends Animal {
    public void run() {
        System.out.println("Этот вид умеет бегать");
    }
}