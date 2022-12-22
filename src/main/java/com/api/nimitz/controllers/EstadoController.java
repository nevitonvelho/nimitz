package com.api.nimitz.controllers;

import com.api.nimitz.dtos.EstadoDto;
import com.api.nimitz.models.EstadoModel;
import com.api.nimitz.repositories.EstadoRepository;
import com.api.nimitz.services.EstadoService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/estado")
public class EstadoController {

    final EstadoService estadoService;

    public EstadoController(EstadoService estadoService) {
        this.estadoService = estadoService;
    }

    @PostMapping
    public ResponseEntity<Object> saveEstado(@RequestBody @Valid EstadoDto estadoDto){
        var estadoModel = new EstadoModel();
        BeanUtils.copyProperties(estadoDto, estadoModel);
        estadoModel.setVerificacaoEstado(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(estadoService.save(estadoModel));
    }
}
