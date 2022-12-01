package kr.or.ddit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.ddit.service.BookService;
import kr.or.ddit.vo.BookVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/book")
@Controller
public class BookController {
	
	//DI
	@Autowired
	BookService bookService;

	@GetMapping("/list")
	public String list(Model model) {
		
		List<BookVO> bookVOList = this.bookService.list();
		log.info("bookVOList : " + bookVOList);
		
		//공통 약속
		model.addAttribute("bodyTitle","도서목록");
		model.addAttribute("bookVOList", bookVOList);
		
		//forwarding
		return "book/list";
	}
	
	//요청URI : /book/detail?bookId=3
	//요청파라미터 : bookId=3
	//메소드 이름: detail
	//목록에서 title을 클릭 시 상세페이지로 이동
	//부트스트랩 : https://adminlte.io/themes/v3/pages/forms/advanced.html
	//1) 스프링에서 요청파라미터를 매개변수로 받을 수 있다.
	//		요청 파라미터는 String 타입. int 형 매개변수로도 받을 수 있음(자동 형 변환 가능)
	//		매개변수 : String bookId / int bookId
	//2) Map<String, String> / Map<String, Object> 가능
	//3) 골뱅이ModelAttribute BookVO bookVO
	//4) 골뱅이RequestParam Map<String, String> / Map<String, Object> 가능
	@GetMapping("/detail")
	public String detail(int bookId, Model model) {
		log.info("bookId : " + bookId);
		
		//책 상세보기 데이터 가져옴
		BookVO bookVO  = this.bookService.detail(bookId);
		log.info("bookVO : " + bookVO);
		
		//공통 약속
		model.addAttribute("bodyTitle","도서 상세");
		model.addAttribute("bookVO",bookVO);
		//forwarding
		return "book/write";
	}
	
	@PostMapping("/updatePost")
	public String updatePost(@ModelAttribute BookVO bookVO) {
		log.info("업데이트");
		log.info("bookVO : " + bookVO.toString() );
		this.bookService.updateBook(bookVO);
		return "redirect:/book/detail?bookId="+bookVO.getBookId();
		}
	
	//	요청 URI : /book/insert
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/insert")
	public String insert(Model model) {
		//forwarding
		model.addAttribute("bodyTitle","도서 입력");
		return "book/insert";
	}
	
	// 요청 URI : /book/insertPost
	@PostMapping("/insertPost")
	public String insertPost(@ModelAttribute BookVO bookVO) {
		log.info("등록하자");
		log.info("bookVO : " + bookVO.toString());
		
		//도서 입력
		int result = this.bookService.insertBook(bookVO);
		log.info("result값은? (0이면 등록실패) : " + result );
		 
		
		//bookVO.getBookId()는 매퍼 xml의 selectKey를 통해 채워질 것임
		return "redirect:/book/detail?bookId="+bookVO.getBookId();
	}
	
}
