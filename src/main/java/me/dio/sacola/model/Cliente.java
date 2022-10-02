package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor       //LOMBOK - CRIA CONSTRUTORES
@Builder
@Data                     //LOMBOK - CRIA GETTERS E SETTERS
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @Embedded
    private Endereco endereco;
}
