# design-patterns

﻿![](Aspose.Words.f4ecc9be-d7a1-4036-b692-adb86bac8e6a.001.png)

GOF“Gang of Four” : refers to the four authors of the book – Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides.

Voici une carte décrivant l'étendue de la conception et de l'architecture des logiciels, du code propre  :

𝟭. 𝗖𝗹𝗲𝗮𝗻 𝗰𝗼𝗱𝗲

La toute première étape vers la création de logiciels durables consiste à comprendre comment écrire un code propre. Écrire du code propre signifie écrire un code significatif et cohérent. S ' assurer que tous les tests passent, avoir des convetions de code gode, etc.

𝟮. 𝗣𝗿𝗼𝗴𝗿𝗮𝗺𝗺𝗶𝗻𝗴 𝗣𝗮𝗿𝗮𝗱𝗶𝗴𝗺𝘀

Il serait bon de comprendre certains des principaux paradigmes de programmation, tels que : La programmation OO, la programmation fonctionnelle et la programmation structurée.

𝟯. 𝗢𝗯𝗷𝗲𝗰𝘁-𝗼𝗿𝗶𝗲𝗻𝘁𝗲𝗱 𝗽𝗿𝗼𝗴𝗿𝗮𝗺𝗺𝗶𝗻𝗴

La POO est livrée avec les 4 principes de la POO (encapsulation, héritage, polymorphisme et abstraction) qui nous aident à créer des modèles de domaine riches. Il est important de le comprendre, car si vous pouvez créer un modèle mental d'une entreprise, vous pouvez créer une implémentation logicielle de cette entreprise.

𝟰. 𝗗𝗲𝘀𝗶𝗴𝗻 𝗣𝗿𝗶𝗻𝗰𝗶𝗽𝗹𝗲𝘀

Les principes de conception sont vraiment des bonnes pratiques orientées objet bien établies et éprouvées au combat que vous utilisez comme garde-fou. En voici quelques exemples : La composition plutôt que l'héritage, Encapsuler ce qui varie, Programmer contre les abstractions et non contre l'implémentation, etc.

𝟱. 𝗗𝗲𝘀𝗶𝗴𝗻 𝗣𝗮𝘁𝘁𝗲𝗿𝗻𝘀

Il existe 3 catégories de design patterns : créatif, structurel et comportemental. Apprenez-les très bien.

𝟲. 𝗔𝗿𝗰𝗵𝗶𝘁𝗲𝗰𝘁𝘂𝗿𝗮𝗹 𝗣𝗿𝗶𝗻𝗰𝗶𝗽𝗹𝗲𝘀

Nous comprenons maintenant que les décisions que nous prenons pour organiser et construire les relations entre les composants de haut niveau et de bas niveau, auront un impact significatif sur la maintenabilité, la flexibilité et la testabilité de notre projet. Apprenez les principes directeurs qui vous aident à construire la flexibilité dont votre base de code a besoin pour pouvoir réagir aux nouvelles fonctionnalités et exigences.

𝟳. 𝗔𝗿𝗰𝗵𝗶𝘁𝗲𝗰𝘁𝘂𝗿𝗮𝗹 𝗦𝘁𝘆𝗹𝗲𝘀

Il s'agit d'identifier ce dont un système a besoin pour réussir, puis d'empiler les chances de réussite en choisissant l'architecture qui correspond le mieux aux exigences. Par exemple, un système dont la logique métier est très complexe bénéficiera de l ' utilisation d ' une architecture en couches pour encapsuler cette complexité.

𝟴. 𝗔𝗿𝗰𝗵𝗶𝘁𝗲𝗰𝘁𝘂𝗿𝗮𝗹 𝗽𝗮𝘁𝘁𝗲𝗿𝗻𝘀

Ils expliquent avec plus de détails tactiques comment mettre en œuvre concrètement l'un de ces styles architecturaux. Voici quelques exemples : Conception pilotée par le domaine, MVC, etc.

Traduit avec www.DeepL.com/Translator (version gratuite)

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


