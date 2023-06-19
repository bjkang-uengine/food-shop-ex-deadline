package foodshopexdeadline.domain;

import foodshopexdeadline.domain.*;
import foodshopexdeadline.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryFailed extends AbstractEvent {

    private Long id;

    public DeliveryFailed(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryFailed() {
        super();
    }
}
