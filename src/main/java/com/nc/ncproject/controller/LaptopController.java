package com.nc.ncproject.controller;

import com.nc.ncproject.model.Laptop;
import com.nc.ncproject.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/laptops")
public class LaptopController {
    @Autowired
    private LaptopService laptopService;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getAllLaptops() {
        ModelAndView modelAndView = new ModelAndView("laptops");
        List<Laptop> laptops = laptopService.findAll();
        modelAndView.addObject("lll", laptops);
        return  modelAndView;
    }


}
