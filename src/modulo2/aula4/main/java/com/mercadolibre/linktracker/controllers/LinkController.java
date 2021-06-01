package com.mercadolibre.linktracker.controllers;

import com.mercadolibre.linktracker.models.Link;
import com.mercadolibre.linktracker.repositories.LinkRepository;
import com.mercadolibre.linktracker.requests.LinkRequest;
import com.mercadolibre.linktracker.services.LinkService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.net.URI;

@RestController
@RequestMapping("/link")
public class LinkController {

    private final LinkService linkService;

    public LinkController(LinkService linkService) {
        this.linkService = linkService;
    }

    @GetMapping("/{linkId}")
    public ResponseEntity redirectLink(@PathVariable int linkId){
        Link link = linkService.redirect(linkId);

        return ResponseEntity.status(HttpStatus.TEMPORARY_REDIRECT).location(URI.create(link.getUrl())).build();
    }

    @PostMapping
    public ResponseEntity createLink(@RequestBody LinkRequest linkRequest){

        Link link = linkService.createID(linkRequest);


        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(link.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping("/{linkId}")
    public ResponseEntity deleteLink(@PathVariable int linkId){
        linkService.deleteLink(linkId);

        return ResponseEntity.noContent().build();
    }


}
