package com.spring.btc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.btc.service.BoardService;
import com.spring.btc.vo.ResultVO;

@RestController
@RequestMapping("/api/board")
public class BoardController {	
	
    // 올바른 Logger 생성
    private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
    @Autowired
    private BoardService boardservice;
	
    @ResponseBody
    @RequestMapping(value = "get-board-list.do", method = RequestMethod.GET)
    public ResultVO getBoardList() {	
        // 호출 시 찍히게 될 로그
        logger.info("[GET] getBoardList");

        // 결과 값을 담을 ResultVO를 선언한 생성자를 통해서 만드는데 기본값은 success는 false, result는 null로 세팅
        ResultVO result = new ResultVO(false, null);

        try {
            // 서비스에서 게시판 목록을 가져와서 결과에 설정
            result.setResult(boardservice.getBoardList());
            result.setSuccess(true);
        } catch (Exception e) {
            // 예외 발생 시 로그 출력
            logger.error("[Board] getBoardList : " + e.getMessage(), e);
        }

        return result;
    }
}
