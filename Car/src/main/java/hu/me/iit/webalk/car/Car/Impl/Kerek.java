package hu.me.iit.webalk.car.Car.Impl;

public class Kerek implements hu.me.iit.webalk.car.Car.Kerek{
    private final int szelesseg;
    private final int atmero;
    private final int kopenyMagassag;

    public Kerek(int szelesseg, int atmero, int kopenyMagassag) {
        this.szelesseg = szelesseg;
        this.atmero = atmero;
        this.kopenyMagassag = kopenyMagassag;
    }

    @Override
    public String toString() {
        return "Kerek{" + szelesseg + "/" + kopenyMagassag +" R " + atmero + '}';
    }
}
