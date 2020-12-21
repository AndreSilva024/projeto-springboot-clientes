/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.forum.controller;

import br.com.alura.forum.controller.dto.ClienteDto;
import br.com.alura.forum.model.Cliente;
import br.com.alura.forum.repository.ClienteRepository;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author andre
 */

@RestController
public class ClienteController {
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    @RequestMapping("/Clientes/lista")
    public List<ClienteDto> lista (String id){
        if (id == null) {
            List<Cliente> clientes = clienteRepository.findAll();
            return ClienteDto.converter(clientes);
        }else{
            List<Cliente> clientes = clienteRepository.findByidentificacao(id);
            return ClienteDto.converter(clientes);
        }
       
        
    }
    
    
}
