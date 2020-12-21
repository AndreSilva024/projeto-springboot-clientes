/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.forum.repository;

import br.com.alura.forum.model.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author andre
 */

public interface ClienteRepository extends JpaRepository<Cliente, Cliente> {

    public List<Cliente> findByidentificacao(String id);
    
}
