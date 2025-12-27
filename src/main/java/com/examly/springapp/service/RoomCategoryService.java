// package com.examly.springapp.service;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.domain.Page;
// import org.springframework.data.domain.PageRequest;
// import org.springframework.data.domain.Pageable;
// import org.springframework.stereotype.Service;

// import com.examly.springapp.model.RoomCategory;
// import com.examly.springapp.repository.RoomCategoryRepo;

// @Service
// public class RoomCategoryService {

//     @Autowired
//     private RoomCategoryRepo rcRepo;

//     // CREATE
//     public RoomCategory createCategory(RoomCategory rc) {
//         if (rc == null) {
//             return null;
//         }
//         return rcRepo.save(rc);
//     }

//     // READ ALL
//     public List<RoomCategory> getAllCategories() {
//         return rcRepo.findAll();
//     }

//     // READ BY ID
//     public Optional<RoomCategory> getCategoryById(int id) {
//         return rcRepo.findById(id);
//     }

//     // PAGINATION
//     public Page<RoomCategory> getCategoryPage(int page, int size) {
//         Pageable pageable = PageRequest.of(page, size);
//         return rcRepo.findAll(pageable);
//     }

//     // UPDATE
//     public RoomCategory updateRoomCategory(RoomCategory rc, int id) {
//         rc.setCategoryId(id);
//         return rcRepo.save(rc);
//     }

//     // DELETE  ✅ REQUIRED FOR TEST
//     public void deleteCategory(int id) {
//         rcRepo.deleteById(id);
//     }
// }
