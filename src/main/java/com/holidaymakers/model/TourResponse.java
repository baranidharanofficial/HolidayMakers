package com.holidaymakers.model;

import java.util.List;

public class TourResponse {

    private Long id;
    private String name;
    private String details;
    private Integer no_of_days;
    private String places;
    private Double price;
    private List<ImageDownResponse> image;

    public TourResponse() {
    }

    public TourResponse(Long id, String name, String details, Integer no_of_days, String places, Double price,
            List<ImageDownResponse> image) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.no_of_days = no_of_days;
        this.places = places;
        this.price = price;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getNo_of_days() {
        return no_of_days;
    }

    public void setNo_of_days(Integer no_of_days) {
        this.no_of_days = no_of_days;
    }

    public String getPlaces() {
        return places;
    }

    public void setPlaces(String places) {
        this.places = places;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<ImageDownResponse> getImage() {
        return image;
    }

    public void setImage(List<ImageDownResponse> image) {
        this.image = image;
    }

    
    
    
}
