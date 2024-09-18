sospechoso(1,'Coronel Mostaza').
sospechoso(2,'Senorita Escarlata').
sospechoso(3,'Profesor Ciruela').
sospechoso(4,'Senora Pavo Real').
sospechoso(5,'Senora White').
sospechoso(6,'Reverendo Verde').

arma(1,'Candelero').
arma(2,'Daga').
arma(3,'Tuberia de plomo').
arma(4,'Revolver').
arma(5,'Soga').
arma(6,'Llave').

habitacion(1,'Vestibulo').
habitacion(2,'Salon').
habitacion(3,'Comedor').
habitacion(4,'Cocina').
habitacion(5,'Salon de baile').
habitacion(6,'Sala de billar').
habitacion(7,'Biblioteca').
habitacion(8,'Estudio').

num_sospechoso(S):- random(1, 6, S).
num_arma(A):- random(1, 6, A).
num_habitacion(H):- random(1, 8, H).

sospechar(SOS,ARM,HAB):-    
    num_sospechoso(S), num_arma(A), num_habitacion(H),
    verificar(SOS,ARM,HAB,S,A,H).


verificar(SOS,ARM,HAB,S,A,H) :-   
    sospechoso(S,SOS), arma(A,ARM), habitacion(H,HAB).

verificar(SOS,ARM,HAB,S,A,H):-
     sospechoso(S,_), arma(A,_), habitacion(H,_), 
     false.
