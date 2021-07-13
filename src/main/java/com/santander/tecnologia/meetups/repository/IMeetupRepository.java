/**
 * 
 */
package com.santander.tecnologia.meetups.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.santander.tecnologia.meetups.entity.Meet;

/**
 * Repository to access data base to entity Meet
 * 
 * @author Magdaly Santos
 * 
 */
@Repository
public interface IMeetupRepository extends JpaRepository<Meet, Integer> {

}
