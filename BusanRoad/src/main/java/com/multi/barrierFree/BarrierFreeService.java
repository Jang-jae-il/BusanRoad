package com.multi.barrierFree;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;

@Service
public class BarrierFreeService {

	@Autowired
	BarrierFreeDAO dao;

	public void insert(BarrierFreeVO vo) {
		dao.insert(vo);
	}

	public void insert2(BarrierFree2VO vo) {
		dao.insert2(vo);
	}
//	public List<BarrierFreeVO> list(PageVO vo) {
//		return dao.list(vo);
//	}
	
	public BarrierFreeVO one(BarrierFreeVO vo) {
		return dao.one(vo);
	}
	public List<BarrierFreeVO> all(PageVO vo) {
		return dao.all(vo);
	}
	public int count() {
		return dao.count();
	}
	
	public List<BarrierFreeVO> contentid(){
		return dao.contentid();
	}
}
