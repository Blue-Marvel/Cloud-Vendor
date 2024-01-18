package com.springboot.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.app.model.CloudVendor;
import com.springboot.app.repository.CloudVendorRepository;

import io.micrometer.common.lang.Nullable;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

  CloudVendorRepository cloudVendorRepository;

  public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
    this.cloudVendorRepository = cloudVendorRepository;
  }

  @Override
  public String createCloudVendor(CloudVendor cloudVendor) {
    if (cloudVendor == null) {
      return "Fail";
    }

    cloudVendorRepository.save(cloudVendor);

    return "Success";
  }

  @Override
  public String updateCloudVendor(CloudVendor cloudVendor) {
    if (cloudVendor == null) {
      return "Fail";
    }
    cloudVendorRepository.save(cloudVendor);

    return "Success";
  }

  @Override
  public String deleteCloudVendor(@Nullable String vendorId) {
    if (vendorId == null) {
      return "Fail";
    }
    cloudVendorRepository.deleteById(vendorId);
    return "Success";
  }

  @Override
  public CloudVendor getCloudVendor(String vendorId) {
    if (vendorId == null) {
      return null;
    }
    return cloudVendorRepository.findById(vendorId).get();
  }

  @Override
  public List<CloudVendor> getAllCloudVendor() {
    return cloudVendorRepository.findAll();
  }

}
