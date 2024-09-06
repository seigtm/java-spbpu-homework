package strategy;

public sealed interface MovementStrategy
        permits WalkingStrategy, HorseRidingStrategy, FlyingStrategy {

    void move();

}
