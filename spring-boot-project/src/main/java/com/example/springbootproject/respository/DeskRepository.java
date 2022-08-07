package com.example.springbootproject.respository;

import com.example.springbootproject.entity.Desk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeskRepository extends JpaRepository<Desk,Long> {

}
