package br.unitins.bibliotecaL.livro;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends CrudRepository<Livro, Long> {
}

