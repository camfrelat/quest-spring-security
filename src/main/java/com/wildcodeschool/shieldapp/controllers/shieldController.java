package com.wildcodeschool.shieldapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class shieldController {
	
    @GetMapping("/")
    public String hello() {
        return "Welcome to the Shield !!!";
    }
    
    @GetMapping("/avengers/assemble")
    public String avengers() {
        return "Avengers... Assemble";
    }
    
    @GetMapping("/secret-bases")
    public String secretBases() {
        return "Amsterdam, Barcelone, Berlin, Biarritz, Bordeaux, Bruxelles, Bucarest, La Loupe, Lille, Lisbonne, Londes, Lyon, Madrid, Marseille, Nantes, Orléans, Paris, Reims, Strasbourg, Toulouse, Tours ";
    }

}
