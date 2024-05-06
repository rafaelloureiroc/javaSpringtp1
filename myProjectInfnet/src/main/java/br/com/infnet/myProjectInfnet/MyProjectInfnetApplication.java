package br.com.infnet.myProjectInfnet;

import br.com.infnet.myProjectInfnet.Controllers.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@RestController
public class MyProjectInfnetApplication {

	private final SomaController somaController;
	private final SubtracaoController subtracaoController;
	private final DivisaoController divisaoController;
	private final MultiplicacaoController multiplicacaoController;
	private final ExponenciacaoController exponenciacaoController;

	@Autowired
	public MyProjectInfnetApplication(SomaController somaController,
									  SubtracaoController subtracaoController,
									  DivisaoController divisaoController,
									  MultiplicacaoController multiplicacaoController,
									  ExponenciacaoController exponenciacaoController) {

		this.somaController = somaController;
        this.subtracaoController = subtracaoController;
        this.divisaoController = divisaoController;
        this.multiplicacaoController = multiplicacaoController;
        this.exponenciacaoController = exponenciacaoController;
    }

	@RequestMapping(value = "/callSoma/{num1}/{num2}",
			method = { RequestMethod.GET, RequestMethod.POST } )
	String callSoma(@PathVariable int num1, @PathVariable int num2){
		return somaController.soma(num1, num2);
	}
	
	@RequestMapping(value = "/callSubtracao/{num1}/{num2}",
			method = { RequestMethod.GET, RequestMethod.POST } )
	String callSubtracao(@PathVariable int num1, @PathVariable int num2){
		return subtracaoController.subtracao(num1, num2);
	}

	@RequestMapping(value = "/callDivisao/{num1}/{num2}",
			method = { RequestMethod.GET, RequestMethod.POST } )
	String callDivisao(@PathVariable int num1, @PathVariable int num2){
		return divisaoController.divisao(num1, num2);
	}

	@RequestMapping(value = "/callMultiplicacao/{num1}/{num2}",
			method = { RequestMethod.GET, RequestMethod.POST } )
	String callMultiplicacao(@PathVariable int num1, @PathVariable int num2){
		return multiplicacaoController.multiplicacao(num1, num2);
	}

	@RequestMapping(value = "/callExponenciacao/{num1}/{num2}",
			method = { RequestMethod.GET, RequestMethod.POST } )
	String callExponenciacao(@PathVariable int num1, @PathVariable int num2){
		return exponenciacaoController.exponenciacao(num1, num2);
	}

	public static void main(String[] args) {
		SpringApplication.run(MyProjectInfnetApplication.class, args);
	}
}
