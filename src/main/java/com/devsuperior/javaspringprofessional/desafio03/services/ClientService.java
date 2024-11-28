package com.devsuperior.javaspringprofessional.desafio03.services;

import com.devsuperior.javaspringprofessional.desafio03.dto.ClientDTO;
import com.devsuperior.javaspringprofessional.desafio03.entities.Client;
import com.devsuperior.javaspringprofessional.desafio03.repositories.ClientRepository;
import com.devsuperior.javaspringprofessional.desafio03.services.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable) {
        Page<Client> result = repository.findAll(pageable);
        return result.map(x -> new ClientDTO(x));
    }
}
