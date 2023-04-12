SET FOREIGN_KEY_CHECKS=0;
DROP TABLE Product;

CREATE TABLE `Product` (
  `PRODUCT_ID` int  PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `ARMOTIZED` int DEFAULT NULL,
  `ATTACHED_SUPPLIER_ID` varchar(255) DEFAULT NULL,
  `AUTOMATED_SCORING` int DEFAULT NULL,
  `CBS_PRODUCT` varchar(255) DEFAULT NULL,
  `CREATED_BY` int DEFAULT NULL,
  `DATE_CREATED` datetime DEFAULT NULL,
  `INSTALLMENT_OPTIONS` varchar(255) DEFAULT NULL,
  `INSTALLMENT_PERIOD` int DEFAULT NULL,
  `INTEREST_RATE` double DEFAULT NULL,
  `INTEREST_TYPE` varchar(255) DEFAULT NULL,
  `INTEREST_UPFRONT` double DEFAULT NULL,
  `INTRASH` varchar(255) DEFAULT NULL,
  `LOAN_LIMIT_LOAN_AMOUNT_CAP` double DEFAULT NULL,
  `LOAN_LIMIT_LOAN_NUM_CAP` double DEFAULT NULL,
  `MAX_AMOUNT` double DEFAULT NULL,
  `MAX_REPAY_PERIOD` int DEFAULT NULL,
  `MIN_AMOUNT` double DEFAULT NULL,
  `MIN_REPAY_PERIOD` int DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `PERIOD_UNITS` varchar(255) DEFAULT NULL,
  `PROGRAM_ID_FK` int DEFAULT NULL,
  `RECIPIENT_TYPE` varchar(255) DEFAULT NULL,
  `REDUCING_BALANCE` double DEFAULT NULL,
  `STATUS` int DEFAULT NULL,
  `TAKE_CHARGES_UPFRONT` double DEFAULT NULL,
  `UPDATE_CYCLE` int DEFAULT NULL,
  `ORGANISATION_ID_FK` int DEFAULT NULL,
  `PROGRAM_NAME` varchar(255) DEFAULT NULL,
FOREIGN KEY (`PROGRAM_ID_FK`) REFERENCES `program` (`PROGRAM_ID`),
FOREIGN KEY (`ORGANISATION_ID_FK`) REFERENCES `organisation` (`ORGANISATION_ID`)
) ENGINE=InnoDB ;


CREATE TABLE `Program` (
  `PROGRAM_ID` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `CREATED_BY` int DEFAULT NULL,
  `DATA_SOURCE_ID_FK` int DEFAULT NULL,
  `DATE_CREATED` datetime DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `INTRASH` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `ORGANISATION_ID_FK` int DEFAULT NULL,
  `PRIMARY_IDENTITY_TYPE` varchar(255) DEFAULT NULL,
  `STATUS` int DEFAULT NULL,
  `DATA_SOURCE` varchar(255) DEFAULT NULL,
  `ORGANISATION` varchar(255) DEFAULT NULL,
FOREIGN KEY (`ORGANISATION_ID_FK`) REFERENCES `organisation` (`ORGANISATION_ID`)
) ENGINE=InnoDB ;


SET FOREIGN_KEY_CHECKS=1;