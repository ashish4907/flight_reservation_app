package com.home.flight_reservation_app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class UserController {

    @RequestMapping("/Registration  ")
    public String Reg() {


        return "Reg";
    }

}
