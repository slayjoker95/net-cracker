package com.nc.ncproject.Repository;

import com.nc.ncproject.model.Laptop;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LaptopsRepository extends CrudRepository<Laptop, Long> {
    List<Laptop> findById(Long id);
}
