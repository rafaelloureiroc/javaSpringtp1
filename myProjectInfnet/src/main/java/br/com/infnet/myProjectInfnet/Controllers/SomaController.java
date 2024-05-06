package br.com.infnet.myProjectInfnet.Controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomaController {
    public String soma(@PathVariable int num1, @PathVariable int num2) {
        return "A soma é: " + (num1 + num2);
    }
}