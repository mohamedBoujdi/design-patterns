# design-patterns

﻿![](Aspose.Words.f4ecc9be-d7a1-4036-b692-adb86bac8e6a.001.png)

GOF“Gang of Four” : refers to the four authors of the book – Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides.

![](Aspose.Words.f4ecc9be-d7a1-4036-b692-adb86bac8e6a.002.png)

- **Les Patrons de création** : fournissent des mécanismes de création d’objets, ce qui augmente la flexibilité et la réutilisation du code.
- **Les Patrons structurels** : expliquent comment assembler des objets et des classes en de plus grandes structures, tout en les gardant flexibles et efficaces.
- **Les Patrons comportementaux :** mettent en place une communication efficace et répartissent les responsabilités entre les objets.

![](Aspose.Words.f4ecc9be-d7a1-4036-b692-adb86bac8e6a.003.png)
# **DP Stratégie**
**Stratégie** est un patron de conception **comportemental(communication et responsabilités entre les objets)** qui permet de **définir une famille d’algorithmes**, de les mettre dans **des classes séparées** et de rendre leurs **objets interchangeables**.
















**Diagramme UML:**

![](Aspose.Words.f4ecc9be-d7a1-4036-b692-adb86bac8e6a.004.png)

**caractéristiques du modèle de stratégie:**

- Il définit une famille d'algorithmes.
- Il encapsule chaque algorithme.
- Cela rend les algorithmes interchangeables au sein de cette famille.

La stratégie permet à l'algorithme de varier indépendamment des clients qui l'utilisent.					

Il y a trois participants dans le DP strategy. 

**La stratégie** déclare une interface commune à tous *les algorithmes pris en charge*. 

**Context** utilise cette interface pour appeler l'algorithme défini par une stratégie concrète. 

**La stratégie concrète** implémente l'algorithme à l'aide de Strategy Interface. Le contexte est configuré avec un objet Concret Strategy ; 

maintient une référence à un objet stratégique ; 

peut définir une interface permettant à la stratégie d'accéder à ses données.


**Example:**
sorting algos


