package com.socialmedia.filter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("Alice", "Loving the new park!", 5));
        posts.add(new Post("Bob", "Java streams are cool!", 10));
        posts.add(new Post("Charlie", "Had a great day at the beach!", 3));
        posts.add(new Post("Alice", "Java is the best programming language!", 12));

        FeedFilter filter = new FeedFilter();

        // Filter by keyword
        List<Post> filteredByKeyword = filter.filterPostsByKeyword(posts, "Java");
        System.out.println("Posts containing 'Java':");
        filteredByKeyword.forEach(System.out::println);

        // Filter by likes
        List<Post> filteredByLikes = filter.filterPostsByLikes(posts, 5);
        System.out.println("\nPosts with at least 5 likes:");
        filteredByLikes.forEach(System.out::println);
    }
}
