package com.springai.init.service;

import com.springai.init.dto.HerramientaDto;

import java.util.List;

public interface HerramientasService {

    List<HerramientaDto> obtenerEntornos(String lenguaje, int total);
}
