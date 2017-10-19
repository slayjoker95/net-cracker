package com.nc.ncproject.controller;

import com.nc.ncproject.model.Laptop;
import com.nc.ncproject.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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

        Laptop laptopForSearch = new Laptop();
        modelAndView.addObject("laptopForSearch", laptopForSearch);
        return modelAndView;
    }

    private ModelAndView createMV(Laptop laptop){
        ModelAndView modelAndView;
        if (laptop == null)
        {
            modelAndView = new ModelAndView("unsuccessfulSearch");
        }
        else modelAndView = new ModelAndView("search");
        modelAndView.addObject("lll", laptop);
        return modelAndView;
    }
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public ModelAndView searchByObject(@ModelAttribute Laptop laptopForSearch, Model model) {
        return createMV(laptopService.getByID(laptopForSearch.getId().toString()));
    }    
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ModelAndView searchById(@PathVariable String id) {
        return createMV(laptopService.getByID(id));
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public ModelAndView createNew() {
        ModelAndView modelAndView = new ModelAndView("new");
        modelAndView.addObject("laptop", new Laptop());
        return modelAndView;
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String createNew(Laptop newLaptop) {
        laptopService.findAll().add(newLaptop);
        return "redirect:/laptops/";
    }

}
