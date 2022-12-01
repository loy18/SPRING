package kr.or.ddit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ddit.mapper.BookMapper;
import kr.or.ddit.service.BookService;
import kr.or.ddit.vo.BookVO;

@Service
public class BookServiceImpl implements BookService {
	//DI(의존성 주입)
	@Autowired
	BookMapper bookMapper;
	
	// 도서 목록
	@Override
		public List<BookVO> list() {
			return this.bookMapper.list();
		}
	
	// 도서 상세(1행)
	@Override
	public BookVO detail(int bookId) {
		return this.bookMapper.detail(bookId);
	}
	// 도서 수정
	@Override
	public int updateBook(BookVO bookVO) {
		return this.bookMapper.updateBook(bookVO);
	}
	
	// 도서 삭제
	@Override
	public int deleteBook(int bookId) {
		return this.bookMapper.deleteBook(bookId);
	}
	
	// 도서 추가
	@Override
		public int insertBook(BookVO bookVO) {
			return this.bookMapper.insertBook(bookVO);
		}
}
