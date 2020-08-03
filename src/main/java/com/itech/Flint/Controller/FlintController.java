/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.Flint.Controller;

import com.itech.Flint.Model.Flint;
import com.itech.Flint.Util.MessageUtil;
import com.itech.Flint.Service.ApiResponse;
import com.itech.Flint.Service.FlintService;
import com.itech.Flint.exception.RecordNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author Nandom Gusen
 */
@RestController
public class FlintController {

    @Autowired
    private FlintService flintService;

    @GetMapping(value = "/flints")
    public List<Flint> getUsers(){
      List<Flint> list= flintService.getFlintRepo().findAll();
      return list;
    }

// Save Flints
    @PostMapping("/addFlints")
    public ResponseEntity<?> createFlint(@RequestBody Flint flint) {
        Flint savedObject=flintService.getFlintRepo().save(flint);
        return ResponseEntity.ok(new ApiResponse(MessageUtil.Response, MessageUtil.Saved, savedObject ));

    }



    @DeleteMapping("/deleteFlint/{id}")
    public ResponseEntity deleteFlintById(@PathVariable("id") Long id) {
        return flintService.getFlintRepo().findById(id).map(record -> {
            flintService.getFlintRepo().deleteById(id);
            return ResponseEntity.ok(new ApiResponse<>(MessageUtil.Deleted, MessageUtil.Deleted));
        }).orElseThrow(() -> new RecordNotFoundException("Record Not Found for: " + id));
    }

//    @DeleteMapping("/deleteFlint/{id}")
//    public void delete(@PathVariable Long id) {
//        flintService.getFlintRepo().deleteById(id);
//    }
}
