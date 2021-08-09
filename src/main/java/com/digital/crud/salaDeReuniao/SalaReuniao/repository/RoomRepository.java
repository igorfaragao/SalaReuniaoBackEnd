package com.digital.crud.salaDeReuniao.SalaReuniao.repository;

import com.digital.crud.salaDeReuniao.SalaReuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long>{

}
