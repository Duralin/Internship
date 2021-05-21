package com.example.distlearn.repos;

import com.example.distlearn.domain.Message;
import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {
    List<Message> findByTag(String tag);
}
