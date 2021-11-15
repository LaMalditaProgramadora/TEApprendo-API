package pe.edu.upc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.dto.SpecialistDto;
import pe.edu.upc.model.Specialist;
import pe.edu.upc.repository.IChildRepository;
import pe.edu.upc.repository.ISpecialistRepository;
import pe.edu.upc.service.ISpecialistService;

@Service
public class SpecialistServiceImpl implements ISpecialistService {
	
	@Autowired
	private ISpecialistRepository specialistRepository;
	@Autowired
	private IChildRepository childRepository;

	@Override
	public SpecialistDto listByIdSpecialist(int idSpecialist) {
		SpecialistDto specialistDto = convert(specialistRepository.findById(idSpecialist).get());
		return specialistDto;
	}
	
	@Override
	public SpecialistDto listByIdChild(int idChild) {
		SpecialistDto specialistDto = convert(childRepository.findById(idChild).get().getSpecialist());
		return specialistDto;
	}
	
	private SpecialistDto convert(Specialist specialist) {
		SpecialistDto specialistDto = new SpecialistDto();
		specialistDto.setIdSpecialist(specialist.getIdSpecialist());
		specialistDto.setNames(specialist.getNames());
		specialistDto.setLastNames(specialist.getLastNames());
		specialistDto.setUsername(specialist.getUserLogin().getUsername());
		specialistDto.setPassword(specialist.getUserLogin().getPassword());
		return specialistDto;
	}

}