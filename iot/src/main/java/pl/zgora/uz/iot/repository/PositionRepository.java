package pl.zgora.uz.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.zgora.uz.iot.entity.PositionEntity;

@Repository
public interface PositionRepository extends JpaRepository<PositionEntity, Long>{

}
