package blog.server.dto;


import blog.server.entity.Post;
import blog.server.enums.PostEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

public class PostDto {

    @Data
    public static class CreateRequest {
        private String title;
        private String content;
        private PostEnum status = PostEnum.EXIST;

        public Post toEntity() {
            return Post.builder()
                    .title(title)
                    .content(content)
                    .status(status)
                    .build();
        }
    }

    @Data
    public static class CreateResponse {
        private Long id;

        public CreateResponse(Post post) {
            this.id = post.getId();
        }
    }

    @Data
    public static class updateRequest {

    }

    @Data
    public static class updateStatusRequest {

    }
}
