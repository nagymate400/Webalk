package hu.me.iit.webalk.car.Car;

import java.util.Arrays;

public class Auto {
    private final Motor motor;
    private final Kerek[] kerekek;
    private final String tipus;

    public Auto(Motor motor, Kerek[] kerekek, String tipus) {
        this.motor = motor;
        this.kerekek = kerekek;
        this.tipus = tipus;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "motor=" + motor +
                ", kerekek=" + Arrays.toString(kerekek) +
                ", tipus='" + tipus + '\'' +
                '}';
    }
}
