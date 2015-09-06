package com.json.item;

import java.util.HashMap;
import java.util.Map;


public class Result {

private Integer id;

private String hkpDrugCode;

private Integer mfId;

private String label;
private String name;
private String type;
private String packSize;
private String manufacturer;
private Double uPrice;
private Double oPrice;
private Double mrp;
private Integer su;
private Object slug;
private String packForm;
private String form;
private Object imgUrl;
private Integer uip;
private Object generics;
private Object productsForBrand;
private Integer discountPerc;
private String pForm;
private Boolean available;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The id
*/
public Integer getId() {
return id;
}

/**
* 
* @param id
* The id
*/
public void setId(Integer id) {
this.id = id;
}

/**
* 
* @return
* The hkpDrugCode
*/
public String getHkpDrugCode() {
return hkpDrugCode;
}

/**
* 
* @param hkpDrugCode
* The hkpDrugCode
*/
public void setHkpDrugCode(String hkpDrugCode) {
this.hkpDrugCode = hkpDrugCode;
}

/**
* 
* @return
* The mfId
*/
public Integer getMfId() {
return mfId;
}

/**
* 
* @param mfId
* The mfId
*/
public void setMfId(Integer mfId) {
this.mfId = mfId;
}

/**
* 
* @return
* The label
*/
public String getLabel() {
return label;
}

/**
* 
* @param label
* The label
*/
public void setLabel(String label) {
this.label = label;
}

/**
* 
* @return
* The name
*/
public String getName() {
return name;
}

/**
* 
* @param name
* The name
*/
public void setName(String name) {
this.name = name;
}

/**
* 
* @return
* The type
*/
public String getType() {
return type;
}

/**
* 
* @param type
* The type
*/
public void setType(String type) {
this.type = type;
}

/**
* 
* @return
* The packSize
*/
public String getPackSize() {
return packSize;
}

/**
* 
* @param packSize
* The packSize
*/
public void setPackSize(String packSize) {
this.packSize = packSize;
}

/**
* 
* @return
* The manufacturer
*/
public String getManufacturer() {
return manufacturer;
}

/**
* 
* @param manufacturer
* The manufacturer
*/
public void setManufacturer(String manufacturer) {
this.manufacturer = manufacturer;
}

/**
* 
* @return
* The uPrice
*/
public Double getUPrice() {
return uPrice;
}

/**
* 
* @param uPrice
* The uPrice
*/
public void setUPrice(Double uPrice) {
this.uPrice = uPrice;
}

/**
* 
* @return
* The oPrice
*/
public Double getOPrice() {
return oPrice;
}

/**
* 
* @param oPrice
* The oPrice
*/
public void setOPrice(Double oPrice) {
this.oPrice = oPrice;
}

/**
* 
* @return
* The mrp
*/
public Double getMrp() {
return mrp;
}

/**
* 
* @param mrp
* The mrp
*/
public void setMrp(Double mrp) {
this.mrp = mrp;
}

/**
* 
* @return
* The su
*/
public Integer getSu() {
return su;
}

/**
* 
* @param su
* The su
*/
public void setSu(Integer su) {
this.su = su;
}

/**
* 
* @return
* The slug
*/
public Object getSlug() {
return slug;
}

/**
* 
* @param slug
* The slug
*/
public void setSlug(Object slug) {
this.slug = slug;
}

/**
* 
* @return
* The packForm
*/
public String getPackForm() {
return packForm;
}

/**
* 
* @param packForm
* The packForm
*/
public void setPackForm(String packForm) {
this.packForm = packForm;
}

/**
* 
* @return
* The form
*/
public String getForm() {
return form;
}

/**
* 
* @param form
* The form
*/
public void setForm(String form) {
this.form = form;
}

/**
* 
* @return
* The imgUrl
*/
public Object getImgUrl() {
return imgUrl;
}

/**
* 
* @param imgUrl
* The imgUrl
*/
public void setImgUrl(Object imgUrl) {
this.imgUrl = imgUrl;
}

/**
* 
* @return
* The uip
*/
public Integer getUip() {
return uip;
}

/**
* 
* @param uip
* The uip
*/
public void setUip(Integer uip) {
this.uip = uip;
}

/**
* 
* @return
* The generics
*/
public Object getGenerics() {
return generics;
}

/**
* 
* @param generics
* The generics
*/
public void setGenerics(Object generics) {
this.generics = generics;
}

/**
* 
* @return
* The productsForBrand
*/
public Object getProductsForBrand() {
return productsForBrand;
}

/**
* 
* @param productsForBrand
* The productsForBrand
*/
public void setProductsForBrand(Object productsForBrand) {
this.productsForBrand = productsForBrand;
}

/**
* 
* @return
* The discountPerc
*/
public Integer getDiscountPerc() {
return discountPerc;
}

/**
* 
* @param discountPerc
* The discountPerc
*/
public void setDiscountPerc(Integer discountPerc) {
this.discountPerc = discountPerc;
}

/**
* 
* @return
* The pForm
*/
public String getPForm() {
return pForm;
}

/**
* 
* @param pForm
* The pForm
*/
public void setPForm(String pForm) {
this.pForm = pForm;
}

/**
* 
* @return
* The available
*/
public Boolean getAvailable() {
return available;
}

/**
* 
* @param available
* The available
*/
public void setAvailable(Boolean available) {
this.available = available;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
