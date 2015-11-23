package com.nicholas.fastmedicineserver.business.Distance.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nicholas.fastmedicineserver.business.Distance.service.IPharmacyService;
import com.nicholas.fastmedicineserver.entity.Pharmacy;
import com.nicholas.fastmedicineserver.integration.CommonMethod;
import com.nicholas.fastmedicineserver.repository.PharmacyRepository;

@Component
public class PharmacyServiceImpl implements IPharmacyService
{
	@Autowired
	PharmacyRepository PharmacyRepo;

	@Override
	public Integer getNearestPharmacy(double la, double lo)
	{
		List<Pharmacy> pharmacies=PharmacyRepo.findAll();
		double d = 1000*100;
		Integer id = 0;
		for (Pharmacy pharmacy : pharmacies)
		{
			double lap=pharmacy.getPharmacyLa();
			double lop=pharmacy.getPharmacyLo();
			double tmp=CommonMethod.GetDistance(la, lo, lap, lop);
			if (tmp<d)
			{
				d=tmp;
				id=pharmacy.getId().intValue();
			}
		}
		return id;
	}

}
