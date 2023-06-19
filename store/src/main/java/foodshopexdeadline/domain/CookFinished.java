package foodshopexdeadline.domain;

import foodshopexdeadline.domain.*;
import foodshopexdeadline.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookFinished extends AbstractEvent {

    private String orderId;
    private String menuId;
    private String customerId;
    private String adress;
    private String status;
    private Integer qty;

    public CookFinished(StoreOrder aggregate) {
        super(aggregate);
    }

    public CookFinished() {
        super();
    }
}
