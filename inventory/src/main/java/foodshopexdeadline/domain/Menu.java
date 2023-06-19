package foodshopexdeadline.domain;

import foodshopexdeadline.InventoryApplication;
import foodshopexdeadline.domain.StockDecreasFailed;
import foodshopexdeadline.domain.StockDecreased;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Menu_table")
@Data
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String menuName;

    private Integer stock;

    @PostPersist
    public void onPostPersist() {
        StockDecreased stockDecreased = new StockDecreased(this);
        stockDecreased.publishAfterCommit();

        StockDecreasFailed stockDecreasFailed = new StockDecreasFailed(this);
        stockDecreasFailed.publishAfterCommit();
    }

    public static MenuRepository repository() {
        MenuRepository menuRepository = InventoryApplication.applicationContext.getBean(
            MenuRepository.class
        );
        return menuRepository;
    }

    public static void stockDecrease(Accepted accepted) {
        //implement business logic here:

        /** Example 1:  new item 
        Menu menu = new Menu();
        repository().save(menu);

        */

        /** Example 2:  finding and process
        
        repository().findById(accepted.get???()).ifPresent(menu->{
            
            menu // do something
            repository().save(menu);


         });
        */

    }

    public static void stockIncrease(OrderCancelled orderCancelled) {
        //implement business logic here:

        /** Example 1:  new item 
        Menu menu = new Menu();
        repository().save(menu);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCancelled.get???()).ifPresent(menu->{
            
            menu // do something
            repository().save(menu);


         });
        */

    }
}
