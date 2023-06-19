package foodshopexdeadline.domain;

import foodshopexdeadline.DeadlineApplication;
import foodshopexdeadline.domain.DeadlineReached;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Deadline_table")
@Data
public class Deadline {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        DeadlineReached deadlineReached = new DeadlineReached(this);
        deadlineReached.publishAfterCommit();
    }

    public static DeadlineRepository repository() {
        DeadlineRepository deadlineRepository = DeadlineApplication.applicationContext.getBean(
            DeadlineRepository.class
        );
        return deadlineRepository;
    }

    public static void schedule(OderCreated oderCreated) {
        //implement business logic here:

        /** Example 1:  new item 
        Deadline deadline = new Deadline();
        repository().save(deadline);

        */

        /** Example 2:  finding and process
        
        repository().findById(oderCreated.get???()).ifPresent(deadline->{
            
            deadline // do something
            repository().save(deadline);


         });
        */

    }

    public static void delete(OrderPlaced orderPlaced) {
        //implement business logic here:

        /** Example 1:  new item 
        Deadline deadline = new Deadline();
        repository().save(deadline);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(deadline->{
            
            deadline // do something
            repository().save(deadline);


         });
        */

    }
}
