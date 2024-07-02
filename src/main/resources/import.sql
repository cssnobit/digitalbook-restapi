insert into tb_author(name) values ('Andrew S. Tanenbaum');
insert into tb_author(name) values ('Aditya Y. Bhargava');

insert into tb_publisher(name) values ('Novatec Editora');
insert into tb_publisher(name) values ('Pearson');

insert into tb_ebook(title, url_img, description, asin, price, publisher_id) values ('Entendendo Algoritmos: Um guia ilustrado para programadores e outros curiosos', 'https://m.media-amazon.com/images/I/71Vkg7GfPFL._AC_UF1000,1000_QL80_.jpg','Um algoritmo nada mais é do que um procedimento passo a passo para a resolução de um problema. Os algoritmos que você mais utilizará como um programador já foram descobertos, testados e provados.', 'B07B61HC3L', 59.90, 1);
insert into tb_ebook(title, url_img, description, asin, price, publisher_id) values ('Redes de computadores 5ª edição', 'https://m.media-amazon.com/images/I/91avlbxMITL._SY425_.jpg', 'Este clássico best-seller foi totalmente atualizado e passa a abordar as redes desenvolvidas a partir de 1990.', 'B00K60OUEQ',148.24 ,2);

insert into tb_ebook_authors(authors_id, ebook_id) values(2, 1);
insert into tb_ebook_authors(authors_id, ebook_id) values(1, 2);