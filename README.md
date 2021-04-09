# dao2_v4

Dernière modification --> Const.java : 


Modification des vitesses de base / tailles vaisseaux

<pre><code class="java">
 public static final int[][] TAILLE_VAISSEAUX={{1,2,3},{3,4,4},{5,8,5},{9,20,5},{21,50,5},
         {51,100,6},{101,200,6},{201,500,7},{501,1000,7},{1001,1000000,6}};
</code></pre>

|_.Taille Vaisseau|_.Nombre de Cases(max)|
| 1 | 2 |
| 2 | 4 |
| 3 | 8 |
| 4 | 20 |
| 5 | 50 |
| 6 | 100 |
| 7 | 200 |
| 8 | 500 |
| 9 | 1000 |
| 10 | 1000000 |

Modification du taux d'explosion de moteur 1% --> 10%
 public static final int CHANCE_EXPLOSION_MOTEUR=10;
// public static final int CHANCE_EXPLOSION_MOTEUR=1; -- Origin
  //le pourcentage de chance pour qu'un moteur explose quand il est touché.
