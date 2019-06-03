package com.iesvc.acceso.modelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoUbicacion extends JpaRepository<Ubicacion, String> {
	Ubicacion findByNombre( @Param("nombre") String  nombre);
}
