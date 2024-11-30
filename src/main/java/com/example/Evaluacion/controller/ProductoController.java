/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Evaluacion.controller;



import com.example.Evaluacion.model.Producto;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author LAB_P03
 */
@Controller
public class ProductoController {
    
    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("producto", new Producto());
        return "formulario_producto";
    }

    @PostMapping("/resultado")
    public String procesarFormulario(Producto producto, Model model) {
        model.addAttribute("producto", producto);
        return "resultado_producto";
    }
}
