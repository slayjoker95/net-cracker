package com.nc.ncproject.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nc.ncproject.model.Laptop;
import com.nc.ncproject.service.LaptopService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api/laptops")
public class LaptopRestController {
    @Autowired
    private LaptopService laptopService;

    @ApiOperation(value = "Get all laptops", produces = APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = GET)
    public ResponseEntity<List<Laptop>> getAllLaptops() {
        List<Laptop> laptops = laptopService.findAll();
        return new ResponseEntity<List<Laptop>>(laptops, HttpStatus.OK);
    }

    @ApiOperation(value = "Get laptop by id", produces = APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Laptop> getLaptop(@ApiParam(value = "Laptop id", required = true) @PathVariable String id) {
    	Laptop laptop = laptopService.getByID(id);
    	return new ResponseEntity<Laptop>(laptop, HttpStatus.OK);
    }
}
