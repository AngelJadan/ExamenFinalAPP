package ec.ups.edu.operadora.services;

import java.util.Random;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("Solicitud")
public class RecepcionSolicitud {

	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/solicitud")
	public Message solicitud(@QueryParam("cedula")String cedula) {
		Message sms = new Message();
		boolean estado = false;
		Random rand = new Random();
		estado = rand.nextBoolean();
		sms.setCode("200");
		sms.setMessage(String.valueOf(estado));
		return sms;
	}
}
