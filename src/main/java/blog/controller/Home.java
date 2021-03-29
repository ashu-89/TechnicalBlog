package blog.controller;

import blog.model.Post;
import blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    PostService postService;

    @RequestMapping("/")
    public String display(Model model){

        List<Post> posts = postService.getAllPosts();
        model.addAttribute("posts",posts);
        return "index";
    }
}
