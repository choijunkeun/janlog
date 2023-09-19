package blog.server;

import blog.server.dto.PostDto;
import blog.server.service.PostService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
@Rollback
class ServerApplicationTests {

	@Autowired
	PostService postService;

	@Test
	void createPost() {
		// given
		PostDto.CreateRequest request = new PostDto.CreateRequest();
		request.setTitle("게시글 제목");
		request.setContent("게시글 본문");

		PostDto.CreateRequest request2 = new PostDto.CreateRequest();
		request2.setTitle("게시글 제목");
		request2.setContent("게시글 본문");

		// when
		PostDto.CreateResponse result = postService.createPost(request);
		PostDto.CreateResponse result2 = postService.createPost(request2);

		Assertions.assertEquals(result.getId(), 1);
		Assertions.assertEquals(result2.getId(), 2);
		// then

	}


}
