package com.springai.init.controller;

import com.springai.init.dto.HerramientaDto;
import com.springai.init.service.HerramientasService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HerramientasController {

    private HerramientasService herramientasService;

    public HerramientasController(HerramientasService herramientasService) {
        super();
        this.herramientasService = herramientasService;
    }

    @GetMapping( value = "entornos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<HerramientaDto> obtenerEntornos(@RequestParam String lenguaje, @RequestParam int total) {
        return herramientasService.obtenerEntornos(lenguaje, total);
    }
}
