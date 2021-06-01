package com.mercadolibre.linktracker.models;

public class Link {
    private int id;
    private String url;
    private int counter;

    public Link() {
    }

    public Link(int id, String url, int counter) {
        this.id = id;
        this.url = url;
        this.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
