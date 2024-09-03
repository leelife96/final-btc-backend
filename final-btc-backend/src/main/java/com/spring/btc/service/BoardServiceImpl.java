package com.spring.btc.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.btc.mapper.BoardMapper;
import com.spring.btc.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Override
	public List<BoardVO> getBoardList() {
		// TODO Auto-generated method stub
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		try(SqlSession session = sqlSessionFactory.openSession()) {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			boardList = mapper.getBoardList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return boardList;
	}

	@Override
	public boolean registBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		vo.setRegDate(new Date());
		vo.setWriter("user");
		boolean result = false;
		try(SqlSession session = sqlSessionFactory.openSession()) {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			int mapperResult = 0;
			mapperResult = mapper.registBoard(vo);
			if(mapperResult > 0) {
				result = true;
			}else {
				result = false;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}


	@Override
	public BoardVO getBoardDetail(BoardVO vo) {
		// TODO Auto-generated method stub
				BoardVO board = new BoardVO();
		 
				try (SqlSession session = sqlSessionFactory.openSession()) {
					BoardMapper mapper = session.getMapper(BoardMapper.class);
		 
					board = mapper.getBoardDetail(vo.getBno());
		 
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				return board;
			}

	@Override
	public boolean editBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		vo.setRegDate(new Date());
		vo.setWriter("user");
		boolean result = false;
		try (SqlSession session = sqlSessionFactory.openSession()) {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
 
			int mapperResult = 0;
			mapperResult = mapper.editBoard(vo);
			if(mapperResult>0) {
				result = true;
			} else {
				result = false;
			}
 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean deleteBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		boolean result = false;
        
        try (SqlSession session = sqlSessionFactory.openSession()) {
            BoardMapper mapper = session.getMapper(BoardMapper.class);

            // 매퍼의 결과를 담을 변수
            int mapperResult = 0;
            
            // 성공시 1이 반환됩니다.
            mapperResult = mapper.deleteBoard(vo);
            
            //정상 동작시 return 값을 true
            if (mapperResult > 0) {
                result = true;
            }
            //정상 동작이 아닐 시 return 값을 false
            else {
                result = false;
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    
        return result;
    }
	


	}




