create table doctor_Doctor (
	doctorId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	surname VARCHAR(75) null,
	imageId LONG,
	middleName VARCHAR(75) null,
	specialization VARCHAR(75) null
);

create table doctor_DoctorSchedule (
	scheduleId LONG not null primary key,
	doctorId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	dayOfWeek INTEGER,
	startTime DOUBLE,
	endTime DOUBLE
);