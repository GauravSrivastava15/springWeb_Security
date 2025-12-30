package com.SecurityApp.SecurityApplication.services;

import com.SecurityApp.SecurityApplication.dto.PostDTO;

import java.util.List;


public interface PostService {
    List<PostDTO> getAllPosts();

    PostDTO createNewPost(PostDTO postDTO);

    PostDTO getPostById(Long postId);

    PostDTO updatePost(PostDTO postDTO, Long postId);
}
