package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class PeliculaEntity extends BaseEntity {
    String titulo;
    Integer anioLanzamiento;

    @ManyToMany
     List <ActorEntity> actores = new ArrayList<>();  

    @ManyToOne
    DirectorEntity director; 


    
}
