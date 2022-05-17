package pl.zgora.uz.iot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@SuppressWarnings("serial")
@javax.persistence.Entity
@Table(name = "POSITION")
public class PositionEntity implements Serializable, Entity{

	@Id
	@Column(name = "ID_POSITION", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_G_USER")
	@SequenceGenerator(name = "S_G_USER", allocationSize = 10)
	private Long id;
	
	@Column(name = "POSITION_NAME", nullable = false)
	private String positionName;

	public Long getId() {
		return id;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	
	
}
