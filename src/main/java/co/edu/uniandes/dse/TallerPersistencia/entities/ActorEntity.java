package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.ManyToMany;

public class ActorEntity {
    String nombre;
    String nacionalidad;

    @ManyToMany(
        mappedBy = "actores"
    )

    List <PeliculaEntity> peliculas = new ArrayList<>();  
    



    
}
