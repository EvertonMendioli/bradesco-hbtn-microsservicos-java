package com.example.jpa_h2_demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa_h2_demo.model.Cliente;
import com.example.jpa_h2_demo.repository.ClienteRepository;

@RestController
        public class ClienteController {

          @Autowired
          private ClienteRepository clienteRepository;

          @PostMapping("/addClient")
          public ResponseEntity<Cliente> addClient(@RequestBody Cliente cliente) {
            Cliente novoCliente = clienteRepository.save(cliente);
            return new ResponseEntity<>(novoCliente, HttpStatus.CREATED);
          }

          @GetMapping("/findAllClients")
          public ResponseEntity<List<Cliente>> findAllClients() {
            List<Cliente> clientes = clienteRepository.findAll();
            return new ResponseEntity<>(clientes, HttpStatus.OK);
        }

          @GetMapping("/findClientById/{id}")
          public ResponseEntity<Cliente> findClientById(@PathVariable("id") Long idClient) {
                 Optional<Cliente> cliente = clienteRepository.findById(idClient);
                 return ResponseEntity.ok(cliente.get());

          }

          @DeleteMapping("/removeClientById/{id}")
            @ResponseStatus(HttpStatus.NO_CONTENT)
            public void removerCliente(@PathVariable("id") Long idClient){
                    clienteRepository.deleteById(idClient);
            }

          @PutMapping("/updateClientById/{id}")
            @ResponseStatus(HttpStatus.NO_CONTENT)
            public void updateCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente){
                Optional<Cliente> pesquisar = clienteRepository.findById(id);
                Cliente atualizar = pesquisar.get();
                atualizar.setNome(cliente.getNome());
                atualizar.setEmail(cliente.getEmail());
                atualizar.setIdade(cliente.getIdade());
                atualizar.setEnderecos(cliente.getEnderecos());
                atualizar.setTelefones(cliente.getTelefones());

                clienteRepository.save(atualizar);
            }
        }