package com.nicholas.fastmedicineserver.business.Order.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nicholas.fastmedicineserver.business.Order.service.IProductSevice;
import com.nicholas.fastmedicineserver.entity.Pharmacy;
import com.nicholas.fastmedicineserver.entity.Price;
import com.nicholas.fastmedicineserver.entity.ProductDetail;
import com.nicholas.fastmedicineserver.entity.ProductDetailItem;
import com.nicholas.fastmedicineserver.repository.PharmacyRepository;
import com.nicholas.fastmedicineserver.repository.PriceRepository;
import com.nicholas.fastmedicineserver.repository.ProductDetailRepository;

@Component
public class ProductServiceImpl implements IProductSevice
{
	@Autowired
	PriceRepository priceRepo;
	
	@Autowired
	ProductDetailRepository productRepo;
	
	@Autowired
	PharmacyRepository pharmacyRepo;
	

	@Override
	public List<Price> getProducts(Integer p,Integer c)
	{
		return priceRepo.getList(p, c);
	}
	
	@Override
	public List<ProductDetail> getProductDetails(int p,int c)
	{
		List<ProductDetail> productDetails=new ArrayList<ProductDetail>();
		List<Price> list=priceRepo.getList(p, c);
		for (Price price : list)
		{
			ProductDetail tDetail=productRepo.findById(price.getProductId());
			tDetail.setProductPrice(price.getProductPrice());
			tDetail.setPharmacyId(price.getPharmacyId());
			productDetails.add(tDetail);
		}
		return productDetails;
	}

	@Override
	public ProductDetailItem getDetail(Integer ph, Integer pr)
	{
		ProductDetailItem productDetailItem=new ProductDetailItem();
		Price price=priceRepo.getDetail(ph, pr);
		ProductDetail tDetail=productRepo.findById(pr);
		
		Pharmacy pharmacy= pharmacyRepo.findById(price.getPharmacyId());
		productDetailItem.setAttentionTip(tDetail.getAttentionTip());
		productDetailItem.setMainIngredients(tDetail.getMainIngredients());
		productDetailItem.setPharmacyName(pharmacy.getPharmacyName());
		productDetailItem.setPharmacyAddress(pharmacy.getPharmacyAddress());
		productDetailItem.setPharmacyPhone(pharmacy.getPharmacyPhone());
		productDetailItem.setProductCharacter(tDetail.getProductCharacter());
		productDetailItem.setProductEnterprise(tDetail.getProductEnterprise());
		productDetailItem.setProductName(tDetail.getProductName());
		productDetailItem.setProductPics(tDetail.getProductPics());
		productDetailItem.setProductPrice(price.getProductPrice());
		productDetailItem.setProductSpec(tDetail.getProductSpec());
		productDetailItem.setProductStorage(tDetail.getProductStorage());
		productDetailItem.setProductUsage(tDetail.getProductUsage());
		productDetailItem.setUntowardEffect(tDetail.getUntowardEffect());
		productDetailItem.setUsageAmount(tDetail.getUsageAmount());
		return productDetailItem;
	}

}
