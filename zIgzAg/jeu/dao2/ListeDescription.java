// v2.00 01/02/01
// Copyright 2001 Julien Buret All Rights Reserved.
// Use is subject to license terms.

package zIgzAg.jeu.oceane;



public class ListeDescription extends MessagesAbstraits{

 public static final Description laser=new Description("laser","lasers","Cette arme vous permettra de concevoir des plans de vaisseaux plus efficaces.");
 public static final Description plasma=new Description("canon � plasma","canons � plasma","Cette arme vous permettra de concevoir des plans de vaisseaux plus efficaces.");
 public static final Description torp=new Description("lance-torpille","lance-torpilles","Cette arme vous permettra de concevoir des plans de vaisseaux plus efficaces.");
 public static final Description miss=new Description("missile","missiles","Cette arme vous permettra de concevoir des plans de vaisseaux plus efficaces.");

 public static final Description bombe=new Description("bombe","bombes","Cette arme vous permettra de concevoir des plans de vaisseaux plus efficaces.");

 public static final Description moteur=new Description("r�acteur","r�acteurs","Un r�acteur permet � un vaisseau de se d�placer � la vitesse classique de base �gale � 6, auquel on ajoute le bonus de la caract�ristique &quot;Propulsion&quot; du r�acteur.");
 public static final Description intra=new Description("r�acteur intragalactique","r�acteurs intragalactiques","Un r�acteur intragalactique est un composant de vaisseau.<br>Il permet au vaisseau qui en poss�de un de se d�placer instantan�ment d'un point � l'autre de la galaxie.");
 public static final Description inter=new Description("r�acteur intergalactique","r�acteurs intergalactiques","Un r�acteur intergalactique est un composant de vaisseau.<br>Il permet au vaisseau qui en poss�de un de se d�placer instantan�ment d'une galaxie � une autre, sans passer par une porte galactique.");

 public static final Description scan=new Description("scanner","scanners","Un scanner est un composant de vaisseau.<br> Le scanner permet d'apercevoir des syst�mes � une distance �gale � sa caract�ristique &quot;Port�e scanner&quot;.");
 public static final Description bouclier=new Description("bouclier","boucliers","Un bouclier est un composant de vaisseau.<br> Un bouclier permet de parer un nombre de dommages �gal � sa capacit� &quot;Capacit� bouclier magn�tique&quot; et se r�g�n�re apr�s le combat. <br> Il ne peut pas y avoir plus de 10 boucliers par vaisseau.");
 public static final Description lmine=new Description("lanceur de mines AM","lanceurs de mines AM","Un lanceur de mines est un composant de vaisseau.<br>Un lanceur de mine permet de lancer un nombre de mines anti-mati�re classiques par tour �gal � sa caract�ristique &quot;Lanceur de mines&quot;.");
 public static final Description dmine=new Description("d�tecteur de mines","d�tecteurs de mines","Un d�tecteur de mines est un composant de vaisseau.<br>Un d�tecteur de mines permet au vaisseau qui en poss�de un d'�viter tout d�g�t d� � des mines lors d'un tour avec un pourcentage de chance �gal � sa caract�ristique &quot;D�tection de mines&quot;. Plusieurs d�tecteurs de mines sur un m�me vaisseau n'ont pas d'effets cumulatifs.");
 //public static final Description mconstru=new Description("module de construction","modules de construction","Un module de construction est un composant de vaisseau.<br>Un module de construction permet de disposer d'un nombre de points de construction par tour dans l'espace pour construire des vaisseaux �gal � la caract�ristique &quot;Potentiel navire usine&quot;. Il ne peut pas y avoir plus d'un module de construction par vaisseau.");
 public static final Description bscan=new Description("brouilleur radar","brouilleurs radars","Un brouilleur radar est un composant de vaisseau.<br>un brouilleur radar a un pourcentage de chance �gal � sa caract�ristique &quot;Brouillage radar&quot; de rendre la flotte du vaisseau invisible aux radars ce tour-ci.<br> Plusieurs brouilleurs radars n'ont pas d'effets cumulatifs : c'est le brouillage le plus puissant qui est pris en compte pour la flotte .");
 public static final Description tract=new Description("rayon tracteur","rayons tracteur","Un rayon tracteur est un composant de vaisseau<br>Il permet de r�cup�rer des containers de marchandises perdus par des vaisseaux ennemis d�truits au cours du combat. Pour qu'un rayon tracteur ait une utilit�, il est n�cessaire que des vaisseaux dans la m�me flotte poss�dent des soutes cargos pour pouvoir stocker les marchandises r�cup�r�es.");
 public static final Description cargo=new Description("cargo","cargos","Un cargo est un composant de vaisseau.<br>Un cargo permet de stocker un nombre d'unit�s de marchandises �gal � sa caract�ristique &quot;Capacit� cargo&quot;.");
 public static final Description ville=new Description("ville spatiale","villes spatiales","Une ville spatiale est un composant de vaisseau.<br>une ville spatiale est un espace de vie pour un nombre d'unit�s de population �gal � sa caract�ristique &quot;Capacit� ville spatiale&quot;.");
 public static final Description roboco=new Description("robot colonisateur","robots colonisateurs","Un robot colonisateur est un composant de vaisseau.<br>Un robot colonisateur permet d'explorer une plan�te pour voir si elle peut �tre habit�e par des membres de la race de l'�quipage.");
 public static final Description hscan=new Description("hyper-scanner","hyper-scanners","Un hyper-scanner est un composant de vaisseau.<br> Ce scanner permet d'apercevoir des flottes � une distance �gale � sa caract�ristique &quot;Port�e scanner&quot;.");
 public static final Description dramin=new Description("dragueur de mines","dragueurs de mines","Un dragueur de mines est un composant de vaisseau.<br>Il permet de d�sactiver un nombre de mines ou de d�bris diverses par tour �gal � sa caract�ristique &quot;Capacit� dragueur mines&quot;.<br>Un vaisseau dont la moiti� ou plus de ses composants sont des dragueurs de mines ne peut pas subir de dommages d�s aux mines.");

  //les batiments -->

 public static final Description chantier=new Description("chantier naval","chantiers navals","Le chantier naval permet de construire des vaisseaux spatiaux � partir du syst�me qui en poss�de.<br>Il permet �galement de r�parer 20 points de d�gats par tour pour une flotte.");
 public static final Description mine=new Description("mine","mines","Une mine procure un revenu en minerai en fonction de la plan�te sur laquelle elle est construite.");
 public static final Description retraite=new Description("usine de retraitement","usines de retraitement","Une usine de retraitement permet de r�cup�rer du minerai en d�truisant des constructions plan�taires sur la plan�te sur laquelle elle est pr�sente.");
 public static final Description optp=new Description("usine d'optimisation plan�taire","usines d'optimisation plan�taires","Une usine d'optimisation plan�taire permet d'augmenter de 1 pt par usine construite le nombre de points de construction du syst�me.");
 public static final Description opts=new Description("usine d'optimisation spatiale","usines d'optimisation spatiales","Une usine d'optimisation spatiale permet d'augmenter de 2 pt par usine construite le nombre de points de construction du syst�me.");
 public static final Description repare=new Description("centre de r�paration spatial","centres de r�paration spatiaux","Un centre de r�paration spatial permet de renflouer les flottes endommag�es qui orbitent autour du syst�me, � raison de 100 points par tour.");
 public static final Description boucpla=new Description("bouclier plan�taire","boucliers plan�taires","Un bouclier plan�taire procure une protection efficace en cas d'attaque de la plan�te.<br>Les attaquants doivent d'abord le d�truire avant de pilonner la population et les �ventuelles constructions de d�fense.");
 public static final Description agro=new Description("complexe agro-alimentaire","complexes agro-alimentaires","Un complexe agro-alimentaire procure 10 unit�s de produits alimentaires par tour.");
 public static final Description agricole=new Description("usine agricole","usines agricoles","Une usine agricole procure 10 unit�s de materiel agricole par tour.");
 public static final Description mode=new Description("centre de mode","centres de mode","Un centre de mode procure 10 unit�s de produits de luxe par tour.");
 public static final Description culturel=new Description("centre culturel","centres culturels","Un centre culturel procure 10 unit�s de holofilms et hololivres par tour.");
 public static final Description energie=new Description("centrale �nerg�tique","centrales �nerg�tiques","Une centrale �nerg�tique procure 10 unit�s d'�nergie par tour.");
 public static final Description pharma=new Description("laboratoire pharmaceutique","laboratoires pharmaceutiques","Un laboratoire pharmaceutique procure 10 unit�s de m�dicaments par tour.");
 public static final Description info=new Description("soci�t� informatique","soci�t�s informatiques","Une soci�t� informatique procure 10 unit�s de logiciels par tour.");
 public static final Description robot=new Description("usine de robotique","usines de robotique","Une usine de robotique procure 10 unit�s de robots par tour.");
 public static final Description techno=new Description("technocentre","technocentres","Un technocentre procure 10 unit�s de composants �lectroniques par tour.");
 public static final Description arme=new Description("usines d'armement","usines d'armement","Une usine d'armement procure 10 unit�s d'armement et d'explosif par tour.");
 public static final Description raffine=new Description("raffinerie","raffineries","Une raffinerie procure 10 unit�s de carburant par tour.");
 public static final Description lourde=new Description("industrie lourde","industries lourdes","Une centre industriel procure 10 unit�s de pi�ces industrielles par tour.");
 public static final Description metaux=new Description("usine d'enrichissement des m�taux","usines d'enrichissement des m�taux","Une usine d'enrichissement des m�taux procure 10 unit�s de m�taux pr�cieux par tour.");
 public static final Description radar=new Description("radar","radars","Un radar permet de d�tecter les flottes et les syst�mes qui se trouvent au plus � une distance �gale � sa caract�ristique &quot;Port�e radar&quot;.");
 public static final Description extra=new Description("usine d'extraction avanc�e","usines d'extraction avanc�e","Une usine d'extraction avanc�e permet de rajouter une capacit� �gale � sa caract�ristique &quot;Capacit� extraction avanc�e&quot; au potentiel de production de minerai de la plan�te. Il ne peut pas y avoir plus d'une usine d'extraction utile par plan�te.");

 public static final Description battla=new Description("batterie de lasers","batteries de lasers","Une batterie laser permet de mieux d�fendre la plan�te sur laquelle elle est construite.");
 public static final Description battpla=new Description("batterie de plasmas","batteries de plasmas","Une batterie plasma permet de mieux d�fendre la plan�te sur laquelle elle est construite.");
 public static final Description rampemis=new Description("rampe de missiles","rampes de missiles","Une rampe de missile permet de mieux d�fendre la plan�te sur laquelle elle est construite.");
 public static final Description lancetor=new Description("lance-torpilles","lances-torpilles","Un lance-torpilles permet de mieux d�fendre la plan�te sur laquelle il est construit.");

 public static final Description gravit=new Description("Module de gravit�","modules de gravit�","Le module de gravit� permet de modifier la gravit� d'une plan�te lors d'une terraformation.");
 
    //technologies simples -->

 public static final Description stratco=new Description("ma�trise du combat","","La connaissance de cette technologie permet de cr�er des strat�gies de combat pour ses flottes.");
 public static final Description diplo=new Description("ma�trise de la diplomatie","","La connaissance de cette technologie permet de cr�er des alliances.");
 public static final Description creplan=new Description("ma�trise de l'ing�nierie","","La connaissance de cette technologie permet de cr�er des plans de vaisseaux.");
 public static final Description progco=new Description("ma�trise de la planification","","La connaissance de cette technologie permet d'ordonner � un syst�me de construire un type de b�timent.<BR>Le syst�me g�rera ensuite lui-m�me le lancement des constructions.");
 public static final Description gestpla=new Description("ma�trise de la gestion","","La connaissance de cette technologie permet de d�truire des b�timents inutiles sur ses syst�mes et de modifier la taxation et la terraformation de plan�tes pr�cises, au lieu d'�tre oblig� de modifier toutes les plan�tes du syst�me en m�me temps.");

 }



