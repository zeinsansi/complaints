package com.homelancer.complaints.controller;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("complaints/")
public class ComplaintsController {

    @GetMapping("hallo")
    public String getHallo(){
        System.out.println("one use");
        return "Hallo, this is the complaints server";
    }

    @PostMapping("post")
    public void postHallo(String woord){
        System.out.println(woord);
    }
}
