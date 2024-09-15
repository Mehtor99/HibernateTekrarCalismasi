package org.mehtor.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tblmusteri")
public class Musteri {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ad;
	
	@OneToMany(mappedBy = "musteri")
	private List<Satis> satislar;
	
	
	public Musteri() {
	}
	
	public Musteri(String ad, List<Satis> satislar) {
		this.ad = ad;
		this.satislar = satislar;
	}
	
	public Musteri(Long id, String ad) {
		this.id = id;
		this.ad = ad;
//		this.satislar = satislar;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public List<Satis> getSatislar() {
		return satislar;
	}
	
	public void setSatislar(List<Satis> satislar) {
		this.satislar = satislar;
	}
}