/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.forum.controller.dto;

import br.com.alura.forum.model.Cliente;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author andre
 */

public class ClienteDto {

   

    private Long id;
    private String nome;
    private String email;
    private String endereco;
    private String telefone;
    private String cnpj;
    
    public ClienteDto(Cliente cliente){
        this.id = cliente.getId();
        this.nome = cliente.getNome();
        this.email = cliente.getEmail();
        this.endereco = cliente.getEndereco();
        this.telefone = cliente.getTelefone();
        this.cnpj = cliente.getCnpj();
    }

     public static List<ClienteDto> converter(List<Cliente> clientes) {
         
         return clientes.stream().map(ClienteDto::new).collect(Collectors.toList());
         
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
     
     
    
}
