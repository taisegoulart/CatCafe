import javax.annotation.security.RolesAllowed;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import java.util.List;
@Path("/api/cats")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
@RolesAllowed("normal-user")
public class UserCatResource {
    public class UserCatResource {

    @GET
    public List<Cat> getAllCats() {
        return Cat.listAll();
    }

    @GET
    @Path("/{id}")
    public Cat getCat(@PathParam("id") Long id) {
        return Cat.findById(id);
    }

    @GET
    public List<Cat> getAllCoffees() {
        return Coffees.listAll();
    }

    @GET
    @Path("/{id}")
    public Cat getCoffee(@PathParam("id") Long id) {
        return Coffee.findById(id);
    } //Adicionando aqui os cafés também para o usuário poder visualizar!
}


    
}
