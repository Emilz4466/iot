package pl.zgora.uz.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.zgora.uz.iot.entity.TeamEntity;

@Repository
public interface TeamRepository extends JpaRepository<TeamEntity, Long>{

}
