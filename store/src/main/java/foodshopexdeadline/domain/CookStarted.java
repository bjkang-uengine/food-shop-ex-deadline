package foodshopexdeadline.domain;

import foodshopexdeadline.domain.*;
import foodshopexdeadline.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookStarted extends AbstractEvent {

    private Long id;

    public CookStarted(StoreOrder aggregate) {
        super(aggregate);
    }

    public CookStarted() {
        super();
    }
}
