package dal;

public class InspectionDAO {

}


/*
create table Inspection (
	Inspection_ID int not null,
	InspectionType varchar(255),
	InspectionDate date,
	Inspector varchar(255),
	Outcome varchar(65000),
	Room_ID int,
    Building_ID int,
    Group_ID int,
	primary key (Inspection_ID),
    foreign key (Room_ID) references Room (Room_ID),
    foreign key (Building_ID) references Building (Building_ID),
    foreign key (Group_ID) references BuildingGroup (Group_ID)
);
*/