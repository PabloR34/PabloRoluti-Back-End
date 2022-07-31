/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliopablor.primerproyecto.security.service;

import com.portfoliopablor.primerproyecto.security.entity.Usuario;
import com.portfoliopablor.primerproyecto.security.repository.iUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PabloR
 */

@Service
@Transactional 
public class UsuarioService {
    
@Autowired
iUsuarioRepository iusuarioRepository;

public Optional< Usuario> getNombreUsuario (String nombreUsuario){
   return iusuarioRepository.findByNombreUsuario(nombreUsuario); 
}

public boolean existsByNombreUsuario (String nombreUsuario){
    return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
}
public boolean existsByNombreEmail (String email){
    return iusuarioRepository.existsByNombreUsuario(email);
}

public void save (Usuario usuario){
    iusuarioRepository.save(usuario);
}
}
