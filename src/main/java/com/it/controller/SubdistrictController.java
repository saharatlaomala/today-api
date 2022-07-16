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

import com.it.dto.SubdistrictDto;
import com.it.service.SubdistrictService;


@RestController
@RequestMapping("/v1/Subdistrict")
public class SubdistrictController {
	@Autowired
	private SubdistrictService subdistrictService;
	private Integer sdtId;
	
	
	@GetMapping
	public ResponseEntity<Object> getSubdistrictAll() {
		return ResponseEntity.ok(subdistrictService.findSubdistrictBySdtId(sdtId));

}
	
	@GetMapping("/{sdtId}")
	public ResponseEntity<Object> getSubdistrictBySdtId(@PathVariable(name = "sdtId")Integer sdtId) {
		return ResponseEntity.ok(subdistrictService.findSubdistrictBySdtId(sdtId));
	}
	
	@PostMapping
	public ResponseEntity<Object> saveSubdistrict(@RequestBody SubdistrictDto subdistrictDto) {
		return ResponseEntity.ok(subdistrictService.saveSubdistrict(subdistrictDto));
	}
	@PutMapping("/{sdtId}")
	public ResponseEntity<Object> Subdistrict(
			@PathVariable(name = "sdtId") Integer sdtId,
			@RequestBody SubdistrictDto subdistrictDto) {
		return ResponseEntity.ok(subdistrictService.updateSubdistrict(sdtId, subdistrictDto));
	}
	
	@DeleteMapping("/{sdtId}")
	public ResponseEntity<Object> deleteSubdistrictBySdtId(@PathVariable(name = "sdtId") Integer sdtId){
	return ResponseEntity.ok(subdistrictService.deleteSubdistrictBySdtId(sdtId));
}

}
