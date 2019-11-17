package smxgroup.ednevnik.service;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import smxgroup.ednevnik.entity.Korisnik;


public class CustomUserDetails implements UserDetails {


	/**
	 * 
	 */
	private static final long serialVersionUID = 8833752965406010197L;
	
	private Korisnik korisnik;
	
	
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(15);
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return korisnik.getUloge().stream().map(uloga -> new SimpleGrantedAuthority("ROLE_" + uloga.getNaziv()))
				.collect(Collectors.toList());
		
	}

	@Override
	public String getPassword() {
		String lozinka = korisnik.getLozinka();
		String elozinka = encoder.encode(lozinka);
		return elozinka;
		
	}

	@Override
	public String getUsername() {
		return korisnik.getKorisnickoIme();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}
	
	

}
