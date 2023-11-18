package com.topex.Virtual_Stock_Api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.topex.Virtual_Stock_Api.model.Cancellation;

public interface CancellationRepo extends JpaRepository<Cancellation, Integer> {

}
