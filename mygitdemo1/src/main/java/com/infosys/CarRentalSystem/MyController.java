package com.infosys.CarRentalSystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MyController {
 @GetMapping("/index")
 public ModelAndView showIndexPage() {
	 return new ModelAndView("index");
 }
}