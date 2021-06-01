package com.mercadolibre.linktracker.controllers;

import com.mercadolibre.linktracker.models.Link;
import com.mercadolibre.linktracker.services.LinkService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metrics")
public class MetricsController {

    private LinkService linkService;

    public MetricsController(LinkService linkService) {
        this.linkService = linkService;
    }

    @GetMapping("/{linkID}")
    public ResponseEntity<Link> getMetrics(@PathVariable int linkID){
        return ResponseEntity.ok(linkService.getLink(linkID));
    }
}
