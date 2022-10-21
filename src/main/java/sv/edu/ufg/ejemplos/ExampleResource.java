package sv.edu.ufg.ejemplos;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/hello")
public class ExampleResource {

    @Inject
    PruebaService pruebaService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Prueba> hello() {
        return pruebaService.findAll();
    }
}
