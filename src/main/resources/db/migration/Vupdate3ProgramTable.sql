SET FOREIGN_KEY_CHECKS=0;
DROP TABLE Program;

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