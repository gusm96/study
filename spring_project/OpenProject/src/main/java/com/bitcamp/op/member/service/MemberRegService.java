package com.bitcamp.op.member.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.bitcamp.op.member.domain.MemberRegRequest;

// bean 으로 등록하기위해 어노테이션 @Service 를  사용
@Service
public class MemberRegService {

	public int insertMember(MemberRegRequest regRequest, HttpServletRequest req) {

		// 파일이 있다면 -> 파일 저장
		if (!regRequest.getPhoto().isEmpty() && regRequest.getPhoto().getSize() > 0) {
			// 시스템의 경로

			String savePath = req.getSession().getServletContext().getRealPath(CommonsData.SAVE_URI);
		}

		return 0;
	}

}
