package com.nc.ncproject.service;

import com.nc.ncproject.model.Laptop;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class LaptopService {
    private List<Laptop> laptops;

    @PostConstruct
    public void init(){
        laptops = new ArrayList<Laptop>();
        laptops.add(new Laptop(Long.valueOf(1L), "ASUS", Long.valueOf(18000L), "Black"));
        laptops.add(new Laptop(Long.valueOf(2L), "Acer", Long.valueOf(19000L), "White"));
        laptops.add(new Laptop(Long.valueOf(3L), "Lenovo", Long.valueOf(17000L), "Black"));
        laptops.add(new Laptop(Long.valueOf(4L), "HP", Long.valueOf(15000L), "Red"));
        laptops.add(new Laptop(Long.valueOf(5L), "DELL", Long.valueOf(16000L), "Black"));
    }

    public List<Laptop> findAll() {
        return laptops;
    }

    public Laptop getByID(String id){
        for (Laptop l:laptops) {
            if(Long.parseLong(id)== l.getId()) return l;
        }
        return null;
    }

    public void delete (String id){
        for (Laptop l:laptops){
            if (Long.parseLong(id)==l.getId())
                laptops.remove(l);
        }
    }

    public void update (Laptop laptop){
        for (Laptop l:laptops) {
            if (laptop.getId() == l.getId()) {
                l.setColor(laptop.getColor());
                l.setId(laptop.getId());
                l.setModel(laptop.getModel());
                l.setPrice(laptop.getPrice());
            }
        }
    }
}
