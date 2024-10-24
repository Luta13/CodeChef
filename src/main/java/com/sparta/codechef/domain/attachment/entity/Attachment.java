package com.sparta.codechef.domain.attachment.entity;

import com.sparta.codechef.common.ErrorStatus;
import com.sparta.codechef.common.exception.ApiException;
import com.sparta.codechef.domain.board.entity.Board;
import com.sparta.codechef.domain.chat.entity.ChatRoom;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Entity
@NoArgsConstructor
@Builder(builderClassName = "AttachmentBuilder")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String s3Url;
    private String s3Key;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id", nullable = false)
    private Board board;

    public static class AttachmentBuilder {
        public AttachmentBuilder id(Long id) {
            throw new ApiException(ErrorStatus.ID_CANNOT_BE_SET);
        }
    }
}
