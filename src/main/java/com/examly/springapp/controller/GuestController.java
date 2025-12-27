
package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Guest;
import com.examly.springapp.service.GuestService;

@RestController
@RequestMapping("/api")
public class GuestController {

    @Autowired
    private GuestService guestService;

    @PostMapping("/guests")
    public ResponseEntity<Guest> create(@RequestBody Guest guest) {
        Guest savedGuest = guestService.createGuest(guest);
        return new ResponseEntity<>(savedGuest, HttpStatus.CREATED);
    }

    @GetMapping("/guests")
    public ResponseEntity<List<Guest>> getAll() {
        List<Guest> guests = guestService.getAllGuests();
        return new ResponseEntity<>(guests, HttpStatus.OK);
    }

    @GetMapping("/guests/{id}")
    public ResponseEntity<Guest> getById(@PathVariable int id) {
        Guest guest = guestService.getGuestById(id);
        return new ResponseEntity<>(guest, HttpStatus.OK);
    }

    @PutMapping("/guests/{id}")
    public ResponseEntity<Guest> update(@RequestBody Guest guest, @PathVariable int id) {
        Guest updated = guestService.updateGuest(guest, id);
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }

    @DeleteMapping("/guests/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        guestService.deleteGuest(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/guests/phone/{phone}")
    public ResponseEntity<?> getByPhone(@PathVariable String phone){
        List<Guest> list = guestService.getGuestsByPhone(phone);
        if(list.isEmpty()){
            return new ResponseEntity<>("No guest found with phone: "+phone,HttpStatus.NO_CONTENT);
        }
        else{
            return new ResponseEntity<>(list,HttpStatus.OK);
        }

    }

    @GetMapping("/guests/email/{email}")
    public ResponseEntity<List<Guest>> getByEmail(@PathVariable String email){
        List<Guest> list = guestService.getGuestsByEmail(email);
        if(list.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        else{
            return new ResponseEntity<>(list,HttpStatus.OK);
        }
    }
}
