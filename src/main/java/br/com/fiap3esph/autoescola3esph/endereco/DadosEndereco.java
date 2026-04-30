package br.com.fiap3esph.autoescola3esph.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        @NotBlank
        String logradouro,
        String numero,
        String complemento,
        @NotBlank
        String bairro,
        @NotBlank
        String cidade,
        @NotBlank
        @Pattern(regexp = "[A-z]{2}")
        String uf,
        @NotBlank
        @Pattern(regexp = "\\d{5}-\\d{3}")
        String cep) {
}
