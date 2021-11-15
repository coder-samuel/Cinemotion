package br.com.cinemotion.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.cinemotion.Entity.Rol;
import br.com.cinemotion.Entity.Usuario;
import br.com.cinemotion.Enum.RolNombre;
import br.com.cinemotion.Serivices.RolService;
import br.com.cinemotion.Serivices.UsuarioService;

import java.util.HashSet;
import java.util.Set;

@Service
public class NuevoAdmi implements CommandLineRunner {

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    RolService rolService;

    @Override
    public void run(String... args) throws Exception {
       /*Usuario usuario = new Usuario();
        String passwordEncoded = passwordEncoder.encode("admin");
        usuario.setNombreUsuario("admin");
        usuario.setPassword(passwordEncoded);
        Rol rolAdmin = rolService.getByRolNombre(RolNombre.ROLE_ADMIN).get();
        Rol rolUser = rolService.getByRolNombre(RolNombre.ROLE_USER).get();
        Set<Rol> roles = new HashSet<>();
        roles.add(rolAdmin);
        roles.add(rolUser);
        usuario.setRoles(roles);
        usuarioService.save(usuario);   /**/
    	
    	/*Usuario usuario = new Usuario();
        String passwordEncoded = passwordEncoder.encode("user");
        usuario.setNombreUsuario("user");
        usuario.setPassword(passwordEncoded);
        Rol rolUser = rolService.getByRolNombre(RolNombre.ROLE_USER).get();
        Set<Rol> roles = new HashSet<>();
        roles.add(rolUser);
        usuario.setRoles(roles);
        usuarioService.save(usuario);*/
    }
}