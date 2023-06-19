package foodshopexdeadline.domain;

import foodshopexdeadline.OrderApplication;
import foodshopexdeadline.domain.OderCreated;
import foodshopexdeadline.domain.OrderCancelled;
import foodshopexdeadline.domain.OrderPlaced;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Oeder_table")
@Data
public class Oeder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String customerId;

    private String address;

    private String menuId;

    private String status;

    private Integer qty;

    @PostPersist
    public void onPostPersist() {
        OderCreated oderCreated = new OderCreated(this);
        oderCreated.publishAfterCommit();

        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();
    }

    @PreRemove
    public void onPreRemove() {
        OrderCancelled orderCancelled = new OrderCancelled(this);
        orderCancelled.publishAfterCommit();
    }

    public static OederRepository repository() {
        OederRepository oederRepository = OrderApplication.applicationContext.getBean(
            OederRepository.class
        );
        return oederRepository;
    }

    public static void updateStatus(DeliveryStarted deliveryStarted) {
        //implement business logic here:

        /** Example 1:  new item 
        Oeder oeder = new Oeder();
        repository().save(oeder);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryStarted.get???()).ifPresent(oeder->{
            
            oeder // do something
            repository().save(oeder);


         });
        */

    }

    public static void updateStatus(Accepted accepted) {
        //implement business logic here:

        /** Example 1:  new item 
        Oeder oeder = new Oeder();
        repository().save(oeder);

        */

        /** Example 2:  finding and process
        
        repository().findById(accepted.get???()).ifPresent(oeder->{
            
            oeder // do something
            repository().save(oeder);


         });
        */

    }

    public static void updateStatus(CookFinished cookFinished) {
        //implement business logic here:

        /** Example 1:  new item 
        Oeder oeder = new Oeder();
        repository().save(oeder);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookFinished.get???()).ifPresent(oeder->{
            
            oeder // do something
            repository().save(oeder);


         });
        */

    }

    public static void orderReject(Rejected rejected) {
        //implement business logic here:

        /** Example 1:  new item 
        Oeder oeder = new Oeder();
        repository().save(oeder);

        OrderCancelled orderCancelled = new OrderCancelled(oeder);
        orderCancelled.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(rejected.get???()).ifPresent(oeder->{
            
            oeder // do something
            repository().save(oeder);

            OrderCancelled orderCancelled = new OrderCancelled(oeder);
            orderCancelled.publishAfterCommit();

         });
        */

    }

    public static void orderReject(DeadlineReached deadlineReached) {
        //implement business logic here:

        /** Example 1:  new item 
        Oeder oeder = new Oeder();
        repository().save(oeder);

        OrderCancelled orderCancelled = new OrderCancelled(oeder);
        orderCancelled.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(deadlineReached.get???()).ifPresent(oeder->{
            
            oeder // do something
            repository().save(oeder);

            OrderCancelled orderCancelled = new OrderCancelled(oeder);
            orderCancelled.publishAfterCommit();

         });
        */

    }

    public static void orderReject(DeliveryFailed deliveryFailed) {
        //implement business logic here:

        /** Example 1:  new item 
        Oeder oeder = new Oeder();
        repository().save(oeder);

        OrderCancelled orderCancelled = new OrderCancelled(oeder);
        orderCancelled.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryFailed.get???()).ifPresent(oeder->{
            
            oeder // do something
            repository().save(oeder);

            OrderCancelled orderCancelled = new OrderCancelled(oeder);
            orderCancelled.publishAfterCommit();

         });
        */

    }

    public static void approve(DeliveryCompleted deliveryCompleted) {
        //implement business logic here:

        /** Example 1:  new item 
        Oeder oeder = new Oeder();
        repository().save(oeder);

        OrderPlaced orderPlaced = new OrderPlaced(oeder);
        orderPlaced.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCompleted.get???()).ifPresent(oeder->{
            
            oeder // do something
            repository().save(oeder);

            OrderPlaced orderPlaced = new OrderPlaced(oeder);
            orderPlaced.publishAfterCommit();

         });
        */

    }
}
