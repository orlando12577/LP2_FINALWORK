package com.example.lp2_finalwork.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lp2_finalwork.Services.DispositivosInformaticaService;
import com.example.lp2_finalwork.dtos.DispositivoInformaticaDto;
import com.example.lp2_finalwork.dtos.DispositivoInformaticaForm;

@RestController
@RequestMapping("/api/dispositivosinformatica")
@CrossOrigin(origins="*")
public class DispositivosInformaticaController {

    @Autowired
	private DispositivosInformaticaService dispositivosInformaticaService;
	
	@GetMapping
	public ResponseEntity<List<DispositivoInformaticaDto>> getAll() {
		return dispositivosInformaticaService.getAll();
	}
	
	@PostMapping
	public ResponseEntity<DispositivoInformaticaDto> save(@RequestBody DispositivoInformaticaForm dispositivoInformaticaForm) {
		
		
		return dispositivosInformaticaService.save(dispositivoInformaticaForm);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<DispositivoInformaticaDto> update(@RequestBody DispositivoInformaticaForm dispositivoInformaticaForm, @PathVariable Integer id) {
		return dispositivosInformaticaService.update(dispositivoInformaticaForm, id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		dispositivosInformaticaService.delete(id);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DispositivoInformaticaDto> getById(@PathVariable Integer id){
		return dispositivosInformaticaService.getById(id);
	}
}


