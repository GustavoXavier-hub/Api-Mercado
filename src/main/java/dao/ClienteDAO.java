package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Cliente;

public interface ClienteDAO  extends JpaRepository<Cliente, Integer> {

}
