package blog.service;

import blog.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    public List<Post> getAllPosts(){

        List<Post> posts = new ArrayList<>();

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
}
