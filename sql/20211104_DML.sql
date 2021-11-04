

-- 2021.11.04

-- DML : 데이터의 변경 -> 데이터 삽입, 수정, 삭제

drop table emp01;
create table emp01
as
select * from emp
;
select * from emp01
;
 -- update 테이블이름 set 컬럼이름=값, 컬럼이름=값, ... where 행 선택 조건

-- 1. 모든 사원의 부서번호를 30번으로 수정하자
--    모든 사원은 where 절ㅇ를 사용하지 않는 경우
update emp01
set deptno = 30
;
select * from emp01
;

-- 2. 이번에 모든 사원의 급여를 10% 인상시키는 UPDATE문을 사용
update emp01
set sal = sal*1.1
;
select * from emp01
;

-- 3. 모든 사원의 입사일을 오늘로 수정하려면 다음과 같이 한다.
update emp01
set hiredate = sysdate
;
select * from emp01
;

--  1. 부서번호가 10번인 사원의 부서번호를 30번으로 수정하자.
update emp01
set deptno = 30
where deptno=10
;
select * from emp01 where deptno =10
;
select * from emp01 order by deptno
;

-- 2. 급여가 3000 이상인 사원만 급여를 10% 잉상하자

update emp01
set sal = sal*1.1
where sal >= 3000
;
select * from emp01 where sal >= 3000
;

-- 3. 1987년에 입사한 사원의 입사일이 오늘로 수정합시다.
--    사원의 입사일이 오늘로 수종한 후에 테리블 내용을 살펴 봅시다.
update emp01
set hiredate = sysdate
where substr(hiredate, 1,2) ='87'
;
select * from emp01 where substr(hiredate, 1, 2) = '21'
;

-- 두개 이상의 컬럼을 변경할 때는 컴머를 쓰고 바꾸고자 하는 컬럼을 추가
-- 1. SCOTT 사원의
--      부서번호는 40번으로, 직급은 MANAGER로
--      한번에 수정하도록 해보자.
 update emp01
 set deptno =40, job ='MANAGER'
 where ename='SCOTT'
 ;
 
 select * from emp01 where ename ='SCOTT';
 
 -- 2. SCOTT 사원의
 --         입사 일자는 오늘로,
 --     급여는 50 으로,
 --     커미션읗 4000 으로 수정하자.
 update emp01
 set hiredate = sysdate , sal=50, comm=4000
 where ename ='SCOTT'
 ;
 
 select * from emp01 where ename='SCOTT'
;
-- 설정: dept01 -> 새로만들기
drop table dept01;
create table dept01
as
select * from dept
;
select * from dept01
;
-- 1. 20번 부서의 지역명을 40번 부서의 지역명으로 변경하기 위해서 서브 쿼리문을  사용해 봅시다. 
select loc from dept01 where deptno=20
;
-- DALLAS
update dept01
set loc = (select loc from dept01 where deptno=20)
where deptno=40
;
select * from dept01
;

-- 서브 쿼리를 이용해서 부서번호가 20인 부서의 부서명과 지역명을 
-- 부서 번호가  40번인 부서와 동일하 게  변경하도록 해  봅시다.

update dept01
set(dname, loc) = (select dname, loc from dept01 where deptno =40)
where deptno = 20
;
select * from dept01
;

-- "행"을 삭제하는 delete 문

-- dept01 테이블의 모든 데이터(행)를 지우자

delete from dept01;
delete from emp01;
select * from emp01;
select * from dept01;

rollback; --> 마지막 커밋된 위치로 이동, 마지막 커밋 후 작업된 DML 바녕이 되지 않는다.

-- 부서 테이블에서 30번 부서만 삭제 합니다.

delete from dept01 where deptno=30;
select * from dept01;

commit;

-- 사원 테이블에서  부서명이 SALES인 사원을 모두 삭제해봅시다.
delete from emp01
where deptno=(select deptno from dept where dname='SALES')
;
select * from emp01
;