package web.Dao;

import web.Model.Car;

import java.util.List;



public interface Dao {
public List<Car> getCarsByCount(int count);
}
