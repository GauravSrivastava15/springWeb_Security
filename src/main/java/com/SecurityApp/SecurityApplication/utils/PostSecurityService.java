package com.SecurityApp.SecurityApplication.utils;

import com.SecurityApp.SecurityApplication.dto.PostDTO;
import com.SecurityApp.SecurityApplication.entity.User;
import com.SecurityApp.SecurityApplication.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostSecurityService {
    private final PostService postService;

    public boolean isOwnerOfPost(Long postId){
        PostDTO post = postService.getPostById(postId);
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return post.getAuthor().getId().equals(user.getId());
    }
}
