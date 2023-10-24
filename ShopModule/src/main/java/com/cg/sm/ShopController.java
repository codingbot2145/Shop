package com.cg.sm;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ShopController {

	@Autowired
	private ShopService service;
		
	//Retrieval	
	@GetMapping("/shop")
	public List<Shop> list(){
	  return service.listAll();
    }
	
	//Retrieve By Id
	@GetMapping("/shop/(id)")
	public ResponseEntity <Shop> get(@PathVariable Integer id){
    try {
		Shop shop = service.get(id);
			return new ResponseEntity<Shop> (Shop,HttpStatus.OK);
	} 
    catch (Exception e) {
    	return new ResponseEntity<Shop> (HttpStatus.NOT_FOUND);
		
		
	}
	}
    //Create
	@PostMapping("/shop")
	public void add(@RequestBody Shop shop) {
		service.save(shop);
}

	//Update
	@PutMapping("/shop/(id)")
	
	public ResponseEntity<?> update(@RequestBody Shop shop1,@PathVariable Integer id){
		try {
			Shop existShop = service.get(id);
			service.save(shop1);
			return new ResponseEntity <> (HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity <> (HttpStatus.NOT_FOUND);	
		}
			
		}		
    //Delete
    @DeleteMapping("/shop/{id}")
    public void delete(@PathVariable Integer id) {
    	service.delete(id);
    }
}


