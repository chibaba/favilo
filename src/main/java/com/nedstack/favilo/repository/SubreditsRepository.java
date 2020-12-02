package com.nedstack.favilo.repository;


import com.nedstack.favilo.model.Subredits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubreditsRepository extends JpaRepository<Subredits, Long> {
}
