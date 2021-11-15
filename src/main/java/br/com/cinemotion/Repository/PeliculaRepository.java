package br.com.cinemotion.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cinemotion.Entity.Pelicula;

@Repository("PeliculaRepository")
public interface PeliculaRepository extends JpaRepository<Pelicula, Integer> {

}
