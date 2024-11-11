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
    SupplyChainInformationRepository supplyChainInformationRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='SupplyChainInformationManaged'"
    )
    public void wheneverSupplyChainInformationManaged_SupplyChainInformationPolicy(
        @Payload SupplyChainInformationManaged supplyChainInformationManaged
    ) {
        SupplyChainInformationManaged event = supplyChainInformationManaged;
        System.out.println(
            "\n\n##### listener SupplyChainInformationPolicy : " +
            supplyChainInformationManaged +
            "\n\n"
        );

        // Sample Logic //
        SupplyChainInformation.supplyChainInformationPolicy(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
