# PROGETTO OBJECT ORIENTATION - 2020/2021

## TRACCIA 4: SISTEMA DI GESTIONE PER UNO SCALO AEROPORTUALE
"Si sviluppi un sistema informativo, composto da una base di dati relazionale e un applicativo Java dotato di
GUI (Swing o JavaFX), per la gestione di uno scalo aeroportuale. Il sistema deve essere in grado di gestire: le
tratte che interessano l’aeroporto, con relativa data e orario di partenza e numero di prenotazioni sulla tratta,
i gate, e le compagnie aeree che hanno la base nell’aeroporto. Ad ogni gate è associata una o più code di
imbarco (Famiglie, diversamente abili, priority, business class e così via). Un determinato gate è associato a
diverse tratte nell’arco della giornata, ma mai a più di una contemporaneamente. Inoltre, ad ogni gate e
tratta sono associati anche uno slot, inteso come tempo di imbarco stimato ed uno effettivo, per ognuna
delle code presenti. Il sistema deve permettere di effettuare una ricerca dettagliata di tratte, gate e
compagnie aeree, considerando anche le tempistiche di imbarco, evidenziando le tratte che sforano il tempo
d’imbarco stimato. Il sistema dove permettere anche di stimare l’utilizzo di ogni gate nell’arco della
giornata/settimana/mese, sia in base del tempo stimato di utilizzo, che in base al tempo effettivo.

##Descrizione dell'applicativo

Il progetto verte sullo sviluppo di un sistema di gestione di uno scalo aeroportuale. 
Tutto ciò è stato svolto facendo uso di una GUI tramite l'applicativo Java 'eclipse'.

All'avvio della GUI visualizzata la schermata AMain che consente la ricerca e l'accesso alle seguenti schede:
- Tratte;
- Gates;
- Info;
- Mappa;
- Compagnie Aeree.

La barra di ricerca presente nella schermata iniziale consente di effettuare una ricerca utilizzando la Destinazione, il Terminal e/o la Compagnia.

All'interno della scheda Tratte è possibile effettuare una ricerca utilizzando uno o più dei seguenti criteri: data partenza, data arrivo, orario partenza, orario arrivo, destinazione.
In seguito all'effettuazione della ricerca è possibile ottenere informazioni riguardanti i voli disponibili.
All'interno della stessa scheda si possono effettuare le operazioni di aggiunta e rimozione di tratta.

La scheda Gate contiene un Panel al cui interno sono visionabili i gates con le tratte e le code associate a ciascuno di essi. È possibile stabilire, per ogni gate associato ad una tratta, i tempi di imbarco stimati ed effettivi legati alle diverse code di imbarco. Nel caso in cui le tempistiche di imbarco superino quelle stimate questo verrà evidenziato.
Sono visionabili anche informazioni specifiche riguardo la frequenza e la durata dei voli delle diverse compagnie aeree che hanno base nello scale aeroportuale, oltre a tutti i voli e le tratte che percorrono.
La scheda Compagnie Aeree contiene informazioni riguardo le compagnie aeree che hanno base nell'aeroporto. All'interno della stessa scheda è possibile aggiungere nuove compagnie aeree e rimuoverne se necessario.

La scheda Info consente di visionare le FAQ (Frequently Asked Question).
La scheda Mappa contiente una mappa dell'aeroporto con relativa Legenda.

All'applicativo Java è associato un DataBase utilizzato per tener traccia di tutte le informazioni riguardanti le tratte con relativa date e orario di partenza e numero di prenotazioni, i gate e le compagnie aeree.

## Demo
![AMain](https://user-images.githubusercontent.com/78097073/112246240-9e8a4200-8c52-11eb-91b9-3963f2c5558c.PNG)
![Tratta](https://user-images.githubusercontent.com/78097073/112246334-c5e10f00-8c52-11eb-9eb3-8767002e967e.PNG)
![gate](https://user-images.githubusercontent.com/78097073/112246358-d09ba400-8c52-11eb-9343-44d9d8af0be2.PNG)
![Compagnie](https://user-images.githubusercontent.com/78097073/112246386-de512980-8c52-11eb-9a5c-a1b34c5eb966.PNG)
![mAPPA](https://user-images.githubusercontent.com/78097073/112246433-ee690900-8c52-11eb-8e5b-7f3c21212cc8.PNG)
![FAQ](https://user-images.githubusercontent.com/78097073/112246481-093b7d80-8c53-11eb-8124-10fdddb810e4.PNG)



## Technologies Used
- Eclipse IDE 2020‑12
- WindowBuilder v.1.9.4
- Photoshop CS6



