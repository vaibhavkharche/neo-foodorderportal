package com.neo.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neo.model.Menu;
import com.neo.model.Order;

@Repository
public interface OrderDao extends JpaRepository<Order, Long> {
	
	public default boolean insertOrder(Order order) {
		return saveAndFlush(order) == null ? false : true;
	}
	
	public default Order updateOrder(Order order) {
		return saveAndFlush(order);
	}
	
	public default boolean getOrderByNo(Long orderNo) {
		return getOne(orderNo) != null ? true : false;
	}
	
	public default List<Order> getAllOrders() {
		return findAll();
	}

	public List<Order> getOrdersByDate(Date date);
	public List<Order> getOrdersByMenu(Menu menu);
	
}
