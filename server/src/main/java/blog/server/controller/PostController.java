package blog.server.controller;


import blog.server.dto.PostDto;
import blog.server.entity.Post;
import blog.server.service.PostService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PostController {
    private final PostService postService;

    /**
     * 게시글 생성
     * */
    @PostMapping("/post")
    public ResponseEntity<PostDto.CreateResponse> createPost(@RequestBody @Valid PostDto.CreateRequest request) {
        PostDto.CreateResponse response = postService.createPost(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    /**
     * 게시글 리스트 조회
     * */
//    @GetMapping("/posts")
//    public Page<?> postList(@PageableDefault(size = 10) Pageable pageable) {
//        return
//    }

    /**
     * 게시글 조회
     * */


    /**
     * 게시글 수정
     * */

    /**
     * 게시글 삭제
     * */
}
