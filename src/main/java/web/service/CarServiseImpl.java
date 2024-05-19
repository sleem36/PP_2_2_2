package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiseImpl implements CarService {

    private static int CAR_ID;
    private List<Car> listCars;

    {
        listCars = new ArrayList<>();
        listCars.add(new Car(++CAR_ID, "Volvo", 555));
        listCars.add(new Car(++CAR_ID, "Renault", 111));
        listCars.add(new Car(++CAR_ID, "Газель", 222));
        listCars.add(new Car(++CAR_ID, "Mersedes", 444));
        listCars.add(new Car(++CAR_ID, "Лада", 333));
    }
    public List<Car> index() {
        return listCars;
    }
}
