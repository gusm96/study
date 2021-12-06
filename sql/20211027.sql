EXEC DBMS_XDB.SETHTTPPORT(9000);

-- 8080 < - Tomcat
select dbms_xdb.gethttpport() from dual;
exec dbms_xdb.sethttpport(9090);