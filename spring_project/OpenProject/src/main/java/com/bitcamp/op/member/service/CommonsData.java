package com.bitcamp.op.member.service;

public interface CommonsData {
	// 파일을 저장할 URI
	// 상속으로 만들어 두는 이유는
	// 외부로 부터 영향을 받지 않도록 하기 위해.
	String SAVE_URI = "/uploadfile";
}
