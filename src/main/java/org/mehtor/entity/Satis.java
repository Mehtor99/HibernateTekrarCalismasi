package org.mehtor.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "tblsatis")
public class Satis {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "musteri_id")
	private Musteri musteri;
	private String urun;
	
	
	public Satis() {
	}
	
	public Satis(Musteri musteri, String urun) {
		this.musteri = musteri;
		this.urun = urun;
	}
	
	public Satis(int id, Musteri musteri, String urun) {
		this.id = id;
		this.musteri = musteri;
		this.urun = urun;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Musteri getMusteri() {
		return musteri;
	}
	
	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}
	
	public String getUrun() {
		return urun;
	}
	
	public void setUrun(String urun) {
		this.urun = urun;
	}
}