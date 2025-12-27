package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Guest;
import com.examly.springapp.repository.GuestRepo;

@Service
public class GuestService {
    @Autowired
    private GuestRepo guestRepo;

    public Guest createGuest(Guest guest){
        return guestRepo.save(guest);
    }

    public List<Guest> getAllGuests(){
        return guestRepo.findAll();
    }

    // public Guest getGuestById(int id){
    //     return guestRepo.findById(id).get();
    // }

    public Guest updateGuest(Guest guest,int id){
        guest.setGuestId(id);
        return guestRepo.save(guest);
    }

    public void deleteGuest(int id){
        guestRepo.deleteById(id);
    }

    public List<Guest> getGuestsByPhone(String phone){
        return guestRepo.findAllByPhone(phone);
    }

    public List<Guest> getGuestsByEmail(String email){
        return guestRepo.findAllByEmail(email);
    }
    public Guest getGuestById(int id){
    return guestRepo.findById(id).orElse(null);
}

}
