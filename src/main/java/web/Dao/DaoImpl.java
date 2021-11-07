package web.Dao;

import org.springframework.stereotype.Repository;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class DaoImpl implements Dao {

    private List<Car> list;
    {
        list = new ArrayList<>();
    Car mersedes = new Car(1L,"Mersedes", 212, "Black");
    Car mazda = new Car(2L,"Mazda", 626, "Red");
    Car golf = new Car(3L,"Golf", 4, "Blue");
    Car camry = new Car(4L,"Camry", 5, "Grey");
    Car audi = new Car(5L,"audi", 100, "Green");
        list.add(mersedes);
        list.add(mazda);
        list.add(golf);
        list.add(camry);
        list.add(audi);
    }



    @Override
    public List<Car> getCarsByCount(int count) {
        if(count < 1 || count>=5){
            return list;
        }else{
            return list.stream().limit(count).collect(Collectors.toList());
        }
    }
}
