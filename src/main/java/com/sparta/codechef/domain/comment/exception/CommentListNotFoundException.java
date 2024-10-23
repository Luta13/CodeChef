package com.sparta.codechef.domain.comment.exception;


import com.sparta.codechef.common.BaseCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CommentListNotFoundException extends RuntimeException {
    private final BaseCode baseCode;
}
