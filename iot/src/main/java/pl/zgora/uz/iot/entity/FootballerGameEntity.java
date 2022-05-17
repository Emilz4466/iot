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
@Table(name = "FOOTBALLER_GAME")
public class FootballerGameEntity implements Serializable, Entity{

	@Id
	@Column(name = "ID_FOOTBALLER_GAME", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_G_USER")
	@SequenceGenerator(name = "S_G_USER", allocationSize = 10)
	private Long id;
	
	@Column(name = "DISTANCE", nullable = false)
	private double distance;
	
	@ManyToOne
	@JoinColumn(name = "FOOTBALLER_ID_FOOTBALLER", unique = true)
	private FootballerEntity footballerEntity;
	
	@ManyToOne
	@JoinColumn(name = "GAME_ID_GAME", unique = true)
	private GameEntity gameEntity;

	public Long getId() {
		return id;
	}

	public double getDistance() {
		return distance;
	}

	public FootballerEntity getFootballerEntity() {
		return footballerEntity;
	}

	public GameEntity getGameEntity() {
		return gameEntity;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public void setFootballerEntity(FootballerEntity footballerEntity) {
		this.footballerEntity = footballerEntity;
	}

	public void setGameEntity(GameEntity gameEntity) {
		this.gameEntity = gameEntity;
	}
	
}
