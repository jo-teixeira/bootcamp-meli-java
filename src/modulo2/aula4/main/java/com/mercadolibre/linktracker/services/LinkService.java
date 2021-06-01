package com.mercadolibre.linktracker.services;

import com.mercadolibre.linktracker.models.Link;
import com.mercadolibre.linktracker.repositories.LinkRepository;
import com.mercadolibre.linktracker.requests.LinkRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkService {

    private LinkRepository linkRepository;
    private IdService idService;

    public LinkService(LinkRepository linkRepository, IdService idService) {
        this.linkRepository = linkRepository;
        this.idService = idService;
    }

    public Link createID(LinkRequest linkRequest){

        int id = idService.incrementId();

        Link link = new Link(id, linkRequest.getUrl(), 0);

        return linkRepository.save(link);
    }

    public Link redirect(int linkId) {
        Link link = linkRepository.findById(linkId);
        link.setCounter(link.getCounter() + 1);
        linkRepository.update(link);
        return link;
    }

    public Link getLink(int linkId){
        return linkRepository.findById(linkId);
    }

    public void deleteLink(int linkId) {
        linkRepository.deleteById(linkId);
    }
}
