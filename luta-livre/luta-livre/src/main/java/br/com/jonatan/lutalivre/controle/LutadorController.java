package br.com.jonatan.lutalivre.controle;

import br.com.jonatan.lutalivre.dominio.Lutador;
import br.com.jonatan.lutalivre.respositorio.LutadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/lutadores")
public class LutadorController {

  @Autowired
  private LutadorRepository repository;

  @PostMapping
  public ResponseEntity postLutador(@RequestBody @Valid Lutador novoLutador){
    repository.save(novoLutador);
    return ResponseEntity.status(200).build();
  }
}
