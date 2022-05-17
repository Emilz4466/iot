package pl.zgora.uz.iot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import pl.zgora.uz.iot.dto.Dto;
import pl.zgora.uz.iot.entity.Entity;

public abstract class AbstractService implements Service<Dto, Entity> {
	@Autowired 
	JpaRepository<Entity, Long> repository;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public List<Dto> find() {
		List<Entity> entityList = repository.findAll();
		List<Dto> dtoList = new ArrayList<>();
		for(Entity entity : entityList) {
			Dto dto = null;
			assignEntityToDto(entity, dto);
			dtoList.add(dto);
		}
		
		return dtoList;
	}
	
	@Override
	public Dto find(Long id) {
		Optional<Entity> entity = repository.findById(id);
		Dto dto = null;
		assignEntityToDto(entity.get(), dto);		
		return dto;
	}
	
	@Override
	public Long save(Dto dto) {
		Entity entity = null;
		assignDtoToEntity(dto, entity);
		//TODO get ID z encji i dto - do poprawy
		return null;
	}
	
	@Override
	public Long update(Dto dto) {
		return null;

	}
	
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
