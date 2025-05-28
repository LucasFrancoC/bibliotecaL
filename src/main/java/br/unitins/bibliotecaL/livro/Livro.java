package br.unitins.bibliotecaL.livro;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Livro {
    @Id
    @GeneratedValue
    Long idlivro;
    String titulo;
    String autor;
    String editora;
    int qtdepaginas;
}

