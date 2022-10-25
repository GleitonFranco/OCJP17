package br.com.meta.modelo;

import java.time.LocalDate;
import java.util.List;

public class Pessoa {
    Integer id;
    LocalDate dataInicio;
    LocalDate dataFim;
    Contato contato;
    List<Pedido> pedidos;
}
