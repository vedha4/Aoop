package com.socialmedia.filter;

import java.util.List;
import java.util.stream.Collectors;

public class FeedFilter {
    public List<Post> filterPostsByKeyword(List<Post> posts, String keyword) {
        return posts.stream()
                .filter(post -> post.getContent().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Post> filterPostsByLikes(List<Post> posts, int minLikes) {
        return posts.stream()
                .filter(post -> post.getLikes() >= minLikes)
                .collect(Collectors.toList());
    }
}
