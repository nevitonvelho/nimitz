package com.api.nimitz.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_SCRAPING")

public class EstadoModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, length = 10)
    private String estadoName;

    @Column(nullable = false)
    private Boolean estadoStatus;

    @Column(nullable = false)
    private LocalDateTime verificacaoEstado;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEstadoName() {
        return estadoName;
    }

    public void setEstadoName(String estadoName) {
        this.estadoName = estadoName;
    }

    public Boolean getEstadoStatus() {
        return estadoStatus;
    }

    public void setEstadoStatus(Boolean estadoStatus) {
        this.estadoStatus = estadoStatus;
    }

    public LocalDateTime getVerificacaoEstado() {
        return verificacaoEstado;
    }

    public void setVerificacaoEstado(LocalDateTime verificacaoEstado) {
        this.verificacaoEstado = verificacaoEstado;
    }
}
