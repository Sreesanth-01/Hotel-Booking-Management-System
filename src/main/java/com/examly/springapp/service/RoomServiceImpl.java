// package com.examly.springapp.service;

// import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import com.examly.springapp.model.Room;
// import com.examly.springapp.repository.RoomRepo;

// @Service
// public class RoomServiceImpl implements RoomService {

//     @Autowired
//     private RoomRepo roomRepo;

//     @Override
//     public Room addRoom(Room room) {
//         return roomRepo.save(room);
//     }

//     @Override
//     public List<Room> getAllRooms() {
//         return roomRepo.findAll();
//     }

//     @Override
//     public Room getRoomById(Long id) {
//         return roomRepo.findById(id).orElse(null);
//     }

//     @Override
//     public Room updateRoom(Long id, Room room) {
//         Room existing = roomRepo.findById(id).orElse(null);
//         if (existing == null) return null;

//         existing.setRoomNumber(room.getRoomNumber());
//         existing.setRoomType(room.getRoomType());
//         existing.setPrice(room.getPrice());
//         existing.setRoomCategory(room.getRoomCategory());

//         return roomRepo.save(existing);
//     }

//     @Override
//     public List<Room> getRoomsByCategoryName(String categoryName) {
//         return roomRepo.findByRoomCategoryCategoryName(categoryName);
//     }

//     @Override
//     public Room getRoomByNumber(String roomNumber) {
//         return roomRepo.findByRoomNumber(roomNumber);
//     }
// }
