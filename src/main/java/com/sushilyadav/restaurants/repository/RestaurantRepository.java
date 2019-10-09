package com.sushilyadav.restaurants.repository;

import java.util.List;

import com.sushilyadav.restaurants.entity.Restaurant;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * RestaurantRepository
 */
@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant, String> {
	public Page<Restaurant> findAll(Pageable pageable);
	public Page<Restaurant> findByNameContainingIgnoreCase(String name, Pageable pageable);
	public Page<Restaurant> findByCuisinesContaining(List<String> cuisines, Pageable pageable);
	public Page<Restaurant> findByNameContainingIgnoreCaseAndCuisinesContaining(String name, List<String> cuisines, Pageable pageable);
}