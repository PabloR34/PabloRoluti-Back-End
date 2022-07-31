/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliopablor.primerproyecto.Controller;

import com.portfoliopablor.primerproyecto.Entity.Persona;
import com.portfoliopablor.primerproyecto.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PabloR
 */

@RestController 
@CrossOrigin(origins ="http://localhost:4200")    
public class PersonaControler {
    @Autowired IPersonaService ipersonaService; 
    
    @GetMapping ("personas/traer")
    public List<Persona> getPersona() { 
        return ipersonaService.getPersona();
        
    } 
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        ipersonaService.deletePersona(id);
        return "La persona fue eliminada correctamente ";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/personas/editar/{id}")
    public Persona editePersona(@PathVariable Long id,
            @RequestBody Persona datapersona){
            
        Persona persona = ipersonaService.findPersona(id);
                
    persona.setNombre(datapersona.getNombre());
    persona.setApellido(datapersona.getApellido());
    persona.setImg(datapersona.getImg());
    
    ipersonaService.savePersona(persona);
    return persona; 
    }
  
  @GetMapping("personas/traer/perfil")
    public Persona findPersona(){
        return ipersonaService.findPersona((long)1);

}

}