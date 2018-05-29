/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/5/14 ÐÇÆÚÒ» ÉÏÎç 12:23:13                    */
/*==============================================================*/


drop table if exists Major;

drop table if exists Student;

/*==============================================================*/
/* Table: Major                                                 */
/*==============================================================*/
create table Major
(
   MajorID              INT not null,
   Name                 varchar(20) not null,
   Remark               varchar(Max),
   primary key (MajorID)
);

/*==============================================================*/
/* Table: Student                                               */
/*==============================================================*/
create table Student
(
   StudentID            varchar(20) not null,
   MajorID              INT,
   Name                 varchar(20) not null,
   primary key (StudentID)
);

alter table Student add constraint FK_Reference_1 foreign key (MajorID)
      references Major (MajorID) on delete restrict on update restrict;

