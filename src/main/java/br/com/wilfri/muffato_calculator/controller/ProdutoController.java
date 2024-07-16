package br.com.wilfri.muffato_calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

	@GetMapping("produtos")
	public String lista() {
		return "é para enviar a lista dos produtos...exemplo { batafrita ...coca cola e picanha}";
	}

}
