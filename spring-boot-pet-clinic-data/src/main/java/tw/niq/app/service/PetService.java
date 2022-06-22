package tw.niq.app.service;

import java.util.Set;

import tw.niq.app.model.Pet;

public interface PetService {
	
	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
	
}
