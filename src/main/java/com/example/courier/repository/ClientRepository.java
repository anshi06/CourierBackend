package com.example.courier.repository;/*
 * @author gauravverma
 */

import com.example.courier.model.ClientInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends JpaRepository<ClientInfo,Integer> {
}
