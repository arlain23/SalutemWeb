create table patient_Patient (
	patientId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	confirmingUserId LONG,
	confirmingUserName VARCHAR(75) null,
	isConfirmed BOOLEAN,
	name VARCHAR(75) null,
	surname VARCHAR(75) null,
	middleName VARCHAR(75) null,
	pesel VARCHAR(75) null,
	idNumber VARCHAR(75) null,
	idImageFileEntryId LONG,
	birthDate DATE null,
	sex VARCHAR(75) null,
	address VARCHAR(75) null,
	cityName VARCHAR(75) null
);