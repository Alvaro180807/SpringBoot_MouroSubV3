package com.mourosub.web.repository;

import com.mourosub.web.model.Alquileres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlquilerRepository extends JpaRepository<Alquileres, Long> {

}
