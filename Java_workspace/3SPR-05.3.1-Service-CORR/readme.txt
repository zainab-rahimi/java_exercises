SigmaWeb 2022-TD Spring: 3SPR-05.3-Service
------------------------------------------------------------------------------

1/ Thème
-------------------
La couche Service/Les annotations/L'injection de dépendances 

2/ Todo
-------------
Pour moi, un plat c'est: un nom, une catégorie (entrée/dessert/plat résistance), un pays, un coût (ex: Paella, plat, Espagne, 15)
Je suis nul en cuisine, je fais appel à un service.
Rajouter au prix final un coût de livraison de 5 €, celui-ci est lui-aussi un service (Livraison) 
(Au total ma note sera de 20)

3/ Détail
Un Contrôleur, un Service(+celui de la livraison), une Entity (veiller à correctement les nommer)
- l'entity n'appelle pas Spring
- Le service (qui donc fournit le plat) est annoté @Service (il sera récupérable dans le contrôleur)
- Le contrôleur appelle Spring, on peut utiliser cet appel pour prendre en compte Spring (au lieu d'un fichier XML):
	    public static void main(String[] args) {
	    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BookController.class);
	    	<maClasseController> bean = ctx.getBean(<maClasseController>);
- Attention à ne pas oublier cette annotation dans le contrôleur
@ComponentScan(basePackages="<monPackage où chercher mon Service")
- l'injection du service dans le contrôleur se fait avec une autre annotation:
@Autowired

4/ But recherché: 
ne pas faire un: new Service() dans le contrôleur, bénéficier de l'injection de service, le but étant par contre de récupérer le meilleur plat!
