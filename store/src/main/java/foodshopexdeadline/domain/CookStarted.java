package foodshopexdeadline.domain;

import foodshopexdeadline.domain.*;
import foodshopexdeadline.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookStarted extends AbstractEvent {

    private Long id;
    private String oderId;
    private String menuId;
    private String customerId;
    private String adress;
    private String status;

    public CookStarted(StoreOrder aggregate) {
        super(aggregate);
    }

    public CookStarted() {
        super();
    }
}
