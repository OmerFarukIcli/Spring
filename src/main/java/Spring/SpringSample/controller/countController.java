package Spring.SpringSample.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Spring.SpringSample.Dto.ulkeDto;
import Spring.SpringSample.Model.Ulkeler;
import Spring.SpringSample.Servis.ulkeServis;

@RestController
@RequestMapping("/ulke")
public class countController {
	
	
	private ulkeServis ulkeServis;
	
	@Autowired
	public countController(ulkeServis ulkeServis) {
	     this.ulkeServis=ulkeServis;	
	 
	}
	
	@GetMapping("/getir")
	public  ResponseEntity<List<ulkeDto>> ulkeGetir(){
		return ResponseEntity.ok(ulkeServis.ulkeGetir());
	}
	
	@GetMapping("/getir/{id}")
	public  ResponseEntity<ulkeDto> ulkeGetirId(@PathVariable("id") int id){
		return ResponseEntity.ok(ulkeServis.ulkeGetirId(id));
	}
	@GetMapping("/sayfa")
	public  ResponseEntity<Page<Ulkeler>> ulkeSayfalama(@RequestParam int current,@RequestParam int size ){
		return ResponseEntity.ok(ulkeServis.ulkeSayfalama(current,size));
	}
	
	@PutMapping("/guncelle/{id}")
	public  ResponseEntity<ulkeDto> ulkeGuncelle(@PathVariable("id") int id,@RequestBody ulkeDto ulkeDto){
		return ResponseEntity.ok(ulkeServis.ulkeGuncelle(id, ulkeDto));
	}
	
	@PostMapping("/ekle")
	public ResponseEntity<ulkeDto> ulkeEkle(@RequestBody ulkeDto ulkeDto ){
		return ResponseEntity.ok(ulkeServis.ulkeEkle(ulkeDto));
	}
	
	

}
