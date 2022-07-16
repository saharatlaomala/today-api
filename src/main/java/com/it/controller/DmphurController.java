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

import com.it.dto.DmphurDto;
import com.it.service.DmphurService;


@RestController
@RequestMapping("/v1/Dmphur")
public class DmphurController {
	@Autowired
	private DmphurService dmphurService;
	private Integer disId;
	
	
	@GetMapping
	public ResponseEntity<Object> getDmphurAll() {
		return ResponseEntity.ok(dmphurService.findDmphurBydisId(disId));

}
	
	@GetMapping("/{disId}")
	public ResponseEntity<Object> getDmphurByDisId(@PathVariable(name = "disId")Integer disId) {
		return ResponseEntity.ok(dmphurService.findDmphurBydisId(disId));
	}
	
	@PostMapping
	public ResponseEntity<Object> saveDmphur(@RequestBody DmphurDto dmphurDto) {
		return ResponseEntity.ok(dmphurService.saveDmphur(dmphurDto));
	}
	@PutMapping("/{disId}")
	public ResponseEntity<Object> updateDmphur(
			@PathVariable(name = "disId") Integer disId,
			@RequestBody DmphurDto dmphurDto) {
		return ResponseEntity.ok(dmphurService.updateDmphur(disId, dmphurDto));
	}
	
	@DeleteMapping("/{disId}")
	public ResponseEntity<Object> deleteDmphurByDisId(@PathVariable(name = "disId") Integer disId){
	return ResponseEntity.ok(dmphurService.deleteDmphurByDisId(disId));
}


}
