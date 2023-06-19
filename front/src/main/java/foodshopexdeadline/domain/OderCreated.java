package foodshopexdeadline.domain;

import foodshopexdeadline.domain.*;
import foodshopexdeadline.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OderCreated extends AbstractEvent {

    private Long id;
    private String customerId;
    private String address;
    private String menuId;
    private String status;

    public OderCreated(Oeder aggregate) {
        super(aggregate);
    }

    public OderCreated() {
        super();
    }
}
