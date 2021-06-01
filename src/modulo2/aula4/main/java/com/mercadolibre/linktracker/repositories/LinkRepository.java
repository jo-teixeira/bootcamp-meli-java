package com.mercadolibre.linktracker.repositories;

import com.mercadolibre.linktracker.exceptions.LinkNotFoundException;
import com.mercadolibre.linktracker.models.Link;
import com.mercadolibre.linktracker.utils.Json;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class LinkRepository {
    private List<Link> findAll(){
        return Json.read(Link.class, "links.json");
    }

    private void setAll(List<Link> linkList){ Json.write(linkList, "links.json");}

    public Link save(Link link){
        List<Link> linkList = findAll();
        linkList.add(link);
        setAll(linkList);
        return link;
    }

    public Link findById(int linkId) {
        List<Link> linkList = findAll();
        return linkList.stream()
                        .filter(link -> link.getId() == linkId)
                        .findFirst()
                        .orElseThrow(() -> new LinkNotFoundException("Link não encontrado."));
    }


    public void update(Link link) {
        List<Link> linkList = findAll();

        setAll(linkList.stream().map(linkR -> link.getId() == linkR.getId() ? link : linkR).collect(Collectors.toList()));
    }


    public void deleteById(int linkId) {
        List<Link> linkList = findAll();
        int lengthList = linkList.size();

        linkList = linkList.stream().filter(link -> link.getId() != linkId).collect(Collectors.toList());

        if (linkList.size() == lengthList){
            throw new LinkNotFoundException("Link não encontrado.");
        }

        setAll(linkList);
    }
}
