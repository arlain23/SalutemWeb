create index IX_759867F0 on visit_Classification (patientId);

create index IX_60667218 on visit_ClassificationSimilarity (classificationId);

create index IX_DF5E8581 on visit_Location (patientId);
create index IX_1D3D59B2 on visit_Location (patientId, year);
create index IX_8910D33E on visit_Location (patientId, year, month);
create index IX_8F966E4E on visit_Location (patientId, year, month, day);
create index IX_34CEDCDA on visit_Location (patientId, year, month, day, lat, lon);

create index IX_AE8DBA43 on visit_Regression (patientId, doctorId);

create index IX_802B1C5B on visit_Time (doctorId, patientId);
create index IX_BE74856F on visit_Time (doctorId, patientId, visitDay, visitMonth, visitYear);
create index IX_9A11F5D5 on visit_Time (doctorId, visitDay, visitMonth, visitYear);
create index IX_FFA872D6 on visit_Time (doctorId, wasFinished);
create index IX_4C563076 on visit_Time (entryUuid);
create index IX_AC146F69 on visit_Time (patientId);
create index IX_447A06F on visit_Time (visitId);

create index IX_CBE0D61E on visit_Visit (doctorId, visitDate);

create index IX_F0CFD726 on visit_WeightMap (regressionId);