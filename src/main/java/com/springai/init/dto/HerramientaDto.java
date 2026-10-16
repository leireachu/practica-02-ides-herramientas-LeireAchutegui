package com.springai.init.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class HerramientaDto {

    private String nombreIDE;
    private String urlDescarga;
    private String descripcion;
    private int valoracionUsuarios;
}
