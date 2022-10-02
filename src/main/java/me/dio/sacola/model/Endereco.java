package me.dio.sacola.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@AllArgsConstructor       //LOMBOK - CRIA CONSTRUTORES
@Builder
@Data                     //LOMBOK - CRIA GETTERS E SETTERS
@Embeddable
@NoArgsConstructor
public class Endereco {
    private String cep;
    private String complemento;

}
