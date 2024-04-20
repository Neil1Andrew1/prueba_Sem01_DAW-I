package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Cliente;
import com.empresa.repository.ClienteRepository;

@Service
public class ClienteServiceImp implements ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	
	@Override
	public List<Cliente> listaCliente() {
		return repo.findAll();
	}

	@Override
	public Cliente insertaCliente(Cliente obj) {
		return repo.save(obj);
	}

}
