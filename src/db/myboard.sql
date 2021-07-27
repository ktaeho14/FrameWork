DROP SEQUENCE MYSEQ;
DROP TABLE MYBOARD;

CREATE SEQUENCE MYSEQ;

CREATE TABLE MYBOARD(
	MYNO NUMBER PRIMARY KEY,
	MYNAME VARCHAR2(100) NOT NULL,
	MYTITLE VARCHAR2(2000) NOT NULL,
	MYCONTENT VARCHAR2(4000) NOT NULL,
	MYDATE DATE NOT NULL
);

INSERT INTO MYBOARD
VALUES(MYSEQ.NEXTVAL,'愿�由ъ옄','寃뚯떆�뙋 �뀒�뒪�듃','�뀒�뒪�듃以묒엯�땲�떎.
1233456ABCD',SYSDATE);

SELECT * FROM MYBOARD;