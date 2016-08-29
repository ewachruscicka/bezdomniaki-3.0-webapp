package pl.bezdomniaki;

import java.util.List;

public class Schronisko {
	private int id;
	private String nazwa;
	private String miejscowosc;
	private String telefon;
	private String email;
	private List<Pies> listaPsow;
	
	public List<Pies> getListaPsow() {
		return listaPsow;
	}
	public void setListaPsow(List<Pies> listaPsow) {
		this.listaPsow = listaPsow;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public String getMiejscowosc() {
		return miejscowosc;
	}
	public void setMiejscowosc(String miejscowosc) {
		this.miejscowosc = miejscowosc;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Schronisko [id=" + id + ", nazwa=" + nazwa + ", miejscowosc=" + miejscowosc + ", telefon=" + telefon
				+ ", email=" + email + ", listaPsow=" + listaPsow + "]";
	}
	
	
	
}

