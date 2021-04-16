package br.com.jonatan.lutalivre.respositorio;

import br.com.jonatan.lutalivre.dominio.Lutador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LutadorRepository extends JpaRepository<Lutador, Integer> {
}
