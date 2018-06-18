create index IX_E99B75E5 on doctor_Doctor (groupId);
create index IX_5D94C39F on doctor_Doctor (userId);
create index IX_F63953EB on doctor_Doctor (userId, groupId);

create index IX_FD6A9B3B on doctor_DoctorSchedule (dayOfWeek);
create index IX_91CC1E6A on doctor_DoctorSchedule (doctorId);
create index IX_1D5F3E6D on doctor_DoctorSchedule (doctorId, dayOfWeek);