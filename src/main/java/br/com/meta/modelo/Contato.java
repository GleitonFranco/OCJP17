package br.com.meta.modelo;

import java.time.LocalDate;
import java.util.List;

public class Contato {
    Integer id;
    LocalDate dataInicio;
    LocalDate dataFim;
    List<Telefone> telefones;
    List<Endereco> enderecos;
    List<Email> emails;
}
