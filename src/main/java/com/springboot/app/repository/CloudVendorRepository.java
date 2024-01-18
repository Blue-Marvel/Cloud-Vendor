package com.springboot.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}
