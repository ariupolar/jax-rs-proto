/**
 * @author myUserValue
 */
package com.ariupolar.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {

    // This method is called if TEXT_PLAIN is request
    @GET
    @Path("/plain")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayPlainTextHello() {
        return "Hello Plain Jersey";
    }

    // This method is called if XML is request
    @GET
    @Path("/xml")
    @Produces(MediaType.TEXT_XML)
    public String sayXMLHello() {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello Xml Jersey" + "</hello>";
    }

    // This method is called if HTML is request
    @GET
    @Path("/html")
    @Produces(MediaType.TEXT_HTML)
    public String sayHtmlHello() {
        return "<html> " + "<title>" + "Hello HTML Jersey" + "</title>" + "<body><h1>" + "Hello HTML Jersey" + "</body></h1>" + "</html> ";
    }
}