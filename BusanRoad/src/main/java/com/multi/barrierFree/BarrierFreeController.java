package com.multi.barrierFree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

@Controller
public class BarrierFreeController {
	@Autowired
	BarrierFreeService service;	
	
	@Autowired
	PageService page;
	
	/* @RequestMapping("barrierFreePage")
	public void main() throws Exception {
		// fake endpoint that returns XML response
		// String URL = �쐆ttp://www.mocky.io/v2/5c8bdd5c360000cd198f831e��;
		String URL = "http://apis.data.go.kr/B551011/KorWithService/searchKeyword?serviceKey=K5tPP3Wsd1MWhFM2XCvS7ry6p4vsQ0Dj9vpom2RzYVEwSX2kack%2FiEhE5WY5KdF5wBJigCkNh9e9e%2F%2B4k9BenA%3D%3D&numOfRows=150&pageNo=1&MobileOS=ETC&MobileApp=AppTest&listYN=Y&arrange=A&keyword=%EB%B6%80%EC%82%B0";
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(URL);
		System.out.println(doc);
		
		// normalize XML response
		doc.getDocumentElement().normalize();
		NodeList nodeList = doc.getElementsByTagName("item");
		List<BarrierFreeVO> emps = new ArrayList<BarrierFreeVO>();
		System.out.println(nodeList.getLength());
		
		for (int temp = 0; temp < nodeList.getLength(); temp++) {
			Node nNode = nodeList.item(temp);
			Element eElement = (Element) nNode;
			System.out.println(eElement.getNodeName());
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element elem = (Element) nNode;
				BarrierFreeVO vo = new BarrierFreeVO(
						
                        elem.getElementsByTagName("addr1").item(0).getTextContent(),
                        elem.getElementsByTagName("mapx").item(0).getTextContent(),
                        elem.getElementsByTagName("mapy").item(0).getTextContent(),
                        elem.getElementsByTagName("title").item(0).getTextContent(),
                        elem.getElementsByTagName("contentid").item(0).getTextContent(),
                        elem.getElementsByTagName("firstimage").item(0).getTextContent()
                        );
				dao.insert(vo);
                emps.add(vo);
			}
		} // for
		System.out.println(emps);
	}
	*/
	
	
//	@RequestMapping("barrierFreePage2")
//	public void list(Model model) throws Exception{
//		
//		
//		List<BarrierFreeVO> list = dao.contentid();
//		model.addAttribute("list", list);
//		
//		for(BarrierFreeVO v:list) {
//			String URL = "http://apis.data.go.kr/B551011/KorWithService/detailWithTour?serviceKey=K5tPP3Wsd1MWhFM2XCvS7ry6p4vsQ0Dj9vpom2RzYVEwSX2kack%2FiEhE5WY5KdF5wBJigCkNh9e9e%2F%2B4k9BenA%3D%3D&numOfRows=10&pageNo=1&MobileOS=ETC&MobileApp=AppTest&contentId=" + v.contentid;
//			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//			DocumentBuilder builder = factory.newDocumentBuilder();
//			Document doc = builder.parse(URL);
//			System.out.println(doc);
//			
//			// normalize XML response
//			doc.getDocumentElement().normalize();
//			NodeList nodeList = doc.getElementsByTagName("item");
//			List<BarrierFree2VO> emps = new ArrayList<BarrierFree2VO>();
//			System.out.println(nodeList.getLength());
//			
//			for (int temp = 0; temp < nodeList.getLength(); temp++) {
//				Node nNode = nodeList.item(temp);
//				Element eElement = (Element) nNode;
//				System.out.println(eElement.getNodeName());
//				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
//					Element elem = (Element) nNode;
//					BarrierFree2VO vo = new BarrierFree2VO(
//							
//	                        elem.getElementsByTagName("contentid").item(0).getTextContent(),
//	                        elem.getElementsByTagName("parking").item(0).getTextContent(),
//	                        elem.getElementsByTagName("route").item(0).getTextContent(),
//	                        elem.getElementsByTagName("publictransport").item(0).getTextContent(),
//	                        elem.getElementsByTagName("ticketoffice").item(0).getTextContent(),
//	                        elem.getElementsByTagName("promotion").item(0).getTextContent(),
//	                        elem.getElementsByTagName("wheelchair").item(0).getTextContent(),
//	                        elem.getElementsByTagName("exit").item(0).getTextContent(),
//	                        elem.getElementsByTagName("elevator").item(0).getTextContent(),
//	                        elem.getElementsByTagName("restroom").item(0).getTextContent(),
//	                        elem.getElementsByTagName("auditorium").item(0).getTextContent(),
//	                        elem.getElementsByTagName("room").item(0).getTextContent(),
//	                        elem.getElementsByTagName("handicapetc").item(0).getTextContent(),
//	                        elem.getElementsByTagName("braileblock").item(0).getTextContent(),
//	                        elem.getElementsByTagName("helpdog").item(0).getTextContent(),
//	                        elem.getElementsByTagName("guidehuman").item(0).getTextContent(),
//	                        elem.getElementsByTagName("audioguide").item(0).getTextContent(),
//	                        elem.getElementsByTagName("bigprint").item(0).getTextContent(),
//	                        elem.getElementsByTagName("brailepromotion").item(0).getTextContent(),
//	                        elem.getElementsByTagName("guidesystem").item(0).getTextContent(),
//	                        elem.getElementsByTagName("blindhandicapetc").item(0).getTextContent(),
//	                        elem.getElementsByTagName("signguide").item(0).getTextContent(),
//	                        elem.getElementsByTagName("videoguide").item(0).getTextContent(),
//	                        elem.getElementsByTagName("hearingroom").item(0).getTextContent(),
//	                        elem.getElementsByTagName("hearinghandicapetc").item(0).getTextContent(),
//	                        elem.getElementsByTagName("stroller").item(0).getTextContent(),
//	                        elem.getElementsByTagName("lactationroom").item(0).getTextContent(),
//	                        elem.getElementsByTagName("babysparechair").item(0).getTextContent(),
//	                        elem.getElementsByTagName("infantsfamilyetc").item(0).getTextContent()
//	                        
//	                        );
//					dao.insert2(vo);
//	                emps.add(vo);
//				}
//			} // for
//			System.out.println(emps);
//		}
//	}
	
	
	
	@RequestMapping("barrierFreeDetail")
	public void barrierFreeDetail(BarrierFreeVO vo, Model model) {
		BarrierFreeVO one = service.one(vo);
		model.addAttribute("one", one);
	}
	@RequestMapping("barrierFreePage2")
	public void all2(PageVO vo, Model model) {
		vo.setStartEnd(vo.getPage());
		List<BarrierFreeVO> list = service.all(vo);
		int count = service.count();
		System.out.println("all count>> " + count);
		int pages = count / 10 + 1;
		model.addAttribute("list", list);
	}
	@RequestMapping("barrierFreePage")
	public void all(PageVO vo, Model model) {
		vo.setStartEnd(vo.getPage());
		List<BarrierFreeVO> list = service.all(vo);
		int count = service.count();
		System.out.println("all count>> " + count);
		int pages = count / 10 + 1;
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("pages", pages);
	}
	
	
}
