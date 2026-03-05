package io.github.fabiomacieir.clientes.model.entity;

import jakarta.persistence.*;

@Entity
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @Column(nullable = false, length = 150)
    private  String descricao;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private  Cliente cliente;
}
