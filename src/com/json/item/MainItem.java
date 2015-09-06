package com.json.item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MainItem {

private Integer status;
private Object errors;
private String op;
private List<Result> result = new ArrayList<Result>();
private Boolean hasMore;
private Header header;
private Context context;
private Object message;
private List<Object> suggestions = new ArrayList<Object>();
private String searchTerm;
private Integer totalRecordCount;
private String TEMPUSERID;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The status
*/
public Integer getStatus() {
return status;
}

/**
* 
* @param status
* The status
*/
public void setStatus(Integer status) {
this.status = status;
}

/**
* 
* @return
* The errors
*/
public Object getErrors() {
return errors;
}

/**
* 
* @param errors
* The errors
*/
public void setErrors(Object errors) {
this.errors = errors;
}

/**
* 
* @return
* The op
*/
public String getOp() {
return op;
}

/**
* 
* @param op
* The op
*/
public void setOp(String op) {
this.op = op;
}

/**
* 
* @return
* The result
*/
public List<Result> getResult() {
return result;
}

/**
* 
* @param result
* The result
*/
public void setResult(List<Result> result) {
this.result = result;
}

/**
* 
* @return
* The hasMore
*/
public Boolean getHasMore() {
return hasMore;
}

/**
* 
* @param hasMore
* The hasMore
*/
public void setHasMore(Boolean hasMore) {
this.hasMore = hasMore;
}

/**
* 
* @return
* The header
*/
public Header getHeader() {
return header;
}

/**
* 
* @param header
* The header
*/
public void setHeader(Header header) {
this.header = header;
}

/**
* 
* @return
* The context
*/
public Context getContext() {
return context;
}

/**
* 
* @param context
* The context
*/
public void setContext(Context context) {
this.context = context;
}

/**
* 
* @return
* The message
*/
public Object getMessage() {
return message;
}

/**
* 
* @param message
* The message
*/
public void setMessage(Object message) {
this.message = message;
}

/**
* 
* @return
* The suggestions
*/
public List<Object> getSuggestions() {
return suggestions;
}

/**
* 
* @param suggestions
* The suggestions
*/
public void setSuggestions(List<Object> suggestions) {
this.suggestions = suggestions;
}

/**
* 
* @return
* The searchTerm
*/
public String getSearchTerm() {
return searchTerm;
}

/**
* 
* @param searchTerm
* The searchTerm
*/
public void setSearchTerm(String searchTerm) {
this.searchTerm = searchTerm;
}

/**
* 
* @return
* The totalRecordCount
*/
public Integer getTotalRecordCount() {
return totalRecordCount;
}

/**
* 
* @param totalRecordCount
* The totalRecordCount
*/
public void setTotalRecordCount(Integer totalRecordCount) {
this.totalRecordCount = totalRecordCount;
}

/**
* 
* @return
* The TEMPUSERID
*/
public String getTEMPUSERID() {
return TEMPUSERID;
}

/**
* 
* @param TEMPUSERID
* The TEMP_USER_ID
*/
public void setTEMPUSERID(String TEMPUSERID) {
this.TEMPUSERID = TEMPUSERID;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}