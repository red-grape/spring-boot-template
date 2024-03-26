package ir.redgrape.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "CommonDatas")
@Getter
@Setter
public class CommonDataEntitiy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private long fixID;

    @Column(nullable = false , columnDefinition = "nvarchar(50)")
    private String tag;

    @Column(nullable = false , columnDefinition = "nvarchar(100)")
    private String caption;
}
