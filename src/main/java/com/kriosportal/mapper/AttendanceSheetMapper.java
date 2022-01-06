package com.kriosportal.mapper;

import org.springframework.stereotype.Component;
import com.kriosportal.bean.AttendanceSheetBean;
import com.kriosportal.entity.AttendanceSheet;
import com.kriosportal.entity.User;

/*
 *@author Deepak
 *Date 27-12-2021 
 */
@Component
public class AttendanceSheetMapper {

	public AttendanceSheetBean mapToBean(AttendanceSheet sheet) {
		AttendanceSheetBean AttendanceSheetBean = new AttendanceSheetBean();
		AttendanceSheetBean.setSheetId(sheet.getSheetId());
		AttendanceSheetBean.setSheetName(sheet.getSheetName());
		AttendanceSheetBean.setSheetType(sheet.getSheetType());
		AttendanceSheetBean.setSheet(sheet.getSheet());
		AttendanceSheetBean.setSheetOf(sheet.getSheetOf());
		AttendanceSheetBean.setUploadDate(sheet.getUploadDate());
		AttendanceSheetBean.setModifyDate(sheet.getModifyDate());
		AttendanceSheetBean.setUseridFK(sheet.getUser().getUserid());
		return AttendanceSheetBean;
	}

	public AttendanceSheet mapToEntity(AttendanceSheetBean AttendanceSheetBean, User user) {
		AttendanceSheet sheet = new AttendanceSheet();
		sheet.setSheetId(AttendanceSheetBean.getSheetId());
		sheet.setSheetName(AttendanceSheetBean.getSheetName());
		sheet.setSheetType(AttendanceSheetBean.getSheetType());
		sheet.setSheetOf(AttendanceSheetBean.getSheetOf());
		sheet.setSheet(AttendanceSheetBean.getSheet());
		sheet.setUploadDate(AttendanceSheetBean.getUploadDate());
		sheet.setModifyDate(AttendanceSheetBean.getModifyDate());
		sheet.setUser(user);
		return sheet;
	}
}
