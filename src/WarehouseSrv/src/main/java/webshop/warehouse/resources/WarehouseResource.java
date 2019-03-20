package webshop.warehouse.resources;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codahale.metrics.annotation.Timed;

import io.dropwizard.jersey.params.IntParam;
import io.dropwizard.jersey.params.LongParam;
import webshop.warehouse.api.BaseResponse;
import webshop.warehouse.api.ProductAvailabilityCheckResponse;
import webshop.warehouse.db.WarehouseRepository;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class WarehouseResource {

	// TODO Ex2, Task2: Replace this class with warehouse (product availability) resource class from the ProductSrv

	private WarehouseRepository warehouseRepository;
	private Logger log;

	public WarehouseResource(WarehouseRepository repository) {
		this.warehouseRepository = repository;
		this.log = LoggerFactory.getLogger(WarehouseResource.class);
		log.info("WarehouseResource instantiated...");
	}

}