package foodshopexdeadline.domain;

import foodshopexdeadline.domain.*;
import foodshopexdeadline.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StockDecreased extends AbstractEvent {

    private Long id;
    private String menuName;
    private Integer stock;
    private String orderId;

    public StockDecreased(Menu aggregate) {
        super(aggregate);
    }

    public StockDecreased() {
        super();
    }
}
