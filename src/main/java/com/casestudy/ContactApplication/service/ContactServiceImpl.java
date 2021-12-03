package com.casestudy.ContactApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import org.springframework.beans.factory.annotation.Autowired;

import com.casestudy.ContactApplication.entity.Contact;
import com.casestudy.ContactApplication.model.ContactDTO;
import com.casestudy.ContactApplication.repository.IContactRepository;
//import com.casestudy.ContactApplication.repository.IContactRepository;
//import com.casestudy.ContactApplication.utils.ContactUtil;

@Service
public class ContactServiceImpl implements IContactService {
	@Autowired
	IContactRepository contactRepo;

	@Override
	public ContactDTO getContact(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ContactDTO> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Optional<Contact> findByPhoneNumber(Long phoneNumber){
		// TODO Auto-generated method stub
		return null;
	}
	
//	@Override
//	public List<ContactDTO> getContactByPhoneNumber(){
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public ContactDTO addContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContactDTO updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContactDTO deleteContact(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
