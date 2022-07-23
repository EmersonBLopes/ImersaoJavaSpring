package br.com.alura.linguagensapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class LinguagemController{
	
	@Autowired
	private LinguagemRepository Repositorio;
	
	@GetMapping("/linguagens")
	public List<Linguagem> obterLinguagens(){
		List<Linguagem> Linguagens = Repositorio.findAll();
		return Linguagens;
	}
	
	@PostMapping("/linguagens")
	public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem) {
		Linguagem linguagemSalva = Repositorio.save(linguagem);
		return linguagemSalva;
	}
}
