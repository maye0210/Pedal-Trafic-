package Reto3.Reto3.servicios;

import Reto3.Reto3.entidades.Bike;
import Reto3.Reto3.repositorios.RepositoryBike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceBike {
    @Autowired
    private RepositoryBike rb;

    @Autowired
    public List<Bike> getAll(){ return rb.getAll(); }
    public Bike getBike(Integer id){
        return  rb.getBike(id).get();
    }
    public Bike save(Bike bik){
        return rb.save(bik);
    }
    public Bike update(Bike bik){
        return  rb.save(bik);
    }
    public void delete(Integer doc){ rb.deleteBike(doc); }
}
