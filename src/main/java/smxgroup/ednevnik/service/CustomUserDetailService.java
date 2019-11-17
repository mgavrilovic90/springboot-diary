package smxgroup.ednevnik.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import smxgroup.ednevnik.entity.Korisnik;
import smxgroup.ednevnik.repository.KorisnikRepository;

@Service
public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	private KorisnikRepository korisnikRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Korisnik> optKorisnik = korisnikRepository.findById(username);
		
		if(!optKorisnik.isPresent()) {
			throw new UsernameNotFoundException("Korisnik ne postoji");
		}
		
		CustomUserDetails cud = new CustomUserDetails();
		cud.setKorisnik(optKorisnik.get());
		return cud;
		
	}

}
