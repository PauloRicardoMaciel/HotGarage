create table car(
    id bigint not null auto_increment,
    modelo varchar(100) not null,
    quantidadePortas integer not null,
    ano integer not null,
    peso float not null ,
    altura float not null,
    comprimento float not null,
    caminhoFotos varchar(100) not null,
    favorito boolean not null,
    historia varchar(100) not null,
    tipoCarro varchar(10) not null,
    nomeMarca char(2) not null,
    quantidadeMarchas integer not null,
    TipoTransnsmicao varchar(3) not null,
    motorModelo varchar(100) not null,
    potencia integer not null,
    torque integer not null,
    giroMax float not null,
    litragem float not null,
    formaMontagem varchar(10) not null,
    aspiracao varchar(20) not null,

    primary key(id)
);