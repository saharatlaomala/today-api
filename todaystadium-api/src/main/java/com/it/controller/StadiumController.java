package com.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.dto.StadiumDto;
import com.it.service.StadiumService;

@RestController
@RequestMapping("/v1/Stadium")
public class StadiumController {
	@Autowired
	private StadiumService stadiumService;
	
	@Autowired
	
	@GetMapping
	public ResponseEntity<Object> getStadiumAll() {
		return ResponseEntity.ok(stadiumService.findStadiumAll());

}
	
	@GetMapping("/{stdmId}")
	public ResponseEntity<Object> getStadiumByStdmId(@PathVariable(name = "stdmId")Integer stdmId) {
		return ResponseEntity.ok(stadiumService.findStadiumByStdmId(stdmId));
	}
	
	@PostMapping
	public ResponseEntity<Object> saveStadium(@RequestBody StadiumDto stadiumDto) {
		return ResponseEntity.ok(stadiumService.saveStadium(stadiumDto));
	}
	@PutMapping("/{stdmId}")
	public ResponseEntity<Object> updateStadium(
			@PathVariable(name = "stdmId") Integer stdmId,
			@RequestBody StadiumDto stadiumDto) {
		return ResponseEntity.ok(stadiumService.updateStadium(stdmId, stadiumDto));
	}
	
	@DeleteMapping("/{stdmId}") //
	public ResponseEntity<Object> deleteStadiumByStdmId(@PathVariable(name = "stdmId") Integer stdmId){
	return ResponseEntity.ok(stadiumService.deletStadiumById(stdmId));
}
	
}
