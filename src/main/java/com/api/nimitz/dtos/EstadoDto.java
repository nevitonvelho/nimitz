package com.api.nimitz.dtos;

import javax.validation.constraints.NotBlank;

public class EstadoDto {

    @NotBlank
    private  String estadoName;
    @NotBlank
    private  String estadoStatus;


    public String getEstadoName() {
        return estadoName;
    }

    public void setEstadoName(String estadoName) {
        this.estadoName = estadoName;
    }

    public String getEstadoStatus() {
        return estadoStatus;
    }

    public void setEstadoStatus(String estadoStatus) {
        this.estadoStatus = estadoStatus;
    }
}
