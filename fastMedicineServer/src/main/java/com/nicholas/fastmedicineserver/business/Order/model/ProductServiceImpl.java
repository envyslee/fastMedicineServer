package com.nicholas.fastmedicineserver.business.Order.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.neo4j.cypher.internal.compiler.v2_1.docbuilders.internalDocBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nicholas.fastmedicineserver.business.Order.service.IProductSevice;
import com.nicholas.fastmedicineserver.entity.Pharmacy;
import com.nicholas.fastmedicineserver.entity.Price;
import com.nicholas.fastmedicineserver.entity.ProductDetail;
import com.nicholas.fastmedicineserver.entity.ProductDetailItem;
import com.nicholas.fastmedicineserver.entity.ProductListItem;
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
	public List<ProductListItem> getProductDetails(int p,int c,int i)
	{
		List<ProductListItem> items = new ArrayList<ProductListItem>();
		List<Price> list=priceRepo.getList(p, c,i*15);
		for (Price price : list)
		{
			ProductListItem item = new ProductListItem();
			ProductDetail tmp=productRepo.findById(price.getProductId());
			item.setProductId(tmp.getId());
			item.setIconUrl(tmp.getProductPics());
			item.setProductName(tmp.getProductName());
			String usage = tmp.getProductUsage();
			if (usage.length() > 28)
			{
				usage = usage.substring(0, 28) + "...";
			}
			item.setProductDesc(usage);
			item.setProductSpec(tmp.getProductSpec());
			item.setProductSale(tmp.getProductSale());
			item.setProductPrice(price.getProductPrice());
			item.setPharmacyId(price.getPharmacyId());
			
			items.add(item);
		}
		return items;
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

	@Override
	public List<ProductListItem> getProcuctBySearch(Integer ph,String key)
	{
		List<Price> list=priceRepo.findByPharmacyId(ph);
		List<ProductListItem> items=new ArrayList<ProductListItem>();
		for (Price price : list)
		{
			ProductDetail detail=productRepo.findById(price.getProductId());
			if (detail.getProductKey().contains(key))
			{
				ProductListItem item=new ProductListItem();
				item.setIconUrl(detail.getProductPics());
				item.setPharmacyId(detail.getPharmacyId());
				String usage = detail.getProductUsage();
				if (usage.length() > 28)
				{
					usage = usage.substring(0, 28) + "...";
				}
				item.setProductDesc(usage);
				item.setProductId(detail.getId());
				item.setProductSale(detail.getProductSale());
				item.setProductPrice(price.getProductPrice());
				item.setProductSpec(detail.getProductSpec());
				item.setProductName(detail.getProductName());
				item.setPharmacyId(price.getPharmacyId());
				items.add(item);
			}
		}
		if (items.size()==0)
		{
			return null;
		}else{
			return items;
		}
		
	}

	@Override
	public List<ProductListItem> getSpecPrice(Integer ph,Integer i)
	{
		List<Price> priceList=priceRepo.findSepcPrice(ph,i*15);
		ProductListItem item=new ProductListItem();
		List<ProductListItem> specPriceList=new ArrayList<ProductListItem>();
		for (Price price : priceList)
		{
			ProductDetail tDetail=productRepo.findById(price.getProductId());
			item.setIconUrl(tDetail.getProductPics());
			item.setPharmacyId(price.getPharmacyId());
			String usage = tDetail.getProductUsage();
			if (usage.length() > 28)
			{
				usage = usage.substring(0, 28) + "...";
			}
			item.setProductDesc(usage);
			item.setProductId(price.getProductId());
			item.setProductName(tDetail.getProductName());
			item.setProductPrice(price.getProductPrice());
			item.setProductSale(tDetail.getProductSale());
			item.setProductSpec(tDetail.getProductSpec());
			specPriceList.add(item);
		}
		return specPriceList;
	}
	

	@Override
	public ProductListItem getShakePrice(Integer ph) {
		List<Price> prices=priceRepo.findShake(ph);
		int size=prices.size();
		Random random=new Random();
		int index=random.nextInt(size);
		ProductListItem item=new ProductListItem();
		int productId=prices.get(index).getProductId();
		ProductDetail detail=productRepo.findById(productId);
		item.setIconUrl(detail.getProductPics());
		item.setProductName(detail.getProductName());
		item.setProductPrice(prices.get(index).getProductPrice());
		item.setPharmacyId(prices.get(index).getPharmacyId());
		item.setProductId(productId);
		return item;
	}

}
