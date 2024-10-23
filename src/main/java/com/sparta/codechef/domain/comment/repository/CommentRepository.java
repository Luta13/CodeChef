package com.sparta.codechef.domain.comment.repository;

import com.sparta.codechef.domain.comment.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>, CommentQueryDslRepository {

    Optional<Comment> findByUserIdAndBoardId(Long userId, Long boardId);
    @Query("SELECT c FROM Comment c WHERE c.id = :commentId AND c.user.id = :userId AND c.board.id = :boardId")
    Optional<Comment> findByCommentIdAndUserIdAndBoardId(@Param("commentId") Long commentId,
                                                         @Param("userId") Long userId,
                                                         @Param("boardId") Long boardId);
    Optional<Comment> findByIdAndUserIdAndBoardId(Long id,Long userId, Long boardId);

    Optional<List<Comment>> findAllByUserId(Long userId);
}
