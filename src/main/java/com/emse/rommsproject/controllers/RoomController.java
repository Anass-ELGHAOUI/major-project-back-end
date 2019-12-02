package com.emse.rommsproject.controllers;


import com.emse.rommsproject.models.Room;
import com.emse.rommsproject.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/api/rooms")
    public List getAllRooms() {
        return roomService.getAllRooms();
    }

    @GetMapping("/api/rooms/{id}")
    public Room getRoom(@PathVariable String roomId){
        return roomService.getRoom(roomId);
    }

    @PostMapping("/api/rooms")
    public void addRoom(@RequestBody Room room) {
        roomService.addRoom(room);
    }

    @PutMapping("/api/rooms/{id}")
    public void updateRoom(@PathVariable String roomId, @RequestBody Room room) {
        roomService.updateRoom(roomId, room);
    }

    @DeleteMapping("/api/rooms/{id}")
    public void deleteRoom(@PathVariable String roomId) {
        roomService.deleteRoom(roomId);
    }
}
