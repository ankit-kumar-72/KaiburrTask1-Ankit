package com.kaiburr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.kaiburr.model.Server;
import com.kaiburr.repository.ServerRepository;

@Service
public class ServerService {

	@Autowired
	public ServerRepository serverRepository;

	public ResponseEntity<List<Server>> getAllServers(){

		List<Server> servers= serverRepository.findAll();
		if(servers.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(servers));
	}

	public ResponseEntity<Optional<Server>> getServerById(long id) {
		Optional<Server> server= serverRepository.findById(id);
		if(server.isPresent()) {
			return ResponseEntity.of(Optional.of(server));
		}

		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	public String addServer(Server server) {
		serverRepository.insert(server);
		return "Server added :" + server;
	}

	public String deleteServer(long id) {
		Optional<Server> server=serverRepository.findById(id);
		serverRepository.deleteById(id);
		return "Server deleted : "+ server;
	}

	public ResponseEntity<List<Server>> getServerByName(String name) {
		List<Server> servers= serverRepository.findByName(name);
		if(servers.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(servers));
	}
}
