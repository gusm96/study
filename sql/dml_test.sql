DESC phoneinfo_basic;
-- 데이터 삽입
insert into phoneinfo_basic 
values (1,'seongmo','010-8261-2561','naver','deagu',sysdate);

insert into phoneinfo_basic 
values (2,'king','010-8387-2561','naver','deagu',sysdate);


select * from phoneinfo_basic;

-- 데이터 업데이트
update phoneinfo_basic
set fr_email = 'daum'
where fr_name = 'seongmo'
;

select * from phoneinfo_basic;


-- 데이터 삭제
delete from phoneinfo_basic
where fr_name='seongmo'
;

commit;

select * from phoneinfo_basic
;
