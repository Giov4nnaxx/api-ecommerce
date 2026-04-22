package br.com.senai.api_ecommerce.endereco;

import jakarta.persistence.Embeddable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable // permite uma classe componha outra
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Endereco {
    private String logradouro;
    private String bairro;
    private String cidade;
    private String cep;
    private String numero;
    private String complemento;
    private String uf;

    public Endereco(DadosEndereco endereco) {
        this.logradouro = endereco.logradouro();
        this.bairro = endereco.bairro();
        this.cidade = endereco.cidade();
        this.cep = endereco.cep();
        this.numero = endereco.numero();
        this.complemento = endereco.complemento();
        this.uf = endereco.uf();
    }
}
