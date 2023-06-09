import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/coffees")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class CoffeeResource {

    @GET
    public List<Coffee> getAllCoffees() {
        return Coffee.listAll();
    }

    @GET
    @Path("/{id}")
    public Coffee getCoffee(@PathParam("id") Long id) {
        return Coffee.findById(id);
    }

}

