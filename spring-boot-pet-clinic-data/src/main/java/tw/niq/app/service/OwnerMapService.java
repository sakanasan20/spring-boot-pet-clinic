package tw.niq.app.service;

import java.util.Map;

import tw.niq.app.model.Owner;

public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Owner findByLastName(String lastName) {
		return map.entrySet().stream()
				.filter(entry -> entry.getValue().getLastName().equals(lastName))
				.map(Map.Entry::getValue)
				.findFirst().orElse(null);
	}

}
