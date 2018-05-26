package io.federecio.dropwizard.swagger.sample;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/")
@Api("/")

public class Resource {
    @GET
    @ApiOperation("get")
    @Path("/hello")
    public String hello() {
        return "hello";

    }
    @Path("/post")
    @ApiOperation("post")
    @POST
    @Consumes({MediaType.APPLICATION_FORM_URLENCODED})
    public Student getNameage(@FormParam("Name") @ApiParam(defaultValue = "name") String name,@FormParam("Age")
    @ApiParam(defaultValue = "age") int age)
    {
        System.out.println("#########Student details@@@@@@@@@");
        System.out.println("Student name:" + name);
        System.out.println("Student id:" + age);
        return getNameage(name, age);

    }






}