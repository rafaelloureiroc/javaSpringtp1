package br.com.infnet.myProjectInfnet.Controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExponenciacaoController {
    public String exponenciacao(@PathVariable int base, @PathVariable int expoente) {
        return "A exponenciação é: " + Math.pow(base, expoente);
    }
}
