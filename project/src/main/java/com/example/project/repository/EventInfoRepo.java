package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.EventInfo;

@Repository
public interface EventInfoRepo extends JpaRepository<EventInfo,Integer>
{
    
}
