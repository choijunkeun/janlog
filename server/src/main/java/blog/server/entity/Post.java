package blog.server.entity;


import blog.server.enums.PostEnum;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Post {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long id;

    private String title;
    private String content;

    @Enumerated(EnumType.STRING)
    private PostEnum status;

//    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
//    private List<Attachment> attachedFiles = new ArrayList<>();

    @Builder
    public Post(String title, String content, PostEnum status) {
        this.title = title;
        this.content = content;
        this.status = status;
    }


}
