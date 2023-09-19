package blog.server.entity;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Attachment {

    @Id @GeneratedValue
    @Column(name = "attachment_id")
    private Long id;
    private String originFilename;
    private String filename;
    private String filePath;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "post_id")
//    private Post post;
}
