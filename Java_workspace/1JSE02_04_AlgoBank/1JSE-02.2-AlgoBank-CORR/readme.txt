1JSE-02.2-AlgoBank

1/ Thème
-------------
Créer des méthodes/algorithmie (boucles, tests, calculs)
Générer la JavaDoc
Manipuler les nombres à virgule

2/ Todo
-------------
je place de l'argent (10000) à 3%. Je retire au bout de 4 ans, combien la banque me verse? Quel est mon bénéfice?

Nota: cloturer un compte provoque une pénalité de 100€


3/ Aide
-------
créer plusieurs méthodes (rajout du mot clé static [car main est static])

4/ Notice d'install Javadoc
--------------------------
	 On appelle Javadoc l'outil qui génère la documentation du logiciel.
				
	 L'outil Javadoc ne prend pas en compte les commentaires du code s'ils sont déclarés ainsi :
			// commentaire sur une ligne
			/* commentaire sur
			plusieurs lignes */
		
		 Par contre :
			/**
			* Ceci est
			* un commentaire
			*Javadoc.
			*/
		Il doit être écrit sur la ligne immédiatement au-dessus du nom de la classe, de la méthode, ou de la variable concernée.
		
			
	 Les tags :
		En saisissant juste le 1er caractère "@" Eclipse propose la liste des tags disponibles.                            
		Il existe traditionnellement 9 principaux tags permettant de détailler des informations:
		@see : est un des tags les plus usités : il renvoie à  une autre classe/ méthode via un lien hypertexte.
		@param : (obligatoire si la méthode contient des paramètres) renseigne le ou les paramètre(s) de la méthode (le type est inclus automatiquement).
		@return : (obligatoire si la méthode contient des paramètres) renseigne l'objet retourné.
		@throws : indique la présence d'une exception dont il faut préciser le type et la raison.
		@author et @version : renseignent le ou les auteur(s) et le numéro de version d'une classe ou d'une interface (et non d'une méthode).
		@since : indique depuis quelle version de la classe existe une méthode, un paramètre.
		@deprecated : renseigne d'une part depuis quelle version la classe ou la méthode est dépréciée et d'autre part la classe ou méthode alternative à  utiliser.
		@serial : ce tag ne sera pas présenté ici car ne fait pas l'unanimité.

	---> Dans Eclipse pour générer la JavaDoc, faire:
	Project/Generate JavaDoc (pointer alors sur le bon exe :
	bin/javadoc.exe dans le dossier d'install Java)
			


5/ Bilan
----------------
	• on peut faire (beaucoup) mieux! (static à éviter, pas conforme aux archi MVC, ...)