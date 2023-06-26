package com.sikshya.joblisting.repository;

import com.sikshya.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
