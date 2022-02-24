package Spring.SpringSample.Servis;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import Spring.SpringSample.Dto.ulkeDto;
import Spring.SpringSample.Model.Ulkeler;
import Spring.SpringSample.Repository.Repo;

@Service
public class ulkeServisImpl implements ulkeServis {
	
	
	private Repo repo;
	private ModelMapper modelMapper;
	
	@Autowired
	public ulkeServisImpl(Repo repo,ModelMapper modelMapper) {
		this.repo=repo;
		this.modelMapper=modelMapper;
	}

	@Override
	public ulkeDto ulkeEkle(ulkeDto ulkeDto) {
		Ulkeler ulke=modelMapper.map(ulkeDto, Ulkeler.class);
		ulke.setCreateDate(new Date());
		ulke.setCreateName("admin");
		return  modelMapper.map(repo.save(ulke),ulkeDto.class);
	}

	@Override
	public List<ulkeDto> ulkeGetir() {
		List<ulkeDto> DTO=repo.findAll().stream().map(x->modelMapper.map(x,ulkeDto.class)).toList();
		return DTO;
	}

	@Override
	public ulkeDto ulkeGetirId(int id) {
		Optional<Ulkeler> ulke=repo.findById(id);
		if(ulke.isPresent())
			return modelMapper.map(ulke.get(),ulkeDto.class);	
		else
			throw new IllegalArgumentException("Kullanıcı bulunamadı");
	}

	@Override
	public ulkeDto ulkeGuncelle(int id, ulkeDto ulkeDto) {
		Optional<Ulkeler> ulke=repo.findById(id);
		ulke.get().setBayrak(ulkeDto.getBayrak());
		ulke.get().setIsim(ulkeDto.getIsim());
		ulke.get().setUpdateDate(new Date());
		ulke.get().setUpdateName("user");
		
		return  modelMapper.map(repo.save(ulke.get()),ulkeDto.class);
	}

	@Override
	public Page<Ulkeler> ulkeSayfalama(int current, int size) {
		Pageable pagaable= PageRequest.of(current, size);
	
		return repo.findAll(pagaable);
	}
}
