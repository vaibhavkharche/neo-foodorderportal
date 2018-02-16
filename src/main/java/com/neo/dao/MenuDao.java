package com.neo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neo.model.Menu;

@Repository
public interface MenuDao extends JpaRepository<Menu, Integer> {
	
	default boolean addMenu(Menu menu) {
		return saveAndFlush(menu) != null ? true : false;
	}
	
	default boolean updateMenu(Menu menu) {
		return saveAndFlush(menu) != null ? true : false;
	}

	default Menu getMenuById(Integer menuId) {
		return findOne(menuId);
	}
	
	default boolean deleteMenuById(Integer menuId) {
		delete(menuId);
		return true;
	}
	
	
}
