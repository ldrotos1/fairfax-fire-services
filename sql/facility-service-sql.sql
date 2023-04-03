-- Create the database for the facility service --
CREATE DATABASE facility_service_db;
CREATE EXTENSION postgis;

-- Create tables --
CREATE TABLE station (
	station_number VARCHAR( 3 ) PRIMARY KEY,
	station_name VARCHAR ( 75 ) UNIQUE NOT NULL,
	battalion_number VARCHAR( 3 ) NOT NULL,
	division_number VARCHAR( 3 ) NOT NULL,
	is_battalion_hq BOOLEAN DEFAULT FALSE,
	is_divsion_hq BOOLEAN DEFAULT FALSE,
	is_volunteer BOOLEAN DEFAULT FALSE,
	latitude double precision NOT NULL,
   	longitude double precision NOT NULL,
	geo_location geometry(Point,4326));
CREATE INDEX geo_location_index ON station USING GIST (geo_location);

-- Populate tables --
INSERT INTO station (station_number, station_name, battalion_number, division_number,
					is_battalion_hq, is_divsion_hq, is_volunteer, latitude, longitude, geo_location)
VALUES('401', 'McLean', '402', '401', '0','1','0','38.93170767','-77.17720881', ST_SetSRID(ST_MakePoint(-77.17720881,38.93170767),4326)),
('402', 'Vienna', '402', '401', '0','1','0','38.89910054','-77.26110868', ST_SetSRID(ST_MakePoint(-77.26110868,38.89910054),4326)),
('404', 'Herndon', '401', '401', '0','0','0','38.96895526','-77.38597307', ST_SetSRID(ST_MakePoint(-77.38597307,38.96895526),4326)),
('405', 'Franconia', '408', '402', '0','1','0','38.78055516','-77.14624037', ST_SetSRID(ST_MakePoint(-77.14624037,38.78055516),4326)),
('408', 'Annandale', '404', '402', '0','1','0','38.83266389','-77.19172645', ST_SetSRID(ST_MakePoint(-77.19172645,38.83266389),4326)),
('409', 'Mount Vernon', '406', '402', '0','0','0','38.74289007','-77.07763152', ST_SetSRID(ST_MakePoint(-77.07763152,38.74289007),4326)),
('410', 'Bailey''s Crossroads', '408', '402', '0','1','0','38.84561648','-77.13904707', ST_SetSRID(ST_MakePoint(-77.13904707,38.84561648),4326)),
('411', 'Penn Daw', '406', '402', '0','0','1','38.7730972','-77.07916152', ST_SetSRID(ST_MakePoint(-77.07916152,38.7730972),4326)),
('412', 'Great Falls Fire', '401', '401', '0','1','0','38.998882','-77.291149', ST_SetSRID(ST_MakePoint(-77.291149,38.998882),4326)),
('413', 'Dunn Loring', '402', '401', '0','1','0','38.90239484','-77.22435572', ST_SetSRID(ST_MakePoint(-77.22435572,38.90239484),4326)),
('414', 'Burke', '405', '402', '0','1','0','38.79286154','-77.27145137', ST_SetSRID(ST_MakePoint(-77.27145137,38.79286154),4326)),
('415', 'Chantilly', '403', '401', '0','0','1','38.89173491','-77.43131008', ST_SetSRID(ST_MakePoint(-77.43131008,38.89173491),4326)),
('416', 'Clifton', '407', '401', '0','0','0','38.78061384','-77.38557077', ST_SetSRID(ST_MakePoint(-77.38557077,38.78061384),4326)),
('417', 'Centreville', '403', '401', '0','1','0','38.83682109','-77.42926373', ST_SetSRID(ST_MakePoint(-77.42926373,38.83682109),4326)),
('418', 'Jefferson', '404', '402', '0','0','1','38.86544835','-77.19277335', ST_SetSRID(ST_MakePoint(-77.19277335,38.86544835),4326)),
('419', 'Lorton', '405', '402', '0','1','0','38.70381902','-77.2104221', ST_SetSRID(ST_MakePoint(-77.2104221,38.70381902),4326)),
('420', 'Gunston', '405', '402', '0','0','0','38.67371646','-77.19412373', ST_SetSRID(ST_MakePoint(-77.19412373,38.67371646),4326)),
('421', 'Fair Oaks', '407', '401', '1','1','0','38.87198769','-77.37059355', ST_SetSRID(ST_MakePoint(-77.37059355,38.87198769),4326)),
('422', 'Springfield', '408', '402', '0','1','0','38.76621592','-77.18414404', ST_SetSRID(ST_MakePoint(-77.18414404,38.76621592),4326)),
('423', 'West Annandale', '404', '402', '0','1','0','38.83971352','-77.2521758', ST_SetSRID(ST_MakePoint(-77.2521758,38.83971352),4326)),
('424', 'Woodlawn', '406', '402', '0','0','0','38.72178018','-77.11916034', ST_SetSRID(ST_MakePoint(-77.11916034,38.72178018),4326)),
('425', 'Reston', '401', '401', '0','0','1','38.95084556','-77.33544527', ST_SetSRID(ST_MakePoint(-77.33544527,38.95084556),4326)),
('426', 'Edsall Road', '408', '402', '0','0','1','38.80516419','-77.17125811', ST_SetSRID(ST_MakePoint(-77.17125811,38.80516419),4326)),
('427', 'West Springfield', '408', '402', '0','0','0','38.78357161','-77.23778946', ST_SetSRID(ST_MakePoint(-77.23778946,38.78357161),4326)),
('428', 'Seven Corners', '404', '402', '0','0','0','38.87048255','-77.15684226', ST_SetSRID(ST_MakePoint(-77.15684226,38.87048255),4326)),
('429', 'Tysons Corner', '402', '401', '0','0','1','38.92935184','-77.23940384', ST_SetSRID(ST_MakePoint(-77.23940384,38.92935184),4326)),
('430', 'Merrifield', '404', '402', '0','0','0','38.87238188','-77.24793904', ST_SetSRID(ST_MakePoint(-77.24793904,38.87238188),4326)),
('431', 'Fox Mill', '403', '401', '0','0','0','38.9261451','-77.37355554', ST_SetSRID(ST_MakePoint(-77.37355554,38.9261451),4326)),
('432', 'Fairview', '407', '401', '0','0','0','38.79882829','-77.32551216', ST_SetSRID(ST_MakePoint(-77.32551216,38.79882829),4326)),
('434', 'Oakton', '407', '401', '0','0','0','38.87618233','-77.30959336', ST_SetSRID(ST_MakePoint(-77.30959336,38.87618233),4326)),
('435', 'Pohick', '405', '402', '0','0','1','38.74633096','-77.25243474', ST_SetSRID(ST_MakePoint(-77.25243474,38.74633096),4326)),
('436', 'Frying Pan', '403', '401', '0','0','0','38.93625563','-77.41403892', ST_SetSRID(ST_MakePoint(-77.41403892,38.93625563),4326)),
('437', 'Kingstowne', '406', '402', '1','0','0','38.74234138','-77.15889404', ST_SetSRID(ST_MakePoint(-77.15889404,38.74234138),4326)),
('438', 'West Centreville', '403', '401', '0','1','0','38.8437895','-77.45356896', ST_SetSRID(ST_MakePoint(-77.45356896,38.8437895),4326)),
('439', 'North Point', '401', '401', '0','0','0','38.99788765','-77.34241291', ST_SetSRID(ST_MakePoint(-77.34241291,38.99788765),4326)),
('440', 'Fairfax Center', '407', '401', '0','0','1','38.84817','-77.364902', ST_SetSRID(ST_MakePoint(-77.364902,38.84817),4326)),
('441', 'Crosspointe', '405', '402', '0','0','0','38.71997256','-77.27862307', ST_SetSRID(ST_MakePoint(-77.27862307,38.71997256),4326)),
('442', 'Wolftrap', '401', '401', '0','0','0','38.95712748','-77.2750435', ST_SetSRID(ST_MakePoint(-77.2750435,38.95712748),4326)),
('444', 'Scotts Run', '402', '401', '0','0','0','38.91936','-77.21531', ST_SetSRID(ST_MakePoint(-77.21531,38.91936),4326));


