package com.springsecurity.services;


import com.springsecurity.dto.PostDto;

import java.util.List;


public interface PostService  {
    List<PostDto> getAllPosts();

    PostDto createNewPost(PostDto inputPosts);

    PostDto getPostById(Long postId);

    PostDto updatePost(PostDto inputPost, Long postId);
}
