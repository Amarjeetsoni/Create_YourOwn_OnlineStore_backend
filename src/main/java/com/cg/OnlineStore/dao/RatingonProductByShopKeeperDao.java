package com.cg.OnlineStore.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.OnlineStore.Entity.RatingonProductByShopKeeper;

@Transactional
public interface RatingonProductByShopKeeperDao extends JpaRepository<RatingonProductByShopKeeper, Long> {

}
