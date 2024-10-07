package com.socialmedia.filter;

public class Post {
    private String user;
    private String content;
    private int likes;

    public Post(String user, String content, int likes) {
        this.user = user;
        this.content = content;
        this.likes = likes;
    }

    public String getUser() {
        return user;
    }

    public String getContent() {
        return content;
    }

    public int getLikes() {
        return likes;
    }

    @Override
    public String toString() {
        return "Post{" +
                "user='" + user + '\'' +
                ", content='" + content + '\'' +
                ", likes=" + likes +
                '}';
    }
}
