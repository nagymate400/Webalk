package hu.me.iit.webalk.car.Car;

import hu.me.iit.webalk.car.Car.Impl.BelsoEgesuMotor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarApplication.class, args);
	}

	Motor motor16 = new BelsoEgesuMotor(180,1600);

	Auto opelAstra = new Auto(motor16, get4kerek(),"Opel Astra");

	System.out.println(opelAstra);

	Kerek[] get4kerek() {
		Kerek[] kerekek = new Kerek[4];

		for (int i = 0; i < 4; i++) {
			kerekek[i] = new hu.me.iit.webalk.car.Car.Impl.Kerek(205, 15, 65);
		}
		return kerekek;
	}

}
