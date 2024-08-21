package com.kafkaproject.cab_book_user.service;

import com.kafkaproject.cab_book_user.entity.KafkaMessage;
import com.kafkaproject.cab_book_user.jpa_repository.KafkaMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @KafkaListener(topics = "cab-location", groupId = "user-group")
    public void listenCabLocation(String locationMessage) {
        System.out.println(locationMessage);
        KafkaMessage kafkaMessage = new KafkaMessage(locationMessage);
        kafkaMessageRepository.save(kafkaMessage);
    }

    @Autowired
    private KafkaMessageRepository kafkaMessageRepository;


}
