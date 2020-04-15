/**
 * 
 */
package com.angularspring.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.angularspring.onlinebookstore.entity.BookCategory;

/**
 * @author kje7631
 *
 */
@RepositoryRestResource(collectionResourceRel="bookCategory", path="book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
