package com.example.reviewsite.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository() {
        Review review = new Review(1L,"Title","Image","Category","Content");

        reviewList.put(review.getId(), review);
    }

    public Collection<Review> findAll() {

        return reviewList.values();
    }

    public Review findOne(long id) {

        return reviewList.get(id);
    }


}
