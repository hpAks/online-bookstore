/**
 * 
 */
package com.angularspring.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.angularspring.onlinebookstore.entity.Book;

/**
 * @author kje7631
 *
 */
@CrossOrigin("http://localhost:4200")
public interface BookRepository extends JpaRepository<Book, Long> {

}
