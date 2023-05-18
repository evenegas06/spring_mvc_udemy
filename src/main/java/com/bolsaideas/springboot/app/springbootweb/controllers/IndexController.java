package com.bolsaideas.springboot.app.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    /*
     * Es necesario vincular los métodos de la clase controller a alguna ruta web.
     * Esto puede hacerse de diferentes maneras:
     * - Con la anotación @RequestMapping(ruta, método HTTP), por defecto si se
     * omite
     * el método este sera de tipo GET
     * - Con la anotación @GetMapping(ruta o arreglo de rutas); @PostMapping(), etc.
     */

    // @RequestMapping(value = "/index", method = RequestMethod.GET)
    @GetMapping({"/", "/index", "/home", "/alv"}) // -> ruta
    public String index(Model model) {
        model.addAttribute("titulo", "hola!!!!!!!!!!!!!");
        
        return "index"; // -> vista html
    }
}