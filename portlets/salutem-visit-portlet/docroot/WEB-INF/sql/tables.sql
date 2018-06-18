create table visit_Classification (
	classificationId LONG not null primary key,
	patientId LONG
);

create table visit_ClassificationSimilarity (
	similarityId LONG not null primary key,
	classificationId LONG,
	patientId LONG,
	similarity DOUBLE
);

create table visit_Location (
	locationId LONG not null primary key,
	patientId LONG,
	day INTEGER,
	month INTEGER,
	year INTEGER,
	lat DOUBLE,
	lon DOUBLE
);

create table visit_Regression (
	regressionId LONG not null primary key,
	patientId LONG,
	doctorId LONG,
	minimumList VARCHAR(2000) null,
	maximumList VARCHAR(2000) null,
	chosenK INTEGER
);

create table visit_Time (
	timeId LONG not null primary key,
	entryUuid VARCHAR(75) null,
	groupId LONG,
	doctorId LONG,
	patientId LONG,
	visitDay INTEGER,
	visitMonth INTEGER,
	visitYear INTEGER,
	visitTime INTEGER,
	visitDuration INTEGER,
	wasFinished BOOLEAN,
	wasPlanned BOOLEAN,
	visitId LONG
);

create table visit_Visit (
	visitId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	doctorId LONG,
	patientId LONG,
	cancelled BOOLEAN,
	hasHappened BOOLEAN,
	visitDate DATE null,
	startTimeMinutes INTEGER,
	duration INTEGER
);

create table visit_WeightMap (
	weightMapId LONG not null primary key,
	regressionId LONG,
	key_ VARCHAR(2000) null,
	value DOUBLE
);