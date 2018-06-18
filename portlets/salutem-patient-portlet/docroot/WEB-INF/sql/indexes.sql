create index IX_DC772719 on patient_Patient (groupId);
create index IX_30FA6DCC on patient_Patient (groupId, isConfirmed);
create index IX_EAF699E7 on patient_Patient (name, middleName, surname);
create index IX_45EE89E4 on patient_Patient (pesel);
create index IX_4CA41BEB on patient_Patient (userId);