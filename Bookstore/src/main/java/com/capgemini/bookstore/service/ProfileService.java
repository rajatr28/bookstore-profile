package com.capgemini.bookstore.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bookstore.dao.ProfileDao;
import com.capgemini.bookstore.entity.Profile;

@Service
@Transactional
public class ProfileService {
	
	@Autowired
	ProfileDao profileDao;
	
	public boolean addProfile(Profile profile)
	{
		return profileDao.save(profile) != null;
	}
	
	public Optional<Profile> viewProfile(Integer profileId)
	{
		return profileDao.findById(profileId);
	}
	
	public Profile updateProfile(Profile profile,int profileId)
	{
		return profileDao.save(profile);
	}

}
