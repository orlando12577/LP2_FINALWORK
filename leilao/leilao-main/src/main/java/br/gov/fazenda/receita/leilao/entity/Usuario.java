package br.gov.fazenda.receita.leilao.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "usr_usuario")
@Data
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usr_id")
    private Long id;

    @Column(name = "usr_cpf")
    private String cpf;
    
    @Column(name = "usr_nome")
    private String nome;

    @Column(name = "usr_email")
    private String email;

    @Column(name = "usr_telefone")
    private String telefone;

    @OneToOne(mappedBy = "usuario")
    private Endereco endereco;

}
