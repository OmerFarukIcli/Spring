package Spring.SpringSample.Servis;

import java.util.List;


import org.springframework.data.domain.Page;

import Spring.SpringSample.Dto.ulkeDto;
import Spring.SpringSample.Model.Ulkeler;


public interface ulkeServis {	
	ulkeDto ulkeEkle(ulkeDto ulkeDto);
	List<ulkeDto> ulkeGetir();
	ulkeDto ulkeGetirId(int id);
	ulkeDto ulkeGuncelle(int id,ulkeDto ulkeDto);
	Page<Ulkeler> ulkeSayfalama(int current,int size);
}
