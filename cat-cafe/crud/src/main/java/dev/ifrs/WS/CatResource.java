import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/cats")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class CatResource {

    @GET
    public List<Cat> getAllCats() {
        return Cat.listAll();
    }

    @GET
    @Path("/{id}")
    public Cat getCat(@PathParam("id") Long id) {
        return Cat.findById(id);
    }
}
