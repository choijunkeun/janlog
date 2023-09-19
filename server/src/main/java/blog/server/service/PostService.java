package blog.server.service;


import blog.server.dto.PostDto;
import blog.server.entity.Post;
import blog.server.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    @Transactional
    public PostDto.CreateResponse createPost(PostDto.CreateRequest request) {
        Post savePost = postRepository.save(request.toEntity());
        return new PostDto.CreateResponse(savePost);


    }




}
