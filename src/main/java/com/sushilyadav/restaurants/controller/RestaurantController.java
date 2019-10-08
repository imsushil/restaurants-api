package com.sushilyadav.restaurants.controller;

import java.util.List;

import com.sushilyadav.restaurants.entity.Restaurant;
import com.sushilyadav.restaurants.repository.RestaurantRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * restaurantController
 */
@RestController
public class RestaurantController {

	@Autowired
	private RestaurantRepository restaurantRepository;

	@CrossOrigin
	@RequestMapping(name="restaurants", method = RequestMethod.GET)
	public Page<Restaurant> getRestaurants(Pageable pageable) {
		return restaurantRepository.findAll(pageable);
	}

	/* @CrossOrigin
	@RequestMapping(name="restaurants", method = RequestMethod.GET, params = {"name"})
	public Page<Restaurant> getRestaurants(@RequestParam String name, Pageable pageable) {
		System.out.println("name=" + name);
		Page<Restaurant> list = restaurantRepository.findByNameContaining(name, pageable);
		System.out.println("list of restaurants--->");
		for(Restaurant res: list) {
			System.out.println(res);
		}
		return list;
	}

	@CrossOrigin
	@RequestMapping(name="restaurants", method = RequestMethod.GET, params = {"cuisines"})
	public Page<Restaurant> getRestaurants(@RequestParam List<String> cuisines, Pageable pageable) {
		return restaurantRepository.findByCuisinesContaining(cuisines, pageable);
	} */

	@CrossOrigin
	@RequestMapping(name="restaurants", method = RequestMethod.GET, params = {"name", "cuisines"})
	public Page<Restaurant> getRestaurants(@RequestParam String name, @RequestParam List<String> cuisines, Pageable pageable) {
		System.out.println("Name=" + name);
		return restaurantRepository.findByNameContainingIgnoreCaseAndCuisinesContaining(name, cuisines, pageable);
	}
}