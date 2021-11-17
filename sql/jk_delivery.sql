DROP INDEX PK_delivery;

/* 배달정보 */
DROP TABLE delivery 
	CASCADE CONSTRAINTS;

/* 배달정보 */
CREATE TABLE delivery (
	adid NUMBER(6) NOT NULL, /* 주소번호 */
	dname VARCHAR(50) NOT NULL, /* 이름 */
	dadd VARCHAR2(60) NOT NULL, /* 주소 */
	dphn VARCHAR(30) NOT NULL /* 전화번호 */
);

COMMENT ON TABLE delivery IS '배달정보';

COMMENT ON COLUMN delivery.adid IS '주소번호';

COMMENT ON COLUMN delivery.dname IS '이름';

COMMENT ON COLUMN delivery.dadd IS '주소';

COMMENT ON COLUMN delivery.dphn IS '전화번호';

CREATE UNIQUE INDEX PK_delivery
	ON delivery (
		adid ASC
	);

ALTER TABLE delivery
	ADD
		CONSTRAINT PK_delivery
		PRIMARY KEY (
			adid
		);