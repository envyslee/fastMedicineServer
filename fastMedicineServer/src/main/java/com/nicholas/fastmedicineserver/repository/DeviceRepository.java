package com.nicholas.fastmedicineserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicholas.fastmedicineserver.entity.DeviceInfo;

public interface DeviceRepository extends JpaRepository<DeviceInfo, Long>
{

}
