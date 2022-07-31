/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfoliopablor.primerproyecto.Interface;

import com.portfoliopablor.primerproyecto.Entity.Persona;
import java.util.List;


/**
 *
 * @author PabloR
 */
public interface IPersonaService {
// traer una lista de personas
public List<Persona> getPersona();
// guardar un objeto de tipo persona
public void savePersona (Persona Persona);
// eliminar un objeto pero lo buscamos por id
public void deletePersona (Long id);
// buscar una persona por id
public Persona findPersona (Long id);

}
