import strategy.*;

public final class StrategyPatternDemo {

    public static void main(String[] args) {
        try {
            new Hero(null);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        final var hero = new Hero(new WalkingStrategy());
        hero.move();

        hero.setMovementStrategy(new HorseRidingStrategy());
        hero.move();

        hero.setMovementStrategy(new FlyingStrategy());
        hero.move();
    }

}
