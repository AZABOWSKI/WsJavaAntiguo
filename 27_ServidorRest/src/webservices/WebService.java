package webservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import beans.Mensaje;

/*
 *  La anotaci�n @Path indica la ruta que debe seguir el usuario 
 *  para acceder al servicio web. Tambi�n puede especificarse por m�todos. 
 *  Lo comprender�s mejor cuando veamos c�mo se accede a un servicio web REST.
 */
@Path("mensaje")
public class WebService {
	/*
	 * La anotaci�n @GET indica el m�todo HTTP que se utilizar� para recibir 
	 * peticiones. 
	 * El m�todo mostrarMensaje atender� peticiones de clientes de tipo GET, 
	 * y tambi�n podemos utilizar @POST para atender peticiones de tipo POST.
	 * 
	 * La anotaci�n @Produces indica el tipo MIME de la respuesta del servidor.
	 */
	@GET
	@Produces({"text/plain"})
	public String mostrarMensaje() {
		Mensaje msg = new Mensaje("Hola amigo");
		return msg.getTexto();
	}
}
