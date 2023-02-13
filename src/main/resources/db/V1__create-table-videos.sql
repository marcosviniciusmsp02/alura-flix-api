create table tb_videos(

                        id bigint not null auto_increment,
                        titulo varchar(50) not null,
                        descricao varchar(200) not null,
                        url varchar(50) not null,

                        primary key(id)

);