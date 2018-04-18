package at.ac.unive.hartmann.MS3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class SimpleSourceBean {
    private Source source;

    private static final Logger logger = LoggerFactory.getLogger(SimpleSourceBean.class);

    @Autowired
    public SimpleSourceBean(Source source){
        this.source = source;
    }

    public void publishAdvertisementChange(String action,Integer advId, String adItemName, Double adItemPrice){
        logger.debug("Sending Kafka message {} for Advertisement Id: {}", action, advId);
        AdvertisementChangeModel change =  new AdvertisementChangeModel(
                "application/json",
                action,
                advId,
                adItemName,
                adItemPrice);
        source.output().send(MessageBuilder.withPayload(change).build());
    }
    
}
