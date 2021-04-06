package com.codeblog.service;

import com.codeblog.model.Post;
import java.util.List;

public interface CodeblogService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
