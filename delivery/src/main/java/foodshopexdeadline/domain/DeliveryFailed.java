package foodshopexdeadline.domain;

import foodshopexdeadline.domain.*;
import foodshopexdeadline.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryFailed extends AbstractEvent {

    private Long id;
    private String customerId;
    private String address;
    private String status;

    public DeliveryFailed(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryFailed() {
        super();
    }
}
