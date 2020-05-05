-- Drop table

-- DROP TABLE public."user"

CREATE TABLE public."user" (
	id int4 NOT NULL GENERATED ALWAYS AS IDENTITY,
	"name" varchar NULL,
	age int4 NULL,
	email varchar NULL,
	operator0 varchar NULL
)
WITH (
	OIDS=FALSE
) ;
