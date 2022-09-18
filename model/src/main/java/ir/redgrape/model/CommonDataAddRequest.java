package ir.redgrape.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonDataAddRequest {
    private long fixID;
    private String tag;
    private String caption;
}
