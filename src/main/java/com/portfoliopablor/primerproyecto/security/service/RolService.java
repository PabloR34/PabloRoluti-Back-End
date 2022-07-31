/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliopablor.primerproyecto.security.service;

import com.portfoliopablor.primerproyecto.security.entity.Rol;
import com.portfoliopablor.primerproyecto.security.enums.RolNombre;
import com.portfoliopablor.primerproyecto.security.repository.iRolRepository;
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

public class RolService {
@Autowired
iRolRepository irolRepository;

public Optional<Rol> getByNombre (RolNombre rolNombre) {
    return irolRepository.findByRolNombre(rolNombre);
}
 
public void save (Rol rol){
    irolRepository.save(rol); 
}

}
