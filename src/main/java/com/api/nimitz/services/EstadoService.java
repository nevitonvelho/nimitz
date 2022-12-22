package com.api.nimitz.services;

import com.api.nimitz.models.EstadoModel;
import com.api.nimitz.repositories.EstadoRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EstadoService {

  final EstadoRepository estadoRepository;
  public EstadoService(EstadoRepository estadoRepository){
      this.estadoRepository = estadoRepository;
  }

  @Transactional
    public EstadoModel save(EstadoModel estadoModel) {
      return estadoRepository.save(estadoModel);
    }
}
