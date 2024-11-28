package com.devsuperior.javaspringprofessional.desafio03.repositories;

import com.devsuperior.javaspringprofessional.desafio03.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
