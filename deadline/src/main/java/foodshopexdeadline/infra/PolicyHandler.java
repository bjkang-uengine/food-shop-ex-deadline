package foodshopexdeadline.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import foodshopexdeadline.config.kafka.KafkaProcessor;
import foodshopexdeadline.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    DeadlineRepository deadlineRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OderCreated'"
    )
    public void wheneverOderCreated_Schedule(@Payload OderCreated oderCreated) {
        OderCreated event = oderCreated;
        System.out.println(
            "\n\n##### listener Schedule : " + oderCreated + "\n\n"
        );

        // Sample Logic //
        Deadline.schedule(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderPlaced'"
    )
    public void wheneverOrderPlaced_Delete(@Payload OrderPlaced orderPlaced) {
        OrderPlaced event = orderPlaced;
        System.out.println(
            "\n\n##### listener Delete : " + orderPlaced + "\n\n"
        );

        // Sample Logic //
        Deadline.delete(event);
    }
}
