package pe.edu.upc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Observation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idObservation;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false, length = 2500)
	private String description;

	@JsonIgnore
	@ManyToOne
	private Child child;
}
