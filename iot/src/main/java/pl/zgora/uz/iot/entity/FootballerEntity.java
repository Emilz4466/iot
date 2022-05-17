package pl.zgora.uz.iot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@SuppressWarnings("serial")
@javax.persistence.Entity
@Table(name = "FOOTBALLER")
public class FootballerEntity implements Serializable, Entity{

	
	@Id
	@Column(name = "ID_BOOK", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_G_USER")
	@SequenceGenerator(name = "S_G_USER", allocationSize = 10)
	private Long id;
	
	@Column(name = "NAME", nullable = false)
	private String footballerName;
	
	@Column(name = "SURNAME", nullable = false)
	private String footballerSurname;

	
	@Column(name = "NUMBER", nullable = false)
	private int number;
	
	@ManyToOne
	@JoinColumn(name = "ID_POSITION", unique = true)
	private PositionEntity positionEntity;
	
	@ManyToOne
	@JoinColumn(name = "ID_TEAM", unique = true)
	private TeamEntity teamEntity;

	public Long getId() {
		return id;
	}

	public String getFootballerName() {
		return footballerName;
	}

	public String getFootballerSurname() {
		return footballerSurname;
	}

	public int getNumber() {
		return number;
	}

	public PositionEntity getPositionEntity() {
		return positionEntity;
	}

	public TeamEntity getTeamEntity() {
		return teamEntity;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setFootballerName(String footballerName) {
		this.footballerName = footballerName;
	}

	public void setFootballerSurname(String footballerSurname) {
		this.footballerSurname = footballerSurname;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setPositionEntity(PositionEntity positionEntity) {
		this.positionEntity = positionEntity;
	}

	public void setTeamEntity(TeamEntity teamEntity) {
		this.teamEntity = teamEntity;
	}

}
