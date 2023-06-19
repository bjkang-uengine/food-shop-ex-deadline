package foodshopexdeadline.domain;

import foodshopexdeadline.domain.*;
import foodshopexdeadline.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StockDecreasFailed extends AbstractEvent {

    private Long id;

    public StockDecreasFailed(Menu aggregate) {
        super(aggregate);
    }

    public StockDecreasFailed() {
        super();
    }
}