package com.chinaautorental.util;

public class PageUtils {
	
	/**
	 * 获取分页的开始行
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public static Integer getStart(Integer pageNum, Integer pageSize){
		return (pageNum-1)*pageSize;
	}
}
