package com.nc.ncproject.service;

import com.nc.ncproject.model.Laptop;
import com.nc.ncproject.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository laptopRepository;

    @PostConstruct
    public void init(){
    laptopRepository.save(new Laptop("ASUS", Long.valueOf(18000L), "Black"));
    laptopRepository.save(new Laptop( "Acer", Long.valueOf(19000L), "White"));
    laptopRepository.save(new Laptop("Lenovo", Long.valueOf(17000L), "Black"));
    laptopRepository.save(new Laptop("HP", Long.valueOf(15000L), "Red"));

    }

    public List<Laptop> findAll() {
        return laptopRepository.findAll();
    }

    public Laptop getByID(String id)
    {
        return laptopRepository.findOne(Long.valueOf(id));
    }

    public void add(Laptop laptop){
        laptopRepository.save(laptop);
    }
    public void delete(String id){
        laptopRepository.delete(Long.valueOf(id));
    }

    public void update(Laptop newLaptop)
    {
        Laptop laptop = laptopRepository.findOne(newLaptop.getId());
        laptop.setColor(newLaptop.getColor());
        laptop.setModel(newLaptop.getModel());
        laptop.setPrice(newLaptop.getPrice());
        laptopRepository.flush();
    }
    /*

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
    }*/
}
