CREATE TABLE EMPLOYEE (NAME VARCHAR(20));
INSERT INTO EMPLOYEE VALUES(1);
INSERT INTO EMPLOYEE VALUES(2);
INSERT INTO EMPLOYEE VALUES(3);
INSERT INTO EMPLOYEE VALUES(4);
INSERT INTO EMPLOYEE VALUES(5);

SELECT * FROM EMPLOYEE;

CREATE TABLE `stock` (
  `STOCK_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `STOCK_CODE` varchar(10) NOT NULL,
  `STOCK_NAME` varchar(20) NOT NULL,
  PRIMARY KEY (`STOCK_ID`) USING BTREE,
  UNIQUE KEY `UNI_STOCK_NAME` (`STOCK_NAME`),
  UNIQUE KEY `UNI_STOCK_ID` (`STOCK_CODE`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;