package br.com.jonatan.lutalivre.respositorio;

import br.com.jonatan.lutalivre.dominio.Lutador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LutadorRepository extends JpaRepository<Lutador, Integer> {

  List<Lutador> findByVidaTrue();
}
