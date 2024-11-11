package fishdistributionerpsystem.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import fishdistributionerpsystem.config.kafka.KafkaProcessor;
import fishdistributionerpsystem.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    FishDeliveryRepository fishDeliveryRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CustomerVerifiedAndContacted'"
    )
    public void wheneverCustomerVerifiedAndContacted_CustomerContactPolicy(
        @Payload CustomerVerifiedAndContacted customerVerifiedAndContacted
    ) {
        CustomerVerifiedAndContacted event = customerVerifiedAndContacted;
        System.out.println(
            "\n\n##### listener CustomerContactPolicy : " +
            customerVerifiedAndContacted +
            "\n\n"
        );
        // Sample Logic //

    }
}
//>>> Clean Arch / Inbound Adaptor
