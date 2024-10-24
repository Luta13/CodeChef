package com.sparta.codechef.domain.board.dto.response;

import com.sparta.codechef.common.enums.Framework;
import com.sparta.codechef.common.enums.Language;
import com.sparta.codechef.domain.comment.dto.CommentResponse;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
@Getter
@NoArgsConstructor
public class BoardDetailResponse {
    private Long id;
    private  Long userId;
    private  String title;
    private  String content;
    private String language;
    private Framework framework;

    private List<CommentResponse> commentResponseDtoList;

    public BoardDetailResponse(Long id,
                         Long userId,
                         String title,
                         String content,
                         String language,
                         Framework framework,
                         List<CommentResponse> commentResponseDtoList) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.language = language;
        this.framework = framework;
        this.commentResponseDtoList = commentResponseDtoList;
    }
}