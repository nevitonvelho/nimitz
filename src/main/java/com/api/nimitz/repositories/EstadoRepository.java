package com.api.nimitz.repositories;

import com.api.nimitz.models.EstadoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EstadoRepository extends JpaRepository<EstadoModel, UUID> {

}
