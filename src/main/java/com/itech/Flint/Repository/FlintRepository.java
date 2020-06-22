/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.Flint.Repository;

import com.itech.Flint.Model.Flint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nandom Gusen
 */
@Repository
public interface FlintRepository extends JpaRepository<Flint, Long>{
    
}
