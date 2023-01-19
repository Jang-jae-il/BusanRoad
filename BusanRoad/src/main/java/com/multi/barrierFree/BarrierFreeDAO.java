package com.multi.barrierFree;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Component;

@Repository
public class BarrierFreeDAO {

	@Autowired
	SqlSessionTemplate my;

	public void insert(BarrierFreeVO vo) {
		my.insert("barrierFree.addfree", vo);
	}

	public void insert2(BarrierFree2VO vo) {
		my.insert("barrierFree.addfree2", vo);
	}
	public BarrierFreeVO one(BarrierFreeVO vo) {
		return my.selectOne("barrierFree.one",vo);
	}
	
	public List<BarrierFreeVO> all(PageVO vo) {
		return my.selectList("barrierFree.all", vo);
	}
	public int count() {
		return my.selectOne("barrierFree.count");
	}
	
	public List<BarrierFreeVO> contentid(){
		return my.selectList("barrierFree.contentid");
	}
}
