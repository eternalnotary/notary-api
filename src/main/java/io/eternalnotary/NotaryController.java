package io.eternalnotary;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import java.util.ArrayList;
import java.util.List;

@Controller("/notary")
public class NotaryController {
    @Get("/") 
    @Produces(MediaType.APPLICATION_JSON)
    public List index() {
        return new ArrayList();
    }
}