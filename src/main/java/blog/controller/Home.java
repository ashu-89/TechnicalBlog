package blog.controller;

import blog.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
//@ResponseBody
public class Home {

    @RequestMapping("/")
    public String display(Model model){

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

        model.addAttribute("posts",posts);


        return "index";
    }
}
