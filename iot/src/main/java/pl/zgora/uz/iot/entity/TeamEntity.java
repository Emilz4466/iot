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
@Table(name = "TEAM")
public class TeamEntity implements Serializable, Entity{

	@Id
	@Column(name = "ID_TEAM", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_G_USER")
	@SequenceGenerator(name = "S_G_USER", allocationSize = 10)
	private Long id;
	
	@Column(name = "TEAM_NAME", nullable = false)
	private String teamName;
	
	@ManyToOne
	@JoinColumn(name = "ID_LEAGUE", unique = true)
	private LeagueEntity leagueEntity;

	public Long getId() {
		return id;
	}

	public String getTeamName() {
		return teamName;
	}

	public LeagueEntity getLeagueEntity() {
		return leagueEntity;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public void setLeagueEntity(LeagueEntity leagueEntity) {
		this.leagueEntity = leagueEntity;
	}
	
	
}
