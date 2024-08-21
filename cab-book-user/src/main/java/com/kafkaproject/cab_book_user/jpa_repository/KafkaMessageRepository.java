package com.kafkaproject.cab_book_user.jpa_repository;

import com.kafkaproject.cab_book_user.entity.KafkaMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KafkaMessageRepository extends JpaRepository<KafkaMessage, Long> {
}
