package foodshopexdeadline.domain;

import foodshopexdeadline.domain.*;
import foodshopexdeadline.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Rejected extends AbstractEvent {

    private Long id;
    private String oderId;
    private String menuId;
    private String customerId;
    private String adress;
    private String status;

    public Rejected(StoreOrder aggregate) {
        super(aggregate);
    }

    public Rejected() {
        super();
    }
}
