package tw.niq.app.service;

import org.springframework.stereotype.Service;

import tw.niq.app.model.Pet;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {

}
