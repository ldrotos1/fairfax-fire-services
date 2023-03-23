-- Create the database for the address service --
CREATE DATABASE address_service_db;

-- Create addresses table --
CREATE TABLE addresses (
	address_id VARCHAR( 8 ) PRIMARY KEY,
	address VARCHAR ( 100 ) NOT NULL,
	city VARCHAR ( 80 ) NOT NULL,
	state VARCHAR ( 2 ) NOT NULL,
	zip_code VARCHAR ( 5 ) NOT NULL
);

-- Insert Station Addresses --
INSERT INTO addresses (address_id, address, city, state, zip_code)
VALUES('401', '1455 Laughlin Avenue', 'McLean', 'VA', '22101'),
('402', '400 Center Street SW', 'Vienna', 'VA', '22180'),
('404', '680 Spring Street', 'Herndon', 'VA', '20170'),
('405', '6300 Beulah Street', 'Alexandria', 'VA', '22310'),
('408', '7128 Columbia Pike', 'Annandale', 'VA', '22003'),
('409', '2601 Sherwood Hall Lane', 'Alexandria', 'VA', '22306'),
('410', '3601 Firehouse Lane', 'Falls Church', 'VA', '22041'),
('411', '6624 Hulvey Terrace', 'Alexandria', 'VA', '22306'),
('412', '9916 Georgetown Pike', 'Great Falls', 'VA', '22066'),
('413', '2148 Gallows Road', 'Dunn Loring', 'VA', '22027'),
('414', '9501 Old Burke Lake Road', 'Burke', 'VA', '22015'),
('415', '14005 Vernon Street', 'Chantilly', 'VA', '20151'),
('416', '12645 Chapel Road', 'Clifton', 'VA', '20124'),
('417', '5856 Old Centreville Road', 'Centreville', 'VA', '20121'),
('418', '3101 Hodge Place', 'Falls Church', 'VA', '22042'),
('419', '7701 Armistead Road', 'Lorton', 'VA', '22079'),
('420', '10417 Gunston Road', 'Lorton', 'VA', '22079'),
('421', '12300 Lee Jackson Memorial Highway', 'Fairfax', 'VA', '22033'),
('422', '7011 Backlick Road', 'Springfield', 'VA', '22150'),
('423', '8914 Little River Turnpike', 'Fairfax', 'VA', '22031'),
('424', '8701 Lukens Lane', 'Alexandria', 'VA', '22309'),
('425', '1820 Wiehle Avenue', 'Reston', 'VA', '20190'),
('426', '5316 Carolina Place', 'Springfield', 'VA', '22151'),
('427', '6140 Rolling Road', 'Springfield', 'VA', '22152'),
('428', '2949 Sleepy Hollow Road', 'Falls Church', 'VA', '22044'),
('429', '1560 Spring Hill Road', 'McLean', 'VA', '22102'),
('430', '8739 Lee Highway', 'Fairfax', 'VA', '22031'),
('431', '2610 Reston Parkway', 'Herndon', 'VA', '20171'),
('432', '5600 Burke Centre Parkway', 'Fairfax Station', 'VA', '22039'),
('434', '10511 Rosehaven Street', 'Fairfax', 'VA', '22030'),
('435', '7801 Maritime Lane', 'Springfield', 'VA', '22153'),
('436', '2660 West Ox Road', 'Herndon', 'VA', '20171'),
('437', '7936 Telegraph Road', 'Alexandria', 'VA', '22315'),
('438', '6001 O''Day Drive', 'Centreville', 'VA', '20120'),
('439', '1117 Reston Avenue', 'Herndon', 'VA', '20170'),
('440', '4621 Legato Road', 'Fairfax', 'VA', '22030'),
('441', '9610 Hampton Road', 'Fairfax Station', 'VA', '22039'),
('442', '1315 Beulah Rd', 'Vienna', 'VA', '22182'),
('444', '1775 Old Meadow Lane', 'McLean', 'VA', '22102');