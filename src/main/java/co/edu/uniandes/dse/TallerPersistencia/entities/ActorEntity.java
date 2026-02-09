package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Data
@Entity
public class ActorEntity extends BaseEntity {

    String nombre;
    String nacionalidad;

    @ManyToMany(
        mappedBy = "actores"
    )

    List <PeliculaEntity> peliculas = new ArrayList<>();  
    



    
}
