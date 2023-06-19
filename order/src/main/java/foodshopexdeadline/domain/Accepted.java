package foodshopexdeadline.domain;

import foodshopexdeadline.domain.*;
import foodshopexdeadline.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Accepted extends AbstractEvent {

    private String orderId;
    private String oderId;
    private String menuId;
    private String customerId;
    private String adress;
    private String status;
    private Integer qty;
}
