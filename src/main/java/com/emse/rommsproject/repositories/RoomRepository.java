package com.emse.rommsproject.repositories;

import com.emse.rommsproject.models.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, String> {
}
