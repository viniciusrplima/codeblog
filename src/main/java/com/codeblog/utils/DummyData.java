package com.codeblog.utils;

import com.codeblog.model.Post;
import com.codeblog.repository.CodeblogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    CodeblogRepository codeblogRepository;

    //@PostConstruct
    public void savePosts() {
        List<Post> postList = new ArrayList<>();

        Post post1 = new Post();
        post1.setAuthor("Vinicius Rodrigues");
        post1.setDate(LocalDate.now());
        post1.setTitle("C++");
        post1.setText("Lorem ipsum dolem sit amet Lorem ipsum dolem sit amet Lorem ipsum dolem sit amet Lorem ipsum dolem sit amet");

        Post post2 = new Post();
        post2.setAuthor("Jimmy Chapman");
        post2.setDate(LocalDate.now());
        post2.setTitle("Java");
        post2.setText("Lorem ipsum dolem sit amet Lorem ipsum dolem sit amet Lorem ipsum dolem sit amet Lorem ipsum dolem sit amet");

        postList.add(post1);
        postList.add(post2);

        for (Post post : postList) {
            Post postSaved = codeblogRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}
