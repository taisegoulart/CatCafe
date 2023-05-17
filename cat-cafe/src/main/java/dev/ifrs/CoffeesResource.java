import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/coffees")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class CoffeesResource {

    @GET
    public List<Coffee> getAllCoffees() {
        return Coffee.listAll();
    }

    @GET
    @Path("/{id}")
    public Coffee getCoffee(@PathParam("id") Long id) {
        return Coffee.findById(id);
    }

    @POST
    public Response addCoffee(Coffee coffee) {
        coffee.persist();
        return Response.status(Response.Status.CREATED).entity(coffee).build();
    }

    @PUT
    @Path("/{id}")
    public Coffee updateCoffee(@PathParam("id") Long id, Coffee updatedCoffee) {
        Coffee coffee = Coffee.findById(id);
        coffee.setName(updatedCoffee.getName());
        coffee.setDescription(updatedCoffee.getDescription());
        coffee.setPrice(updatedCoffee.getPrice());
        return coffee;
    }

    @DELETE
    @Path("/{id}")
    public Response deleteCoffee(@PathParam("id") Long id) {
        Coffee coffee = Coffee.findById(id);
        if (coffee != null) {
            coffee.delete();
            return Response.noContent().build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
