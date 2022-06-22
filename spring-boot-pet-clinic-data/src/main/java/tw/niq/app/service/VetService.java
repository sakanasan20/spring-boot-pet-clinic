package tw.niq.app.service;

import java.util.Set;

import tw.niq.app.model.Vet;

public interface VetService {
	
	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
	
}
