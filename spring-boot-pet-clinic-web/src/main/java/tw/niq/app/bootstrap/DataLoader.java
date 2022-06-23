package tw.niq.app.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import tw.niq.app.model.Owner;
import tw.niq.app.model.Vet;
import tw.niq.app.service.OwnerMapService;
import tw.niq.app.service.OwnerService;
import tw.niq.app.service.VetMapService;
import tw.niq.app.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {
	
	private final OwnerService ownerService;
	private final VetService vetService;

	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Owner owner_1 = new Owner();
		
		owner_1.setId(1L);
		owner_1.setFirstName("Michael");
		owner_1.setLastName("Weston");
		
		ownerService.save(owner_1.getId(), owner_1);
		
		Owner owner_2 = new Owner();
		
		owner_2.setId(2L);
		owner_2.setFirstName("Fiona");
		owner_2.setLastName("Glenanne");
		
		ownerService.save(owner_2.getId(), owner_2);
		
		System.out.println("Loaded owners...");
		
		Vet vet_1 = new Vet();
		
		vet_1.setId(1L);
		vet_1.setFirstName("Sam");
		vet_1.setLastName("Axe");
		
		vetService.save(vet_1.getId(), vet_1);
		
		Vet vet_2 = new Vet();
		
		vet_2.setId(2L);
		vet_2.setFirstName("Jessie");
		vet_2.setLastName("Porter");
		
		vetService.save(vet_2.getId(), vet_2);
		
		System.out.println("Loaded vets...");
	}

}
