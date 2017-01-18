package com.lance.jersey.services.helpPortal;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@Path("help")
@Produces(MediaType.APPLICATION_JSON)
public class HelpPortalWebService {

	@GET
	public ResponseEntity<String> getProducts(){
		return new ResponseEntity<>("This feature is currently under development", HttpStatus.OK);
	}
	
}
