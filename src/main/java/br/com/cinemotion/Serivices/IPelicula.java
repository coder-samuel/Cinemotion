package br.com.cinemotion.Serivices;

import java.util.List;

import br.com.cinemotion.Entity.Pelicula;

public interface IPelicula {
	
	Pelicula save(Pelicula p);
	
	List<Pelicula> getAllPelicula();
	
	Pelicula getPeliculaById(Integer id);
	
	void deletePeliculaById(long id);
	

}
