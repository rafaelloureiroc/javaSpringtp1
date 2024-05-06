package br.com.infnet.myProjectInfnet.Controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DivisaoController {
    public String divisao(@PathVariable int num1, @PathVariable int num2) {
        if(num2 == 0) {
            return "Não é possível dividir por zero";
        }
        return "A divisão é: " + ((double) num1 / num2);
    }
}
