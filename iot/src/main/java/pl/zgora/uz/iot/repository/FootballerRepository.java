package pl.zgora.uz.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.zgora.uz.iot.entity.FootballerEntity;

@Repository
public interface FootballerRepository extends JpaRepository<FootballerEntity, Long>{

}
