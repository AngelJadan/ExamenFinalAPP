package ec.ups.edu.examenFinal.services;

import java.util.Date;
import java.util.Random;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("Autorizacion")
public class autorizacion {

	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/autorizacion")
	public Message solicitud(@QueryParam("cedula")String cedula, @QueryParam("nombre") String nombre
			,@QueryParam("apellido") String apellido,@QueryParam("valor") String valor) {
		Message sms = new Message();
		boolean estado = false;
		Random rand = new Random();		
		estado = rand.nextBoolean();
		Date fecha =new Date();
		
		if (estado==true) {
			sms.setCode("200");
			sms.setAutorizacion("Autorizado");
			sms.setMessage(fecha+cedula+"Factura: "+rand.nextInt()*100);
		}else{
			sms.setCode("200");
			sms.setAutorizacion("Rechazado");
			sms.setMessage(fecha+cedula);
		}
		return sms;
	}
}
