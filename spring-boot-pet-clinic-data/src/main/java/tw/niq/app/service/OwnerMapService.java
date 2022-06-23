package tw.niq.app.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import tw.niq.app.model.Owner;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Owner findByLastName(String lastName) {
		return map.entrySet().stream()
				.filter(entry -> entry.getValue().getLastName().equals(lastName))
				.map(Map.Entry::getValue)
				.findFirst().orElse(null);
	}

}
