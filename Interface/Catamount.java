package Interface;

abstract public class Catamount implements Animal {
    public void Eat() {
        System.out.println("This animal is eating");
    }

    abstract public void Move();
    abstract public void Shout();
}
