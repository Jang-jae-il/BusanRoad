package com.multi.barrierFree;

import org.springframework.stereotype.Service;

@Service //½Ì±ÛÅæ
public class PageService {

	public int pages(int count) {
		int pages = 0;
		if(count % 10 == 0) {
			pages = count / 10; //120°³ --> 12pages
		}else {
			pages = count / 10 + 1; //122°³ --> 13pages 
		}
		return pages;
	}
	
}
