package br.com.cinemotion.Serivices.CinemaImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cinemotion.Entity.Pelicula;
import br.com.cinemotion.Repository.PeliculaRepository;
import br.com.cinemotion.Serivices.IPelicula;

@Service("peliculaService")
public class PeliculaImpl implements IPelicula{
	
	@Autowired
	PeliculaRepository peliculaRepository;

	@Override
	public Pelicula save(Pelicula p) {
		peliculaRepository.save(p);
		return p;
	}

	@Override
	public List<Pelicula> getAllPelicula() {
		return peliculaRepository.findAll();
	}

	@Override
	public Pelicula getPeliculaById(Integer id) {
		// TODO Auto-generated method stub
		return peliculaRepository.getOne(id);
	}

	@Override
	public void deletePeliculaById(long id) {
		// TODO Auto-generated method stub
		
	}
	

}
