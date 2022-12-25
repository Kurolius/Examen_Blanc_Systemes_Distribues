﻿# Examen_Blanc_Systemes_Distribues

## Micro-service Radar

>	Une entité "Radar" qui comporte les propriétés suivantes :
 - id
 - vitesse maximale
 - Longitude
 - Latitude

![image](https://user-images.githubusercontent.com/84138772/209477587-e270febb-7085-4379-b9a8-5e4f9ef71fdd.png)

### Radar Command Service

![image](https://user-images.githubusercontent.com/84138772/209477618-1b5a8cba-3dc4-4c7f-b89b-246ad9a4ca7e.png)

### Radar Query Service 

![image](https://user-images.githubusercontent.com/84138772/209477635-e2085ffa-dd80-4c5b-9a0a-5d782e5be442.png)

## Micro-service Immatriculation 

>	Une entité "Véhicules" qui comporte les propriétés suivantes :
 - id
 - numéro de matricule
 - marque
 - puissance fiscale
 - modèle
 - propriétaire
 
 >	Une entité "Propriétaire" qui comporte les propriétés suivantes :
 - id
 - nom
 - date de naissance
 - email

![image](https://user-images.githubusercontent.com/84138772/209477759-94531021-6463-4673-9e4d-dd8aaf60b0c3.png)


### Immatriculation Command Service

![image](https://user-images.githubusercontent.com/84138772/209477772-f0d8c894-4059-482a-89b8-15330ce4f23b.png)


### Immatriculation Query Service 

![image](https://user-images.githubusercontent.com/84138772/209477784-627cd70c-5b0e-4e71-9d16-233a3635b704.png)


## Micro-service Infractions

>	Une entité "Infraction" qui comporte les propriétés suivantes :
 - id
 - date
 - numéro du radar
 - matricule du véhicule
 - vitesse du véhicule
 - vitesse maximale du radar
 - montant de l’infraction

![image](https://user-images.githubusercontent.com/84138772/209477836-f41f8e4f-0944-484f-81fc-4434fc6e3657.png)

### Infraction Command Service

![image](https://user-images.githubusercontent.com/84138772/209477858-ca9f360a-53f3-41ae-8072-75c399de1f0f.png)

### Infraction Query Service 

![image](https://user-images.githubusercontent.com/84138772/209477873-f12dc2cc-9f0d-407e-b558-39877085cfb8.png)

## Gateway

![image](https://user-images.githubusercontent.com/84138772/209477986-15e14f90-f920-4142-ac0e-6ca14747ded6.png)

## Eureka Discovery

![image](https://user-images.githubusercontent.com/84138772/209477997-d7194802-b6bd-45d9-873f-f46c77239d24.png)


## Test API 

### Add radar

![image](https://user-images.githubusercontent.com/84138772/209478232-15634204-f817-4a03-878c-3df903ba9eed.png)

### Get all radars

![image](https://user-images.githubusercontent.com/84138772/209478268-1e7adae2-13dc-4d18-aa56-e7cf3c5ddfc3.png)

### Add vehicle

![image](https://user-images.githubusercontent.com/84138772/209478488-43490358-a26e-414f-8419-ce91454251a8.png)


### Get all vehicles

![image](https://user-images.githubusercontent.com/84138772/209478521-d7c49cec-72b8-40cd-8d56-5d7f3f5c6e1b.png)


### Over speed violation

![image](https://user-images.githubusercontent.com/84138772/209478645-aa08b11b-5314-4a71-b56e-f044902d5fc2.png)


### Violation list

![image](https://user-images.githubusercontent.com/84138772/209478708-26b61cbe-9c4c-4bf6-9779-e341733c2a5c.png)

## Front End


