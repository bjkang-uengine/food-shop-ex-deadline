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
    OederRepository oederRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeliveryStarted'"
    )
    public void wheneverDeliveryStarted_UpdateStatus(
        @Payload DeliveryStarted deliveryStarted
    ) {
        DeliveryStarted event = deliveryStarted;
        System.out.println(
            "\n\n##### listener UpdateStatus : " + deliveryStarted + "\n\n"
        );

        // Sample Logic //
        Oeder.updateStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Accepted'"
    )
    public void wheneverAccepted_UpdateStatus(@Payload Accepted accepted) {
        Accepted event = accepted;
        System.out.println(
            "\n\n##### listener UpdateStatus : " + accepted + "\n\n"
        );

        // Sample Logic //
        Oeder.updateStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CookFinished'"
    )
    public void wheneverCookFinished_UpdateStatus(
        @Payload CookFinished cookFinished
    ) {
        CookFinished event = cookFinished;
        System.out.println(
            "\n\n##### listener UpdateStatus : " + cookFinished + "\n\n"
        );

        // Sample Logic //
        Oeder.updateStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Rejected'"
    )
    public void wheneverRejected_OrderReject(@Payload Rejected rejected) {
        Rejected event = rejected;
        System.out.println(
            "\n\n##### listener OrderReject : " + rejected + "\n\n"
        );

        // Sample Logic //
        Oeder.orderReject(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeadlineReached'"
    )
    public void wheneverDeadlineReached_OrderReject(
        @Payload DeadlineReached deadlineReached
    ) {
        DeadlineReached event = deadlineReached;
        System.out.println(
            "\n\n##### listener OrderReject : " + deadlineReached + "\n\n"
        );

        // Sample Logic //
        Oeder.orderReject(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeliveryFailed'"
    )
    public void wheneverDeliveryFailed_OrderReject(
        @Payload DeliveryFailed deliveryFailed
    ) {
        DeliveryFailed event = deliveryFailed;
        System.out.println(
            "\n\n##### listener OrderReject : " + deliveryFailed + "\n\n"
        );

        // Sample Logic //
        Oeder.orderReject(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='StockDecreasFailed'"
    )
    public void wheneverStockDecreasFailed_OrderReject(
        @Payload StockDecreasFailed stockDecreasFailed
    ) {
        StockDecreasFailed event = stockDecreasFailed;
        System.out.println(
            "\n\n##### listener OrderReject : " + stockDecreasFailed + "\n\n"
        );

        // Sample Logic //
        Oeder.orderReject(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeliveryCompleted'"
    )
    public void wheneverDeliveryCompleted_Approve(
        @Payload DeliveryCompleted deliveryCompleted
    ) {
        DeliveryCompleted event = deliveryCompleted;
        System.out.println(
            "\n\n##### listener Approve : " + deliveryCompleted + "\n\n"
        );

        // Sample Logic //
        Oeder.approve(event);
    }
}
