import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api/bookings")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class UserBookingResource {

    @GET
    public List<Booking> getAllBookings() {
        return Booking.listAll();
    }

    @POST
    public Response createBooking(Booking booking) {
        // Logic to check availability and create the booking
        // ...

        booking.persist();
        return Response.status(Response.Status.CREATED).entity(booking).build();
    }
}

