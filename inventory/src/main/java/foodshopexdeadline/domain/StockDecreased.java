package foodshopexdeadline.domain;

import foodshopexdeadline.domain.*;
import foodshopexdeadline.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StockDecreased extends AbstractEvent {

    private Long id;

    public StockDecreased(Menu aggregate) {
        super(aggregate);
    }

    public StockDecreased() {
        super();
    }
}
