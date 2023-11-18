package com.topex.Virtual_Stock_Api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.topex.Virtual_Stock_Api.model.Backorder;

public interface BackOrderRepo extends JpaRepository<Backorder, Integer> {

}
