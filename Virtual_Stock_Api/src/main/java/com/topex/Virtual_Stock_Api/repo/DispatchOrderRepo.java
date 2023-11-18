package com.topex.Virtual_Stock_Api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.topex.Virtual_Stock_Api.model.DispatchOrder;

public interface DispatchOrderRepo extends JpaRepository<DispatchOrder, Integer> {

}
