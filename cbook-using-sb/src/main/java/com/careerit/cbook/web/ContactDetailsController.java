package com.careerit.cbook.web;

import com.careerit.cbook.domain.ContactDetails;
import com.careerit.cbook.service.ContactDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
@RequiredArgsConstructor
public class ContactDetailsController {


    private final ContactDetailsService contactDetailsService;

    @GetMapping("/all")
    public List<ContactDetails> getAllContacts() {
        return contactDetailsService.getAllContacts();
    }
    @GetMapping("/search")
    public List<ContactDetails> search(@RequestParam("str") String str) {
        return null;
    }

}
