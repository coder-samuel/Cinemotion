package br.com.cinemotion.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import br.com.cinemotion.Entity.Rol;
import br.com.cinemotion.Enum.RolNombre;
import br.com.cinemotion.Serivices.RolService;

@Service
public class NuevoRol implements CommandLineRunner {

    @Autowired
    RolService rolService;

    @Override
    public void run(String... args) throws Exception {
    	
    	
        /*Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
        Rol rolUser = new Rol(RolNombre.ROLE_USER);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$4");
        rolAdmin.toString();
        rolService.save(rolAdmin);
        rolService.save(rolUser); */
    }
}