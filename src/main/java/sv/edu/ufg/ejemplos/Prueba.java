package sv.edu.ufg.ejemplos;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NamedQueries(
        {
                @NamedQuery(name = "Prueba.findAll",query = "select p from Prueba p")
        }
)
public class Prueba implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
