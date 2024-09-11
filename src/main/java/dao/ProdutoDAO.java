package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Produto;

public interface ProdutoDAO extends JpaRepository<Produto, Integer> {

}
