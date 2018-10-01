package cn.legeyung.study08;

/**
 * @author TuringEmmy
 *
 */
public class Noodles extends Food {
    public void taste() {
        System.out.println("It's delicious.");
    }

    public void smell() {
        System.out.println("Smell sweet");
    }

    public void feed() {
        System.out.println("It's nutritious.");
    }

    public static void main(String[] args) {
        Food food = new Noodles();
        food.taste();
        food.smell();
        food.feed();
    }
}
