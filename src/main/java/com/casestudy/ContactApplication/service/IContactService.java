package com.casestudy.ContactApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.casestudy.ContactApplication.entity.Contact;
import com.casestudy.ContactApplication.model.ContactDTO;

@Service
public interface IContactService {
	public ContactDTO getContact(int id);
	
	public List<ContactDTO> getAllContacts();
	
	public ContactDTO addContact(Contact contact);
	
	public ContactDTO updateContact(Contact contact);
	
	public ContactDTO deleteContact(int id);

	public Optional<Contact> findByPhoneNumber(Long phoneNumber);

//	public Optional<Contact> getByPhoneNumber(Long phoneNumber);

//	List<ContactDTO> getContactByPhoneNumber();


}
