package br.com.cinemotion.Serivices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.cinemotion.Entity.Rol;
import br.com.cinemotion.Enum.RolNombre;
import br.com.cinemotion.Repository.RolRepository;

import java.util.Optional;

@Service
@Transactional
public class RolService {

	 @Autowired
	 RolRepository rolRepository;

    public void save(Rol rol){
    	
        rolRepository.save(rol);
    }

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
    	System.out.println("##2#85661561568618596189681691846451454###8888"+ rolNombre);
        return rolRepository.findByRolNombre(rolNombre);
    }

    public boolean existsByRolNombre(RolNombre rolNombre){
    	System.out.println("##2#85661561568618596189681691846451454###");
        return rolRepository.existsByRolNombre(rolNombre);
    }
}