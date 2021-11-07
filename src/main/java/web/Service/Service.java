package web.Service;

import web.Model.Car;

import java.util.List;

public interface Service {
    public List<Car> getCarsByCount(int count);
}
