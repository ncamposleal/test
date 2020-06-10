package com.test.demo;

import org.springframework.web.bind.annotation.RestController;

import com.test.demo.input.InputDTO;
import com.test.demo.output.Wrapper;
import com.test.demo.service.IBackOfficeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloController {

   @Autowired
   private IBackOfficeService boService;

   @RequestMapping(value = "/test", method = RequestMethod.POST)
   public ResponseEntity<Wrapper> index(@RequestBody InputDTO inputDto) {

      try {
         return ResponseEntity.ok(boService.getFarmanet(inputDto));
      } catch (Exception ex) {
         Wrapper a = new Wrapper(false, null, new Error(ex), "Error General: "+ex.getMessage());
         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(a);
      }
   }
}