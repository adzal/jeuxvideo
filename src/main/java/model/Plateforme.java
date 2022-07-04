package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Plateforme {
	private int plateformeId;
	private String nom;
	private String description;
}