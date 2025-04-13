package com.example.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/comunas")
public class ComunasResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public List<String> getComunas() {
        // Aquí puedes retornar tu lista de comunas
        // Esto es un ejemplo, reemplaza con tus datos reales
        return List.of(
                "Comuna 1",
                "Comuna 2",
                "Comuna 3",
                "Comuna 4",
                "Comuna 5",
                "Comuna 6",
                "Comuna 7");
    }
}