package hu.me.iit.webalk.car.Car.Impl;

public class BelsoEgesuMotor implements hu.me.iit.webalk.car.Car.Motor{

    private final int loero;
    private final int ccm;

    public BelsoEgesuMotor(int loero, int ccm) {
        this.loero = loero;
        this.ccm = ccm;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "loero=" + loero +
                ", ccm=" + ccm +
                '}';
    }
}
