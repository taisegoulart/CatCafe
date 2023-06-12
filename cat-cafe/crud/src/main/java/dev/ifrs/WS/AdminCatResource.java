import javax.annotation.security.RolesAllowed;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


@Path("/admin/cats")
@Produces(MediaType.APPLICATION_JSON) //sempre tem que mandar json e produzir jason
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
@RolesAllowed("admin")
public class AdminCatResource {

    @GET
    public List<Cat> getAllCats() {
        return Cat.listAll();
    }

    @POST
    public Response addCat(Cat cat) {
        cat.persist();
        return Response.status(Response.Status.CREATED).entity(cat).build();
        
    }

    @PUT
    @Path("/{id}")
    public Cat updateCat(@PathParam("id") Long id, Cat updatedCat) {
        Cat cat = Cat.findById(id);
        if (cat != null) {
            cat.setName(updatedCat.getName());
            cat.setAge(updatedCat.getAge());
            cat.setSex(updatedCat.getSex());
            cat.setBreed(updatedCat.getBreed());
            cat.setBio(updatedCat.getBio());
        }
        return cat;
        //pensar sobre a persistência
    }

 @DELETE
    @Path("/{id}")
    public Response deleteCat(@PathParam("id") Long id) {
        Cat cat = Cat.findById(id);
        if (cat != null) {
            cat.delete();
            return Response.noContent().build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}


    