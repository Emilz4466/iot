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
@Table(name = "LEAGUE")
public class LeagueEntity implements Serializable, Entity{
	
	@Id
	@Column(name = "ID_LEAGUE", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_G_USER")
	@SequenceGenerator(name = "S_G_USER", allocationSize = 10)
	private Long id;
	
	@Column(name = "LEAGUE_NAME", nullable = false)
	private String leagueName;

	public Long getId() {
		return id;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}
	
	
}
