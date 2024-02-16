package com.lcwd.rating.service;

import java.util.List;

import com.lcwd.rating.entities.Rating;


public interface RatingService {

	Rating create(Rating rating );
	List<Rating> getAllRatings();
	List<Rating> getRatingByUserId(String userId);
	List<Rating> getRatingByhotelId(String hotelId);
	
	
	
}
