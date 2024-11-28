package com.devsuperior.javaspringprofessional.desafio03.services;

import com.devsuperior.javaspringprofessional.desafio03.dto.ClientDTO;
import com.devsuperior.javaspringprofessional.desafio03.entities.Client;
import com.devsuperior.javaspringprofessional.desafio03.repositories.ClientRepository;
import com.devsuperior.javaspringprofessional.desafio03.services.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não localizado"));
        return new ClientDTO(client);
    }
}
