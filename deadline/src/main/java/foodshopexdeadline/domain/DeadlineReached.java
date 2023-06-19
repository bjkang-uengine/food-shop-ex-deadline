package foodshopexdeadline.domain;

import foodshopexdeadline.domain.*;
import foodshopexdeadline.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeadlineReached extends AbstractEvent {

    private Long id;

    public DeadlineReached(Deadline aggregate) {
        super(aggregate);
    }

    public DeadlineReached() {
        super();
    }
}
