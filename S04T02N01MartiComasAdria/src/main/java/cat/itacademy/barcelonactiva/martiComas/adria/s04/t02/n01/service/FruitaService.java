package cat.itacademy.barcelonactiva.martiComas.adria.s04.t02.n01.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cat.itacademy.barcelonactiva.martiComas.adria.s04.t02.n01.model.domain.Fruita;

public interface FruitaService {

	public Iterable<Fruita> findAll();
	
	public Page<Fruita> findAll(Pageable pageable);
	
	public Optional<Fruita> findById(Long id);

	public Fruita save(Fruita fruita);
	
	public void deleteById(Long id);
	
	//afegir metodes que calguin
	
}
