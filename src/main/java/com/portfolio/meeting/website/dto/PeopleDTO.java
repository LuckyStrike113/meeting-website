package com.portfolio.meeting.website.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class PeopleDto {

    private int id;

    private String name;

    private String gender;

    private LocalDate dateBirth;

    private List<HobbyDto> hobby;

    private CityDto city;

    private List<ImagesDto> images;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public List<HobbyDto> getHobby() {
        return hobby;
    }

    public void setHobby(List<HobbyDto> hobby) {
        this.hobby = hobby;
    }

    public CityDto getCity() {
        return city;
    }

    public void setCity(CityDto city) {
        this.city = city;
    }

    public List<ImagesDto> getImages() {
        return images;
    }

    public void setImages(List<ImagesDto> images) {
        this.images = images;
    }
}