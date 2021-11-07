package web.Service;

import web.Dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import web.Model.Car;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    @Autowired
    private Dao dao;

    @Override
    public List<Car> getCarsByCount(int count) {
        return dao.getCarsByCount(count);
    }
}
