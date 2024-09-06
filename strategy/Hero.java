package strategy;

import java.util.Objects;

public final class Hero {

    private MovementStrategy movementStrategy;

    public Hero(MovementStrategy movementStrategy) {
        setMovementStrategy(movementStrategy);
    }

    public void setMovementStrategy(MovementStrategy movementStrategy) {
        this.movementStrategy = Objects.requireNonNull(movementStrategy, "Movement strategy cannot be null");
    }

    public void move() {
        movementStrategy.move();
    }

}
