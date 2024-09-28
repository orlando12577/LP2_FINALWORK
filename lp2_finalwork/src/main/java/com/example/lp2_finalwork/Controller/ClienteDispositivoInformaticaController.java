package com.example.lp2_finalwork.Controller;



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





import com.example.lp2_finalwork.Services.ClienteDIspositivoInformativaService;
import com.example.lp2_finalwork.dtos.ClienteDispositivoInformaticaDto;
import com.example.lp2_finalwork.dtos.ClienteDispositivoInformaticaForm;




import java.util.List;


@RestController
@RequestMapping("/api/lanceDi")
@CrossOrigin(origins="*")
public class ClienteDispositivoInformaticaController {

    @Autowired
	private ClienteDIspositivoInformativaService clienteDispositivoInformaticaService;
	
	@GetMapping
	public ResponseEntity<List<ClienteDispositivoInformaticaDto>> getAll() {

		return clienteDispositivoInformaticaService.getAll();
	}
	
	@PostMapping
	public ResponseEntity<ClienteDispositivoInformaticaDto> save(@RequestBody ClienteDispositivoInformaticaForm clienteDispositivoInformaticaForm) {
		
		
		return clienteDispositivoInformaticaService.save(clienteDispositivoInformaticaForm);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<ClienteDispositivoInformaticaDto> update(@RequestBody ClienteDispositivoInformaticaForm clienteDispositivoInformaticaForm, @PathVariable Integer id) {
		return clienteDispositivoInformaticaService.update(clienteDispositivoInformaticaForm, id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		clienteDispositivoInformaticaService.delete(id);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ClienteDispositivoInformaticaDto> getById(@PathVariable Integer id){
		return clienteDispositivoInformaticaService.getById(id);
	}
}
   


