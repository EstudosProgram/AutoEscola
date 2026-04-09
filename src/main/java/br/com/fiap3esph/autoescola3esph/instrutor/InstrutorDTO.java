package br.com.fiap3esph.autoescola3esph.instrutor;

import br.com.fiap3esph.autoescola3esph.endereco.EnderecoDTO;

public record InstrutorDTO (String nome,
                            String email,
                            String cnh,
                            String especialidade,
                            EnderecoDTO endereco) {

}
