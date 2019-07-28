package com.back_end_travvler_spring.traveller_backend;

import org.springframework.data.annotation.Id;

public class Blog {

    @Id private String id;

    private String userName;
    private String country;
    private String city;
    private String blogPost;
    private String resteraunt;
    private String resterauntLink;
    private String hotel;
    private String hotelLink;
    private String attraction;
    private String attractionLink;

    public String getUserName() {
        return userName;
    }

    public String getAttractionLink() {
        return attractionLink;
    }

    public void setAttractionLink(String attractionLink) {
        this.attractionLink = attractionLink;
    }

    public String getHotelLink() {
        return hotelLink;
    }

    public void setHotelLink(String hotelLink) {
        this.hotelLink = hotelLink;
    }

    public String getResterauntLink() {
        return resterauntLink;
    }

    public void setResterauntLink(String resterauntLink) {
        this.resterauntLink = resterauntLink;
    }

    public String getAttraction() {
        return attraction;
    }

    public void setAttraction(String attraction) {
        this.attraction = attraction;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getResteraunt() {
        return resteraunt;
    }

    public void setResteraunt(String resteraunt) {
        this.resteraunt = resteraunt;
    }

    public String getBlogPost() {
        return blogPost;
    }

    public void setBlogPost(String blogPost) {
        this.blogPost = blogPost;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}