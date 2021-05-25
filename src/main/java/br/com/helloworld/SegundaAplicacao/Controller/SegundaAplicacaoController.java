package br.com.helloworld.SegundaAplicacao.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/segundaaplicação")
public class SegundaAplicacaoController {

	@GetMapping
	public String segundaAplicaçao() {
		 return "Meus objetivos de aprendizagem para esta semana é aprender a manipular spirng boot, e uma grande maioria de suas aplicaçoes "
		 		+ "com muita persistencia, pois dificuldades aparecerão. ";
	}
	
}
