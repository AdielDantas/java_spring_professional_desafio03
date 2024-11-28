package com.devsuperior.javaspringprofessional.desafio03.dto;

import com.devsuperior.javaspringprofessional.desafio03.entities.Client;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;
    private String name;
    private String cpf;
    private Double income;
    private LocalDate bithDate;
    private Integer children;

    public ClientDTO() {
    }

    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        bithDate = entity.getBithDate();
        children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBithDate() {
        return bithDate;
    }

    public Integer getChildren() {
        return children;
    }
}
