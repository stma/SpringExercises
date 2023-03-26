package com.progmatic.springexercises.mvc;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;


record Name(String ln, String fn){};

@Controller
public class QueryString {


    // http://localhost:8080/params/brp?ln=Jal&fn=Ma
    // kérésből kigyüjti az ln és fn paramétereket
    @GetMapping("/params/brp")
    public ResponseEntity<String> getByRequestParam(
        @RequestParam("ln") String lastName,
        @RequestParam("fn") String firstName
    ) {
        System.out.println("**** " + firstName + " " + lastName);
        return ResponseEntity.ok().body(firstName + " " + lastName);
    }

    // http://localhost:8080/params/bma?ln=Jal&fn=Ma
    // kérésből kigyüjti az ln és fn paramétereket
    @GetMapping("/params/bma")
    public ResponseEntity<String> getByModelAttribute(
            @ModelAttribute Name name
    ) {
        System.out.println("**** " + name);
        return ResponseEntity.ok().body(name.toString());
    }

    // http://localhost:8080/params/pure?ln=Jal&fn=Ma
    // kérésből kigyüjti az ln és fn paramétereket
    @GetMapping("/params/pure")
    public ResponseEntity<String> getByPure(
            Name name
    ) {
        System.out.println("**** " + name);
        return ResponseEntity.ok().body(name.toString());
    }
}
