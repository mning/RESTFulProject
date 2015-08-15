package com.uptake.rest.controller;

/**
 * Created by mning on 8/12/2015.
 */
import com.uptake.rest.domain.Family;
import com.uptake.rest.domain.People;
import com.uptake.rest.repository.FamilyRepository;
import com.uptake.rest.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MVCController {
    @Autowired
    private FamilyRepository familyRepository;
    @Autowired
    private PeopleRepository peopleRepository;

    @RequestMapping("/")
    @Transactional(readOnly = true)
    public ModelAndView index() {
        List<People> peopleList = this.peopleRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("peopleList", peopleList);
        return modelAndView;
    }

    @RequestMapping("/create")
    @Transactional(readOnly = true)
    public ModelAndView create() {
        List<Family> families = this.familyRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("peopleCreation");
        modelAndView.addObject("families", families);
        return modelAndView;
    }

    @RequestMapping("/update")
    @Transactional(readOnly = true)
    public ModelAndView update(@RequestParam("id") long id) {
        People people = this.peopleRepository.findById(id);
        List<Family> families = this.familyRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("peopleUpdate");
        modelAndView.addObject("people", people);
        modelAndView.addObject("families", families);
        return modelAndView;
    }

    @RequestMapping("/familycreation")
    @Transactional(readOnly = true)
    public ModelAndView familyCreate() {
        ModelAndView modelAndView = new ModelAndView("familyCreation");
        return modelAndView;
    }
}
