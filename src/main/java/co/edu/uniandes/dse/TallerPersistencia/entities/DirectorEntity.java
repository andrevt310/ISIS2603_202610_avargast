package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity

public class DirectorEntity extends BaseEntity {
    String nombre;
    String biografia;


    @OneToMany(
        mappedBy = "director"
    )
    List<PeliculaEntity> peliculas = new ArrayList<>();   
       
}
