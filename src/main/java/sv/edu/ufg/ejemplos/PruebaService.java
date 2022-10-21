package sv.edu.ufg.ejemplos;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class PruebaService {
    @Inject
    EntityManager em;

    public List<Prueba> findAll(){
        return em.createNamedQuery("Prueba.findAll").getResultList();
    }
}
