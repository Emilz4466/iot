package pl.zgora.uz.iot.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@SuppressWarnings("serial")
@javax.persistence.Entity
@Table(name = "GAME")
public class GameEntity implements Serializable, Entity {

	@Id
	@Column(name = "ID_GAME", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_G_USER")
	@SequenceGenerator(name = "S_G_USER", allocationSize = 10)
	private Long id;
	
	@Column(name = "GAME_DATE", nullable = false)
	private LocalDate gameDate;

	public Long getId() {
		return id;
	}

	public LocalDate getGameDate() {
		return gameDate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setGameDate(LocalDate gameDate) {
		this.gameDate = gameDate;
	}
	
	
}
