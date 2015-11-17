create table CUD_UserData (
	userDataId LONG not null primary key,
	companyId LONG,
	userId LONG,
	creationDate DATE null,
	modifiedDate DATE null,
	t_ShirtSize VARCHAR(75) null,
	dateOfBirth DATE null,
	glasses BOOLEAN,
	coffeesPerDay INTEGER,
	heightCm INTEGER
);