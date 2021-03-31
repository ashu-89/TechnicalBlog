package blog.service;

import blog.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    public ArrayList<Post> getAllPosts(){

        ArrayList<Post> posts = new ArrayList<>();

        Post p1 = new Post();

        p1.setTitle("Post 1 Title");
        p1.setBody("Post 1 Body");
        p1.setDate(new Date());

        Post p2 = new Post();
        p2.setTitle("Post 2 Title");
        p2.setBody("Post 2 Body");
        p2.setDate(new Date());

        posts.add(p1);
        posts.add(p2);

        return posts;

    }

    public ArrayList<Post> getLoggedInPosts() {

        ArrayList<Post> posts = new ArrayList<>();

        Post p1 = new Post();

        p1.setTitle("Logged In Blog Title");
        p1.setBody("This be premium post available only to registered users");
        p1.setDate(new Date());
        posts.add(p1);

        return posts;

    }
}
