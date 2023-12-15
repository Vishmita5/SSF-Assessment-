package vttp.ssf.assessment.eventmanagement.controllers;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import vttp.ssf.assessment.eventmanagement.models.Event;
import vttp.ssf.assessment.eventmanagement.models.Participant;

@Controller
@RequestMapping (path="/")
public class RegistrationController {
    

    // TODO: Task 6

     @GetMapping("/list")
    public String eventList(Model model) {
        List<Event> events = (events).findAll();

        model.addAttribute("events", events);

        return "view0";

    }

    @GetMapping("/register")
    public String registerEvent(Model model) {
          User p = new user();
        model.addAttribute("name", user);
        model.addAttribute("email", user);


        return "view1";
    }


    // TODO: Task 7


    @PostMapping("/processRegistration")
    public String processRegsitration(@Valid @ModelAttribute("participant") Participant participant, BindingResult result,
            Model model) throws FileNotFoundException {

        if (result.hasErrors()) {
            return "view3";
        }
        model.addAttribute("participant", participant);
        return "view2";
    }



}
