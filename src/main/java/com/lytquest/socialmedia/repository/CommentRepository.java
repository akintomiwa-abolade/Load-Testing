package com.lytquest.socialmedia.repository;

import com.lytquest.socialmedia.dto.CommentResponse;
import com.lytquest.socialmedia.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPostId(Long id);
}
