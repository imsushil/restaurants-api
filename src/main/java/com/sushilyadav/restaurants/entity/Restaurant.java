package com.sushilyadav.restaurants.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Restaurant
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@Document(collection="restaurants")
public class Restaurant {
	@Id
	private String id;
	private String name;
	private String city;
	private List<String> cuisines;
	private Integer ranking;
	private Double rating;
	private Integer noOfReviews;

	/* public Restaurant() {}

	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getCity() {
		return this.city;
	}
	public List<String> getCuisines() {
		return this.cuisines;
	}
	public int getRanking() {
		return this.ranking;
	}
	public double getRating() {
		return this.rating;
	}
	public int getNoOfReviews() {
		return this.noOfReviews;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setCuisines(List<String> cuisines) {
		this.cuisines = cuisines;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public void setNoOfReviews(int noOfReviews) {
		this.noOfReviews = noOfReviews;
	} */
}