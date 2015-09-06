package com.json.item;

import java.util.HashMap;
import java.util.Map;
public class Context {

private Object city;
private Object emailId;
private Object discount;
private String platformHeader;
private Object canRenderHTMLHeader;
private Object storeCode;
private Object pinCode;
private String ipaddressHeader;
private Boolean login;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The city
*/
public Object getCity() {
return city;
}

/**
* 
* @param city
* The city
*/
public void setCity(Object city) {
this.city = city;
}

/**
* 
* @return
* The emailId
*/
public Object getEmailId() {
return emailId;
}

/**
* 
* @param emailId
* The emailId
*/
public void setEmailId(Object emailId) {
this.emailId = emailId;
}

/**
* 
* @return
* The discount
*/
public Object getDiscount() {
return discount;
}

/**
* 
* @param discount
* The discount
*/
public void setDiscount(Object discount) {
this.discount = discount;
}

/**
* 
* @return
* The platformHeader
*/
public String getPlatformHeader() {
return platformHeader;
}

/**
* 
* @param platformHeader
* The platformHeader
*/
public void setPlatformHeader(String platformHeader) {
this.platformHeader = platformHeader;
}

/**
* 
* @return
* The canRenderHTMLHeader
*/
public Object getCanRenderHTMLHeader() {
return canRenderHTMLHeader;
}

/**
* 
* @param canRenderHTMLHeader
* The canRenderHTMLHeader
*/
public void setCanRenderHTMLHeader(Object canRenderHTMLHeader) {
this.canRenderHTMLHeader = canRenderHTMLHeader;
}

/**
* 
* @return
* The storeCode
*/
public Object getStoreCode() {
return storeCode;
}

/**
* 
* @param storeCode
* The storeCode
*/
public void setStoreCode(Object storeCode) {
this.storeCode = storeCode;
}

/**
* 
* @return
* The pinCode
*/
public Object getPinCode() {
return pinCode;
}

/**
* 
* @param pinCode
* The pinCode
*/
public void setPinCode(Object pinCode) {
this.pinCode = pinCode;
}

/**
* 
* @return
* The ipaddressHeader
*/
public String getIpaddressHeader() {
return ipaddressHeader;
}

/**
* 
* @param ipaddressHeader
* The ipaddressHeader
*/
public void setIpaddressHeader(String ipaddressHeader) {
this.ipaddressHeader = ipaddressHeader;
}

/**
* 
* @return
* The login
*/
public Boolean getLogin() {
return login;
}

/**
* 
* @param login
* The login
*/
public void setLogin(Boolean login) {
this.login = login;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}