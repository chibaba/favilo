package com.nedstack.favilo.repository;

import com.nedstack.favilo.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
