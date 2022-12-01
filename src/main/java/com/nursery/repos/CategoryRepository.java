package com.nursery.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nursery.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	@Query(value="select * from category where isactive=true",nativeQuery =true)
	List<Category> allActiveCategory();
}
