package INFPDiary.Diary.entity;

import lombok.*;
import net.bytebuddy.build.ToStringPlugin;

import javax.persistence.*;

@Entity
@Table(name= "tb1_memo")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Memo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;

    @Column(length = 200, nullable = false)
    private String id;

    @Column(length = 200, nullable = false)
    private String pw;

    @Column(length = 200, nullable = false)
    private String name;
}
