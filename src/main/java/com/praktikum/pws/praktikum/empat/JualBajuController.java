/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikum.pws.praktikum.empat;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

/**
 *
 * @author SWMahardhika
 */
@CrossOrigin
@RestController
@RequestMapping("/bajudata")
public class JualBajuController {

    @Autowired
    private BajuRepo JualBaju;

    @GetMapping("/jualbaju")
    public List<JualBaju> getAllJualBaju() {
        return JualBaju.findAll();
    }

    @GetMapping("/jualbaju/{id_baju}")
    public JualBaju getErialbById(@PathVariable String id_baju) {
        return JualBaju.findById(id_baju).get();
    }

    @PostMapping("/jualbaju")
    public JualBaju saveJualBajuDetails(@RequestBody JualBaju j) {
        return JualBaju.save(j);
    }

    @PutMapping("/jualbaju")
    public JualBaju updateJualBaju(@RequestBody JualBaju j) {
        return JualBaju.save(j);
    }

    @DeleteMapping("/jualbaju/{id_baju}")
    public ResponseEntity<HttpStatus> deleteJualBajuById(@PathVariable String idproduct) {
        JualBaju.deleteById(idproduct);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

