package com.byamada.strategies.controller;

import com.byamada.strategies.service.TransportService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class TransportController {

    private final TransportService service;

    @GetMapping("/transport")
    public ResponseEntity<Void> constructTransport() {
        service.execute();
        return ResponseEntity.noContent().build();
    }

}
