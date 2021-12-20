package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "Produit")
public class Produit implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProduit")
	private Long idProduit; // Clé primaire
	private String code;
	private String libelle;
	private Float prixUnitaire;

	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Fournisseur> Fournisseur;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "Produit")
	private Set<detailFacture> detailFacture;

	@ManyToOne
	private Stock Stock;

	@ManyToOne
	private Rayon Rayon;

	@OneToOne
	private DetailProduit DetailProduit;
	
	
	// I added setStock(Stock retrieveStock)
	public void setStock(Stock retrieveStock) {
		
	}

}
