package foodshopexdeadline.domain;

import foodshopexdeadline.StoreApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "StoreOrder_table")
@Data
public class StoreOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String orderId;

    private String menuId;

    private String customerId;

    private String adress;

    private String status;

    private Integer qty;

    @PostPersist
    public void onPostPersist() {}

    public static StoreOrderRepository repository() {
        StoreOrderRepository storeOrderRepository = StoreApplication.applicationContext.getBean(
            StoreOrderRepository.class
        );
        return storeOrderRepository;
    }

    public void accept() {
        //implement business logic here:

        Accepted accepted = new Accepted(this);
        accepted.publishAfterCommit();
    }

    public void reject() {
        //implement business logic here:

        Rejected rejected = new Rejected(this);
        rejected.publishAfterCommit();
    }

    public void startCook() {
        //implement business logic here:

        CookStarted cookStarted = new CookStarted(this);
        cookStarted.publishAfterCommit();
    }

    public void finishCook() {
        //implement business logic here:

        CookFinished cookFinished = new CookFinished(this);
        cookFinished.publishAfterCommit();
    }

    public static void addOrderList(OderCreated oderCreated) {
        //implement business logic here:

        /** Example 1:  new item 
        StoreOrder storeOrder = new StoreOrder();
        repository().save(storeOrder);

        Accepted accepted = new Accepted(storeOrder);
        accepted.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(oderCreated.get???()).ifPresent(storeOrder->{
            
            storeOrder // do something
            repository().save(storeOrder);

            Accepted accepted = new Accepted(storeOrder);
            accepted.publishAfterCommit();

         });
        */

    }

    public static void orderCancel(OrderCancelled orderCancelled) {
        //implement business logic here:

        /** Example 1:  new item 
        StoreOrder storeOrder = new StoreOrder();
        repository().save(storeOrder);

        Rejected rejected = new Rejected(storeOrder);
        rejected.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(orderCancelled.get???()).ifPresent(storeOrder->{
            
            storeOrder // do something
            repository().save(storeOrder);

            Rejected rejected = new Rejected(storeOrder);
            rejected.publishAfterCommit();

         });
        */

    }
}
