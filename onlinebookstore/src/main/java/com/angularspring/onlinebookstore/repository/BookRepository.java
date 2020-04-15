/**
 * 
 */
package com.angularspring.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angularspring.onlinebookstore.entity.Book;

/**
 * @author kje7631
 *
 */
public interface BookRepository extends JpaRepository<Book, Long> {

}
