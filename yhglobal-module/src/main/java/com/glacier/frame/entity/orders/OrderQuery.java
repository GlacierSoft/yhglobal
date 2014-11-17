package com.glacier.frame.entity.orders;

import java.math.BigDecimal;
import java.util.Date;

public class OrderQuery {

	private String order_code;
	
	private String belaidup_prod_name;
	
	private String order_consignee;
	
	private String belaidup_terminu;
	
	private Date create_time;
	
	private String belaidup_status;
	
	private BigDecimal belaidup_unitprice;

	public String getOrder_code() {
		return order_code;
	}

	public void setOrder_code(String order_code) {
		this.order_code = order_code;
	}

	public String getBelaidup_prod_name() {
		return belaidup_prod_name;
	}

	public void setBelaidup_prod_name(String belaidup_prod_name) {
		this.belaidup_prod_name = belaidup_prod_name;
	}

	public String getOrder_consignee() {
		return order_consignee;
	}

	public void setOrder_consignee(String order_consignee) {
		this.order_consignee = order_consignee;
	}

	public String getBelaidup_terminu() {
		return belaidup_terminu;
	}

	public void setBelaidup_terminu(String belaidup_terminu) {
		this.belaidup_terminu = belaidup_terminu;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getBelaidup_status() {
		return belaidup_status;
	}

	public void setBelaidup_status(String belaidup_status) {
		this.belaidup_status = belaidup_status;
	}

	public BigDecimal getBelaidup_unitprice() {
		return belaidup_unitprice;
	}

	public void setBelaidup_unitprice(BigDecimal belaidup_unitprice) {
		this.belaidup_unitprice = belaidup_unitprice;
	}
	
	
}
