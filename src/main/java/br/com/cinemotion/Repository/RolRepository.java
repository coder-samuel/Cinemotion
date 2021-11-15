package br.com.cinemotion.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cinemotion.Entity.Rol;
import br.com.cinemotion.Enum.RolNombre;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
	
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    boolean existsByRolNombre(RolNombre rolNombre);
}