package com.codeblog.service.serviceImpl;

import com.codeblog.model.Post;
import com.codeblog.repository.CodeblogRepository;
import com.codeblog.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeblogServiceImpl implements CodeblogService {

    @Autowired
    CodeblogRepository codeblogRepository;

    @Override
    public List<Post> findAll() {
        return codeblogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return codeblogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return codeblogRepository.save(post);
    }
}
